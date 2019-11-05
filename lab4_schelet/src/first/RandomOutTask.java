package src.first;

import java.util.Random;

public class RandomOutTask implements first.Task {
    int random;

    public RandomOutTask() {
        random = getRandomNumberInRange(1,100);
    }

    private static int getRandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    @Override
    public void execute() {
        System.out.println(random);
    }
}
