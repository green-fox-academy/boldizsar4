public class Animal {
    int hunger;
    int thirst;

    public Animal(){
        hunger = 50;
        thirst = 50;
    }
    public int eat(){
        this.hunger--;
        return this.hunger;
    }
    public int drink() {
        this.thirst--;
        return this.thirst;
    }
    public int play() {
        this.hunger++;
        this.thirst++;
        return this.hunger + this.thirst;
    }

    public static void main(String[] args) {
        Animal dog = new Animal();
        Animal cat = new Animal();
        System.out.println(dog.hunger);
    }
}
