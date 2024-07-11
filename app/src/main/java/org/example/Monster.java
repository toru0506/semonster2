package org.example;

public class Monster {
  private String name;
  private int rare; // 戦うとレア度が高いほうが勝つ．同じ場合は引き分け
  
  Monster(int mnumber){
    if(this.getRare(mnumber) >= 3){
      this.name = this.summonMonster2(mnumber);
    }else{
      this.name = this.summonMonster(mnumber);
    }
    this.rare = this.getRare(mnumber); 
  }

  String summonMonster(int mnumber) {
    String monsters[] = { "スライム", "サハギン", "ドラゴン", "デュラハン", "シーサーペント" ,"ゾンビ"};
    return monsters[mnumber];
  }

  String summonMonster2(int mnumber){
    String monsters[] = {"メガスライム", "ギガサハギン", "メカドラゴン", "デュララハン", "シーサーペント・テラ" ,"メガ・ゾンビ"};
    return monsters[mnumber];
  }

  int getRare(int mnumber) {
    int rare[] = { 1, 3, 10, 7, 5, 4, 5, 14, 10, 6};
    return rare[mnumber];
  }

  

  @Override
  public String toString() {
    return this.name + ":レア度[" + this.rare + "]\n";
  }
}