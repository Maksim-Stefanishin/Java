package ru.gb.lesson2;

public class Cat extends Animal {

  public Cat(String name) {
    super(name);
  }

  @Override
  public void voice() {
    System.out.println("Мяу");
  }

}
