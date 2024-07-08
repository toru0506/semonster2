package org.example;

public class Monster {
  private String name;
  private int rare; // 戦うとレア度が高いほうが勝つ．同じ場合は引き分け
  
  Monster(String name, int rare){
    this.name = name;
    this.rare = rare; 
  }

  

  @Override
  public String toString() {

    return this.name + ":レア度[" + this.rare + "]\n";
  }
}