import java.util.Scanner;

class Member
{
    private String name;
    private int age;
    private long phoneNumber;
    private String address;
    private int salary;

    Member(String name, int age, long phoneNumber, String address, int salary)
    {
        this.name = name; //local variables
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }


    public void printSalary()
    {
        System.out.print("\nSalary :"+salary+"\n");
    }

    public void details()
    {
        System.out.print("\nName : "+name+"\nAge : "+age+"\nPhone Number : "+phoneNumber+"\nAddress : "+address+" ");
    }

}

class Employee extends Member
{
    private String specialization;
    private String department;


    Employee(String name, int age, long phoneNumber, String address, int salary, String specialization, String department) {
        super(name, age, phoneNumber, address, salary);
        this.specialization = specialization;
        this.department = department;
    }
}

class Manager extends Member
{
    String specialization;
    String department;

    Manager(String name, int age, long phoneNumber, String address, int salary, String specialization, String department) {
        super(name, age, phoneNumber, address, salary);
        this.specialization = specialization;
        this.department = department;
    }
}
public class employeeManager {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Employee details : \n");
        String name = " ";
        int age = 0;
        long phoneNumber = 0;
        String address = " ";
        int salary = 0;
        String specialization = " ";
        String department = " ";


        for(int i = 0; i < 2; i++)
        {
            System.out.println("Enter the Name : ");
            name = sc.next();
            System.out.println("Enter the Age : ");
            age = sc.nextInt();
            System.out.println("Enter the Phone Number : ");
            phoneNumber = sc.nextLong();
            System.out.println("Enter the Address :");
            address = sc.next();
            System.out.println("Enter the Salary : ");
            salary = sc.nextInt();
            System.out.println("Enter the Specialization : ");
            specialization = sc.next();
            System.out.println("Enter the Department : ");
            department = sc.next();
        }


        System.out.println("Employee Details : ");
        Employee employee = new Employee(name,age, phoneNumber,address,salary,specialization,department);

        System.out.println("Manager Details : ");
        Manager manager = new Manager(name,age, phoneNumber,address,salary,specialization,department);

        employee.details();
        employee.printSalary();

        manager.details();
        manager.printSalary();
    }

}
