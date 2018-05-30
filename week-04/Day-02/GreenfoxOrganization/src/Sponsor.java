
public class Sponsor extends Person {
    String company;
    int hiredStudents;

    public Sponsor(String name, int age, String gender, String company) {
        super(name, age, gender);
        this.hiredStudents = 0;
        this.company = company;
    }

    public Sponsor() {
        this.company = "Google ";
        this.hiredStudents = 0;
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I'm " + this.name + ", a " + this.age + " year old " + this.gender + "who represents "
                + this.company + "and hire " + this.hiredStudents + " students so far. ");
    }

    public void hire() {
        ++this.hiredStudents;
    }

    @Override
    public void getGoal() {
        System.out.println("Hire brilliant junior software developers. ");
    }
}
