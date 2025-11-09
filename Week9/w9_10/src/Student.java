class Student {

    int rollNo;
    String name;
    double marks;


    static String schoolName = "Green Valley High School";


    Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }


    static void changeSchoolName(String newName) {
        schoolName = newName;
    }


    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("School Name: " + schoolName);
        System.out.println("---------------------------");
    }
}