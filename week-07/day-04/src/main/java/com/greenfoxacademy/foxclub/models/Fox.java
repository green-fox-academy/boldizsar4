package com.greenfoxacademy.foxclub.models;

import java.util.ArrayList;

public class Fox {
  private String name;
  private ArrayList<String> tricks;
  private ArrayList<Fox> foxes;
  private String food, drink;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ArrayList<String> getTricks() {
    return tricks;
  }

  public void setTricks(ArrayList<String> tricks) {
    this.tricks = tricks;
  }

  public Fox(){
    this("Bobi", "pizza", "cola");
  }
  public Fox(String name, String food, String drink) {
    this.name = name;
    this.food = food;
    this.drink = drink;
  }

  public String getFood() {
    return food;
  }

  public ArrayList<Fox> getFoxes() {
    return foxes;
  }

  public void setFoxes(ArrayList<Fox> foxes) {
    this.foxes = foxes;
  }

  public void setFood(String food) {
    this.food = food;
  }

  public String getDrink() {
    return drink;
  }

  public void setDrink(String drink) {
    this.drink = drink;
  }

  public void addFox(Fox fox){
    foxes.add(fox);

  }
}
