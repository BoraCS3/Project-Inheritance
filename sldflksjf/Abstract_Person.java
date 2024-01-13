package abstract_person;
import java.util.Scanner;
public class Abstract_Person {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int id, age;
        String name, gender;
        double salary, rate, hour,bonus;
        System.out.println("Enter ID: ");
        id = input.nextInt();
        System.out.println("Enter name: ");
        name = input.next();
        System.out.println("Enter age: ");
        age = input.nextInt();
        System.out.println("Enter gender: ");
        gender = input.next();
        System.out.println("Enter Salary: ");
        salary = input.nextDouble();
        System.out.println("Enter rate: ");
        rate = input.nextDouble();
        System.out.println("Enter hour: ");
        hour = input.nextDouble();
        StaffIT per = new StaffIT(id, age, name, gender, salary, rate, hour);
        System.out.println(per.Header());
        System.out.println(per.id+"\t"+per.name+"\t"+per.age+"\t"+per.gender+"\t"+per.rate+"\t"+per.hour+"\t"+per.salary+"\t"+per.TotalSalary());
    }
    
}
