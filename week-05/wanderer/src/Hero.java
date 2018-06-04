public class Hero extends Character{
  public Hero (){
    this.image = "assets/hero-down.png";
    this.posX = 0;
    this.posY = 0;

  }
  public void heroUp(){
    this.image = "assets/hero-up.png";
    this.posY--;
  }
  public void heroDown(){
    this.image = "assets/hero-down.png";
    this.posY++;
  }
  public void heroRight() {
    this.image = "assets/hero-right.png";
    this.posX++;
  }
  public void heroLeft(){
    this.image = "assets/hero-left.png";
    this.posX--;
  }
}
