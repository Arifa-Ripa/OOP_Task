package PracticeProblem_08;

class Employee{
    String name;
    int id;
    String dept;

    Employee(String name, int id, String dept){
        this.name = name;
        this.id = id;
        this.dept = dept;
    }

    public void calculatePay(){
        System.out.println("Salary : " + 0) ;
    }
}

class FullTimeEmployee extends Employee{
    double fixedSalary;
    FullTimeEmployee(String name, int id, String dept, double salary){
        super(name, id, dept);
        this.fixedSalary = salary;
    }

    @Override
    public void calculatePay(){
        System.out.println("Name : " + name +  " Salary : " + fixedSalary) ;
    }

}

class PartTimeEmployee extends Employee{
    double hourlyRate;
    int hoursWorked;

    PartTimeEmployee(String name, int id, String dept, double hourlyRate, int hoursWorked){
        super(name, id, dept);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public void calculatePay(){
        System.out.println("Name : " + name +  " Salary : " + hoursWorked * hourlyRate);
    }
}

class ContractEmployee extends Employee{
    String projectName;
    double contractAmount;

    ContractEmployee(String name, int id, String dept, String projectName, double contractAmount){
        super(name, id, dept);
        this.projectName = projectName;
        this.contractAmount = contractAmount;
    }

    public void calculatePay(){
        System.out.println("Name : " + name +  " Salary : " + contractAmount);
    }
}

public class task_a {
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("xyz", 0123, "management", 20000.45);
        fullTimeEmployee.calculatePay();

        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("abc", 6788, "testing", 5.3, 8);
        partTimeEmployee.calculatePay();

        ContractEmployee contractEmployee = new ContractEmployee("pqr", 4568, "development", "Developing UI", 150000.00);
        contractEmployee.calculatePay();
    }
}
