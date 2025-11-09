class Department extends Faculty {
    String departmentName;
    String chairman;

    Department(String universityName, int ranking, String facultyName, String departmentName, String chairman) {
        super(universityName, ranking, facultyName);
        this.departmentName = departmentName;
        this.chairman = chairman;
    }

    void Details() {
        System.out.println("Department Name: " + departmentName);
        System.out.println("Chairman: " + chairman);
    }

    void Display() {
        super.Details();
        Details();
    }
}