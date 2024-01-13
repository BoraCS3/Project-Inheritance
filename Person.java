package abstract_person;
public abstract class Person {
    protected int id, age;
    protected String name, gender;
    public Person(int id, int age, String name, String gender){
        this.id  = id ;
        this.age = age;
        this.name = name;
        this.gender = gender;
    }
    public abstract double TotalSalary();
    public abstract String Header();
}
