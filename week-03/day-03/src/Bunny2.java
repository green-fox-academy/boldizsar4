public class Bunny2 {
    public static void main(String[] args) {
        int earCounter = monsterBunnies(15);
        System.out.println(earCounter);
    }

    private static int monsterBunnies(int bunnies) {
        int normalEars = 2;
        int irrealEars = 3;
        if (bunnies == 0){
            return 0;
        } else if (bunnies % 2 == 0) {
            return irrealEars + monsterBunnies(bunnies-1);
        } else {
            return normalEars + monsterBunnies(bunnies - 1);
        }
    }
}
// We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies
// (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say
// have 3 ears, because they each have a raised foot. Recursively return the
// number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).