package com.greenfoxacademy.springstart;

public class Language {
  String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
          "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
          "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
          "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};

  public String getRandomHello(){
    String hello = hellos[(int) (1 + Math.random() * hellos.length)];
    return hello;
  }

  public int red(){
    int red = (int)(Math.random() * 256);
    return red;
  }

  public int green(){
    int green = (int)(Math.random() * 256);
    return green;
  }

  public int blue(){
    int blue = (int)(Math.random() * 256);
    return blue;
  }

  public int fontSize(){
    int font = (int)(Math.random() * 100);
    return font;
  }
}

