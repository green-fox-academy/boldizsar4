public class App {
  public static void main(String[] args) {
    Trees aTree = new Trees("blue");
    Trees anotherTree = new Trees("green");
    Flowers aFlower = new Flowers("yellow");
    Flowers anotherFlower = new Flowers("pink");
    Garden myGarden = new Garden();
    myGarden.addPlant(aTree);
    myGarden.addPlant(anotherTree);
    myGarden.addPlant(aFlower);
    myGarden.addPlant(anotherFlower);

    myGarden.getGardenStatus();
    System.out.println();
    myGarden.waterTheGarden(40);
    System.out.println();
    myGarden.getGardenStatus();
    System.out.println();
    myGarden.waterTheGarden(70);
    System.out.println();
    myGarden.getGardenStatus();
  }
}