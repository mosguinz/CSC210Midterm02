public class Test {
    public static void main(String[] args) {
        Employee x = new Employee("Nancy");
        System.out.println(Employee.employeeCount);
        System.out.println(x.getEmployeeName());
    }
}

class Employee {
    static int employeeCount = 0;
    private String employeeName;

    Employee(String employeeName) {
        this.employeeName = employeeName;
        employeeCount++;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
}