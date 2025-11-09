public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("Mohammad Shafin", 101);
        Employee.Salary sal = emp.new Salary(40000, 8000, 3000);
        Employee.JoiningDate join = emp.new JoiningDate(15, 7, 2022);
        emp.displayEmployee(sal, join);
    }
}
