import java.util.Scanner;
class Employee {
String name;
int age;
int phoneno;
String address; 
Employee(String name, int age, int phoneno, String address)
{
 this.name = name;
 this.age = age;
 this.phoneno = phoneno;
 this.address = address;
}
void printSalary(int salary)
{
    System.out.println("Salary: " + salary);
}
}
class Officer extends Employee
{
 String Specialization;
 Officer(String name, int age, int phoneno, String address, String Specialization)
 {
   super(name, age, phoneno, address);
   this.Specialization = Specialization;
 }
 void printSalary(int salary)
{
    System.out.println("Salary: "+salary+"\n");
}
}
class Manager extends Employee
{
 String department;
 Manager(String name, int age, int phoneno, String address, String department)
 {
   super(name, age, phoneno, address);
   this.department = department;
 }
 void printSalary(int salary)
{
    System.out.println("Salary: "+salary+"\n");
}
}

public class emp{
        public static void main(String[] args){
            Scanner s = new Scanner(System.in);
            System.out.println("Officer Details");
            System.out.println("enter name");
            String na = s.nextLine();
            System.out.println("enter age");
            int a = s.nextInt();
            System.out.println("enter phone number");
            int n = s.nextInt();
            System.out.println("enter address");
            String ad = s.nextLine();
            String ad3 = s.nextLine();
            System.out.println("enter specialization");
            String sp = s.nextLine();            
            Officer o = new Officer(na, a, n, ad, sp );
            System.out.println("enter salary of the officer");
            int sal = s.nextInt();
            o.printSalary(sal);
            System.out.println("\n");
            System.out.println("Manager Details");
            System.out.println("enter name");
            String na1 = s.nextLine();
              String ad4 = s.nextLine();
            System.out.println("enter age");
            int a1 = s.nextInt();
            System.out.println("enter phone number");
            int n1 = s.nextInt();
            System.out.println("enter address");
            String ad1 = s.nextLine();
            String ad2 = s.nextLine();
            System.out.println("enter department");
            String dep = s.nextLine();            
            Manager m = new Manager(na1, a1, n1, ad1, dep );
            System.out.println("enter salary of the officer");
            int sal1 = s.nextInt();
            m.printSalary(sal1);
            s.close();
    }
}
