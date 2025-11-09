class Employee {
    String empName;
    int empId;

    Employee(String empName, int empId) {
        this.empName = empName;
        this.empId = empId;
    }

    class Salary {
        double basic;
        double hra;
        double pf;

        Salary(double basic, double hra, double pf) {
            this.basic = basic;
            this.hra = hra;
            this.pf = pf;
        }

        void displaySalary() {
            System.out.println("Salary Details:");
            System.out.println("Basic: ₹" + basic);
            System.out.println("HRA: ₹" + hra);
            System.out.println("PF: ₹" + pf);
        }
    }

    class JoiningDate {
        int day;
        int month;
        int year;

        JoiningDate(int day, int month, int year) {
            this.day = day;
            this.month = month;
            this.year = year;
        }

        void displayJoiningDate() {
            System.out.println("Joining Date: " + day + "/" + month + "/" + year);
        }
    }

    void displayEmployee(Salary salary, JoiningDate joiningDate) {
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee ID: " + empId);
        salary.displaySalary();
        joiningDate.displayJoiningDate();
    }
}