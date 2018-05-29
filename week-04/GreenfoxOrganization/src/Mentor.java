
public class Mentor extends Person {
    String level;

    public Mentor() {
        this.level = "";
    }

    public Mentor(String name, int age, String gender, String level) {
        super(name, age, gender);
        this.level = level;
    }

    public void getGoal() {
        System.out.println("Educate brilliant junior software developers. ");
    }

    public void introduce() {
        System.out.println("Hi, I'm " + this.name + ", a " + this.age + "year old " + this.gender + this.level + "mentor. ");
    }
}