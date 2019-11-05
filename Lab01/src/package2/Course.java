package package2;

public class Course {
    String title;
    String description;
    Student[] students;

    void setStudents(Student[] students) {
        this.students = students;
    }

    Student[] filterYear(int year) {
        int count = 0, k = 0;

        // How many students born in year?
        for (int i = 0; i < students.length; ++i) {
            if (students[i].getYear() == year) {
                ++count;
            }
        }

        // Creating the resulting object
        Student[] results = new Student[count];

        for (int i = 0; i < students.length; ++i) {
            if (students[i].getYear() == year) {
                results[k++] = students[i];
            }
        }

        return results;
    }
}
