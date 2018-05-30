import java.util.ArrayList;

public class Cohort {
        String cohortName;
        ArrayList<Student> students;
        ArrayList<Mentor> mentors;

        public Cohort(String className) {
            this.cohortName = className;
            this.students = new ArrayList();
            this.mentors = new ArrayList();
        }

        public void addStudent(Student student) {
            this.students.add(student);
        }

        public void addMentor(Mentor mentor) {
            this.mentors.add(mentor);
        }

        public void info() {
            System.out.println("The " + this.cohortName + " class has " + this.students.size() + " students and " + this.mentors.size() + " mentors. ");
        }

    }

