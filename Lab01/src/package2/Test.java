package package2;

public class Test {
    public static void main(String[] args) {
        Student a = new Student("Ana", 2000);
        Student b = new Student("Mike", 2001);
        Student c = new Student("John", 2002);
        Student d = new Student("Sally", 2001);
        Student e = new Student("Veronica", 2000);
        Student[] students = new Student[]{a,b,c,d,e};

        Course course = new Course();
        course.setStudents(students);

        int year = 2000;

        Student[] result = course.filterYear(year);
        for (int i = 0; i < result.length; ++i) {
            System.out.println(result[i].getName());
        }

        Student[] students2 = new Student[]{a,b,c,d,e};
        System.out.println(a.equals(e));
    }
}
