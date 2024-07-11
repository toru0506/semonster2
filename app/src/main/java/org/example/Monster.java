package org.example;

public class Monster {
  private String name;
  private int rare; // 戦うとレア度が高いほうが勝つ．同じ場合は引き分け
  
  Monster(int mnumber){
    if (mnumber >= 5){
      this.name = this.summonMonster2(mnumber-5);
    }else{
      this.name = this.summonMonster(mnumber);
    }
    this.rare = this.getRare(mnumber); 
  }

  String summonMonster(int mnumber) {
    String monsters[] = { "スライム", "サハギン", "ドラゴン", "デュラハン", "シーサーペント" };
    return monsters[mnumber];
  }

  String summonMonster2(int mnumber){
    String monsters[] = {"メガスライム", "ギガサハギン", "メカドラゴン", "デュララハン", "シーサーペント・テラ"};
    return monsters[mnumber];
  }

  int getRare(int mnumber) {
    int rare[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    return rare[mnumber];
  }

  

  @Override
  public String toString() {
    return this.name + ":レア度[" + this.rare + "]";
  }
}