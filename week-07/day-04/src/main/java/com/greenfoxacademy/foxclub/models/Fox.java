package com.greenfoxacademy.foxclub.models;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;

@Component
public class Fox {
  private String name;
  private String food;
  private String drink;
  private String trick;
  private ArrayList<String> tricks;
  private ArrayList<Fox> foxes;
  private ArrayList<String> foodlist;
  private ArrayList<String> drinklist;

  public Fox() {
    this("Bobi");
  }

  public String getTrick() {
    return trick;
  }

  public void setTrick(String trick) {
    this.trick = trick;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ArrayList<String> getFoodlist() {
    return foodlist;
  }

  public void setFoodlist(ArrayList<String> foodlist) {
    this.foodlist = foodlist;
  }

  public ArrayList<String> getDrinklist() {
    return drinklist;
  }

  public void setDrinklist(ArrayList<String> drinklist) {
    this.drinklist = drinklist;
  }

  public ArrayList<String> getTricks() {
    return tricks;
  }

  public void setTricks(ArrayList<String> tricks) {
    this.tricks = tricks;
  }

  public Fox(String name){
    this.name = name;
    this.food = "salad";
    this.drink = "whisky";
    this.trick = "java";
    this.tricks = new ArrayList<>(Arrays.asList("Java", "cook", "draw"));
    this.foodlist = new ArrayList<>(Arrays.asList("pizza", "hamburger", "soup"));
    this.drinklist = new ArrayList<>(Arrays.asList("water", "cola", "coffee"));
  }
  public void addTrick(String trick){
    tricks.add(trick);
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
