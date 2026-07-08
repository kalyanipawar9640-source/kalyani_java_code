//8. Employee Bonus System A company gives yearly bonuses to employees.
//Create a class Employee with private variables: employeeName salary
//yearsOfService Bonus rules:
//>= 10 years → 20% bonus
//>= 5 years → 10% bonus
//else → 5% bonus
//Calculate and display final salary with bonus.

class Employee {
    private String employeeName;
    private double salary;
    private int yearsOfService;

    // Setter
    public void setData(String name, double sal, int years) {
        employeeName = name;
        salary = sal;
        yearsOfService = years;
    }

    // Getter
    public double getFinalSalary() {
        double bonus;

        if (yearsOfService >= 10)
            bonus = salary * 20 / 100;
        else if (yearsOfService >= 5)
            bonus = salary * 10 / 100;
        else
            bonus = salary * 5 / 100;

        return salary + bonus;
    }

    public void display() {
        System.out.println("Employee Name : " + employeeName);
        System.out.println("Final Salary : " + getFinalSalary());
    }

    public static void main(String[] args) {
        Employee e = new Employee();

        e.setData("Kalyani", 50000, 6);

        e.display();
    }
}