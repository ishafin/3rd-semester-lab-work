class Manager extends Employee {
    String department;


    Manager(String name, double salary, String department) {
        super(name, salary);  // Call Employee constructor
        this.department = department;
    }


    @Override
    void showDetails() {
        System.out.println("Manager Name: " + name);
        System.out.println("Salary: ₹" + salary);
        System.out.println("Department: " + department);
    }
}