class Student {
    String name;
    String surname;
    int year;
   long enroll;

    public Student(String name, String surname, int year,long enroll) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.enroll = enroll;
    }

    public static Student function(String name, String surname, int year, long enroll) {
        return new Student(name, surname, year, enroll);
    }
}

public class Gmail {
    public static void main(String[] args) {
        Student s1 = new Student("Ashish","Kumar",22, 309);
        System.out.println(s1.name + "" + s1.surname + "" + s1.year + "0" + s1.enroll + "@acropolis.in");
    }
}