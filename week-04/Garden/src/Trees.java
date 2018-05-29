public class Trees extends Plants {

  public Trees(String color) {
    super.setColor(color);
    super.setIdealWaterNeed(10);
    super.ABSORBED_WATER_PERCENT = 40;
  }
  @Override
  protected void watering(int amountOfWater) {
    setCurrentWaterAmount((amountOfWater * ABSORBED_WATER_PERCENT)/100);
  }
}