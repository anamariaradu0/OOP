package package2;

public class Student {
    String name;
    int year;

    // Constructor
    Student(String name, int year) {
        this.name = name;
        this.year = year;
    }

    int getYear() { return year; }
    String getName() { return name; }

    public boolean equals(Object obj) {
        if(!(obj instanceof Student)) {
            return false;
        }

        Student s = (Student) obj;
        return s.name.equals(this.name) && s.year == this.year;
    }

}
