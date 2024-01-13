
package abstract_person;

public class StaffIT extends Person {
    protected double salary;
    protected double rate, hour;
    public StaffIT(int id, int age, String name, String gender, double salary, double rate, double hour){
        super(id, age, name, gender);
        this.salary = salary;
        this.rate = rate;
        this.hour = hour;
    }
    @Override
    public double TotalSalary(){
        return salary + (rate * hour);
    }
    @Override
    public String Header(){
        return "ID\tName\tAge\tGender\tRate\tHour\tSalary\tTotalsalary";
    }
}
