package org.example;

public class Monster {
  private String name;
  private int rare; // 戦うとレア度が高いほうが勝つ．同じ場合は引き分け
  
  Monster(int mnumber){
    this.name = this.summonMonster(mnumber);
    this.rare = this.getRare(mnumber); 
  }

  String summonMonster(int mnumber) {
    String monsters[] = { "スライム", "サハギン", "ドラゴン", "デュラハン", "シーサーペント" };
    return monsters[mnumber];
  }

  int getRare(int mnumber) {
    int rare[] = { 1, 3, 10, 7, 5 };
    return rare[mnumber];
  }

  @Override
  public String toString() {
    return this.name + ":レア度[" + this.rare + "]\n";
  }
}