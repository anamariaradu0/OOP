package src;

import src.first.*;
import src.fourth.AbstractTaskRunner;
import src.fourth.PrintTimeTaskRunner;
import src.third.ContainerFactory;
import third.Strategy;
import src.fourth.CounterTaskRunner;
import src.fourth.RedoBackTaskRunner;

public class Main {

    private static final int TASK_NO = 6;

    private static first.Task[] taskList;

    private static void test1() {
        taskList = new first.Task[TASK_NO];

        taskList[0] = new OutTask("First message task");
        taskList[1] = new RandomOutTask();
        taskList[2] = new CounterOutTask();
        taskList[3] = new OutTask("Second message task");
        taskList[4] = new CounterOutTask();
        taskList[5] = new RandomOutTask();

        for (first.Task task : taskList) {
            task.execute();
        }
    }

    static private void testContainer(third.Strategy strategy) {
        second.Container container = ContainerFactory.INSTANCE.createContainer(strategy);

        for (first.Task task : taskList) {
            container.push(task);
        }

        System.out.println("Testing order: " + strategy.toString());

        while (!container.isEmpty()) {
            container.pop().execute();
        }

        System.out.println();
    }

    private static void test2_3() {
        testContainer(third.Strategy.LIFO);
        testContainer(third.Strategy.FIFO);
    }

    private static void testTaskRunner(AbstractTaskRunner taskRunner) {
        System.out.println("Testing: " + taskRunner);

        for (first.Task task : taskList) {
            taskRunner.addTask(task);
        }

        taskRunner.executeAll();

        System.out.println();
    }

    private static void test4_5() {
        testTaskRunner(new PrintTimeTaskRunner(third.Strategy.LIFO));

        CounterTaskRunner  counterTaskRunner = new CounterTaskRunner(Strategy.FIFO);

        testTaskRunner(counterTaskRunner);
        System.out.println("#Executed tasks: " + counterTaskRunner.getCounter());

        RedoBackTaskRunner  redoTaskRunner = new RedoBackTaskRunner(Strategy.LIFO);

        testTaskRunner(redoTaskRunner);
        System.out.println("Reexecuting: ");
        redoTaskRunner.redo();
    }

    public static void main(String[] args) {
        test1();
        System.out.println("------\tTEST EX 1 FINISHED\t------");

        test2_3();
        System.out.println("------\tTEST EX 2 SI EX 3 FINISHED\t------");

        test4_5();
        System.out.println("------\tTEST EX 4 SI EX 5 FINISHED\t------");
    }
}