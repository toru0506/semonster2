package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class MonsterTest {
    @Test public void EqualMonster() {
        Monster Test1 = new Monster(0);
        assertEquals("スライム:レア度[1]" , Test1.toString());
    }

    @Test public void EqualMonster2() {
        Monster Test1 = new Monster(1);
        assertEquals("サハギン:レア度[2]" , Test1.toString());
    }

    @Test public void EqualMonster3() {
        Monster Test1 = new Monster(2);
        assertEquals("ドラゴン:レア度[3]" , Test1.toString());
    }

    @Test public void EqualMonster4() {
        Monster Test1 = new Monster(3);
        assertEquals("デュラハン:レア度[4]" , Test1.toString());
    }

    @Test public void EqualMonster5() {
        Monster Test1 = new Monster(4);
        assertEquals("シーサーペント:レア度[5]" , Test1.toString());
    }

    @Test public void EqualMonster6() {
        Monster Test1 = new Monster(5);
        assertEquals("メガスライム:レア度[6]" , Test1.toString());
    }

    @Test public void EqualMonster7() {
        Monster Test1 = new Monster(6);
        assertEquals("ギガサハギン:レア度[7]" , Test1.toString());
    }

    @Test public void EqualMonster8() {
        Monster Test1 = new Monster(7);
        assertEquals("メカドラゴン:レア度[8]" , Test1.toString());
    }

    @Test public void EqualMonster9() {
        Monster Test1 = new Monster(8);
        assertEquals("デュララハン:レア度[9]" , Test1.toString());
    }

    @Test public void EqualMonster10() {
        Monster Test1 = new Monster(9);
        assertEquals("シーサーペント・テラ:レア度[10]" , Test1.toString());
    }
}
