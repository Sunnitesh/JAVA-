import java.util.Scanner;
class Employee {
    int emp_id;
    String emp_name;
    double basic_salary, gross_salary;

    Employee(int id, String name, double salary) {
        emp_id = id;
        emp_name = name;
        basic_salary = salary;
    }

    void calculateGrossSalary() {
        double hra = 0.1 * basic_salary;
        double da = 0.15 * basic_salary;
        gross_salary = basic_salary + hra + da;
    }

    void display() {
        System.out.println("Employee ID: " + emp_id);
        System.out.println("Employee Name: " + emp_name);
        System.out.println("Gross Salary: " + gross_salary);
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee ID, Name, and Basic Salary:");
        int id = sc.nextInt();
        sc.nextLine();  // Consume newline
        String name = sc.nextLine();
        double salary = sc.nextDouble();

        Employee emp = new Employee(id, name, salary);
        emp.calculateGrossSalary();
        emp.display();
    }
}
