public class Flowers extends Plants {

  public Flowers(String color) {
    super.setColor(color);
    super.setIdealWaterNeed(5);
    super.ABSORBED_WATER_PERCENT = 75;
  }

  @Override
  public void watering(int amountOfWater) {
    setCurrentWaterAmount((amountOfWater * ABSORBED_WATER_PERCENT) / 100);
  }
}