package com.greenfoxacademy.bankofsimba.models;

public class BankAccount {

  private String name;
  private int balance;
  private String currency;
  private String animalType;
  private boolean king;

  public BankAccount(){}

  public BankAccount(String name, int balance, String currency, String animalType, boolean king) {
    this.name = name;
    this.balance = balance;
    this.currency = currency;
    this.animalType = animalType;
    this.king = king;
  }

  public boolean isKing() {
    return king;
  }

  public void setKing(boolean king) {
    this.king = king;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getBalance() {
    return balance;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }

  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public String getAnimalType() {
    return animalType;
  }

  public void setAnimalType(String animalType) {
    this.animalType = animalType;
  }
}