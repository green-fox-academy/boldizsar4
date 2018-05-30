public class Plants {

  protected int ABSORBED_WATER_PERCENT;
  private String color;
  private double currentWaterAmount;
  private int idealWaterNeed;
  private boolean needWater;

  public Plants() {
    currentWaterAmount = 0;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getColor() {
    return color;
  }

  public void setIdealWaterNeed(int idealWaterNeed) {
    this.idealWaterNeed = idealWaterNeed;
  }

  public int getIdealWaterNeed() {
    return idealWaterNeed;
  }

  public void setCurrentWaterAmount(double currentWaterAmount) {
    this.currentWaterAmount = currentWaterAmount;
  }

  public double getCurrentWaterAmount() {
    return currentWaterAmount;
  }

  public void getStatus() {
    System.out.println((getNeedWater()) ? "The " + getColor() + " color " + this.getClass().toString().replace("class ", "")
            + " needs water" : "The " + getColor() + " color " + this.getClass().toString().replace("class ", "")
            + " doesn't need water.");
  }

  public boolean getNeedWater() {
    if (getCurrentWaterAmount() <= getIdealWaterNeed()) {
      return this.needWater = true;
    }
    return false;
  }

  public void watering(int amountOfWater) {
    this.currentWaterAmount += (amountOfWater);
  }
}