
package abstract_person;

public class Staff extends Person {
    protected double salary, bonus;
    public Staff(int id, int age, String name, String gender, double salary, double bonus){
        super(id, age, name, gender);
        this.salary = salary;
        this.bonus = bonus;
    }
    @Override
    public double TotalSalary(){
        return salary + bonus;
    }
    @Override
    public String Header(){
        return "ID\tName\tAge\tGender\tSalary\tBonus\tTotalsalary";
    }
}
