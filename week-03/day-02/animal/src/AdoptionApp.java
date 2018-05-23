public class AdoptionApp {
    public static void main(String[] args) {
        Dog dog = new Dog("Furkész", "Swiss shepard",2);
        Dog dog2 = new Dog("Mano", "mix", 2);
        Dog dog3 = new Dog("Mano", "mix", 2);
        Shelter shelter = new Shelter("illatos út");
        shelter.dogs.add(dog);
        shelter.dogs.add(dog2);
        Person person = new Person("John");
        shelter.adopt(person,dog);
        System.out.println(shelter.adopt(person,dog));
        shelter.adopt(person,2);

        System.out.println(dog);
    }
}
