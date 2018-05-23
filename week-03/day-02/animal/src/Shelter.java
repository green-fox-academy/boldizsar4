import java.util.ArrayList;
import java.util.List;

public class Shelter {
    String name;
    List<Dog> dogs;

    public Shelter(String name) {
        this.name = name;
        dogs = new ArrayList<>();
    }
    public String adopt(Person person, Dog dog) {
        person.dog = dog;
        this.dogs.remove(dog);
        return dog.name + " got adopted by " + person.name;
    }
    public void adopt(Person person, int dogId) {
        Dog dog = getDogById(dogId);
        person.dog = dog;
        dogs.remove(dog);
    }
    private Dog getDogById(int dogId) {
        for (Dog dog : dogs) {
            if (dog.id == dogId) {
                return dog;
            }
        }
        return null;
    }
}
