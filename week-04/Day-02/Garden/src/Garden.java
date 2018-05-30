import java.util.ArrayList;
import java.util.List;

public class Garden {
  private List<Plants> allMyPlants;

  public Garden() {
    allMyPlants = new ArrayList<>();
  }

  public void addPlant(Plants plant){
    allMyPlants.add(plant);
  }

  public void getGardenStatus(){
    for (int index = 0; index < allMyPlants.size(); index++) {
      allMyPlants.get(index).getStatus();
    }
  }

  public void waterTheGarden(int amountOfWater){
    List<Plants>thirstyPlants = new ArrayList<>();
    for (int index = 0; index < allMyPlants.size(); index++) {
      if (allMyPlants.get(index).getNeedWater()){
        thirstyPlants.add((allMyPlants.get(index)));
      }
    }
    int waterPerPlant = amountOfWater/thirstyPlants.size();
    for (int index = 0; index < thirstyPlants.size(); index++) {
      thirstyPlants.get(index).watering(waterPerPlant);
    }
    System.out.println("Garden watered with " + amountOfWater + " amount of water");

  }
}