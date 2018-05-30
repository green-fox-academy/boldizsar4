public class Student extends Person implements Cloneable {
    String previousOrganization;
    int skippedDays;
    int numberOfDays;

    public Student(String name, int age, String gender, String previousOrganization) {
        super(name, age, gender);
        this.skippedDays = 0;
        this.previousOrganization = previousOrganization;
    }

    public Student() {
        this.previousOrganization = "School of Life ";
        this.skippedDays = 0;
    }

    public void skipDays(int skippedDays) {
        this.skippedDays += this.numberOfDays;
    }

    @Override
    public void getGoal() {
        System.out.println("To become a junior software developer ");
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("Hi, I'm " + this.name + ", a " + this.age + " year old " + this.gender + " from " + this.previousOrganization + " who skipped " + this.skippedDays + " days from the course already. ");
    }
    @Override
    public Student clone() {
        Student cloneOf = this;
        return cloneOf;
    }
}