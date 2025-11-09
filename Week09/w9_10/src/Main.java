public class Main {
    public static void main(String[] args) {

        Student s1 = new Student(1, "Mohammad Shafin", 89.5);
        Student s2 = new Student(2, "Ayaan Khan", 92.0);
        Student s3 = new Student(3, "Sara Ali", 95.3);


        System.out.println("Before changing school name:");
        s1.display();
        s2.display();
        s3.display();


        Student.changeSchoolName("Blue Ridge Public School");


        System.out.println("After changing school name:");
        s1.display();
        s2.display();
        s3.display();
    }
}
