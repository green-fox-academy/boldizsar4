public class Dog {
    static int idCounter = 1;

    int id = 0;
    String breed;
    String name;
    int age;

    public Dog(){
        this("unknown");
    }
    public Dog(String breed) {
        this("Morzsi", breed,-1);
        this.name = "Morzsi";
        this.breed = breed;
        this.age = -1;
    }

    public Dog(String n, String breed, int age) {
        this.name = n;
        this.breed = breed;
        this.age = age;
        this.id = idCounter++;
    }

    @Override
    public boolean equals(Object obj) {
        Dog otherDog = (Dog) obj;
        return otherDog.name.equals(this.name)
                && otherDog.breed.equals(this.breed)
                && otherDog.age == this.age;
    }

    @Override
    public String toString() {
        return this.name + "," + this.breed + "," + this.age;
    }
}
