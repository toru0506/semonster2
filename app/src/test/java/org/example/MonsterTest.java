package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class MonsterTest {
    @Test public void appHasAGreeting() {
        Monster Test1 = new Monster(0);
        assertNotNull("スライム:レア度[1]" , Test1.toString());
    }

    @Test public void appHasAGreeting2() {
        Monster Test1 = new Monster(1);
        assertNotNull("サハギン:レア度[3]" , Test1.toString());
    }


    @Test public void appHasAGreeting3() {
        Monster Test1 = new Monster(2);
        assertNotNull("ドラゴン:レア度[10]" , Test1.toString());
    }

    @Test public void appHasAGreeting4() {
        Monster Test1 = new Monster(3);
        assertNotNull("デュラハン:レア度[7]" , Test1.toString());
    }

    @Test public void appHasAGreeting5() {
        Monster Test1 = new Monster(4);
        assertNotNull("シーサーペント:レア度[5]" , Test1.toString());
    }

    @Test public void appHasAGreeting6() {
        Monster Test1 = new Monster(0);
        assertNotNull("メガスライム:レア度[4]" , Test1.toString());
    }

    @Test public void appHasAGreeting7() {
        Monster Test1 = new Monster(1);
        assertNotNull("ギガサハギン:レア度[5]" , Test1.toString());
    }

    @Test public void appHasAGreeting8() {
        Monster Test1 = new Monster(2);
        assertNotNull("メカドラゴン:レア度[14]" , Test1.toString());
    }

    @Test public void appHasAGreeting9() {
        Monster Test1 = new Monster(3);
        assertNotNull("デュララハン:レア度[10]" , Test1.toString());
    }

    @Test public void appHasAGreeting10() {
        Monster Test1 = new Monster(4);
        assertNotNull("シーサーペント・テラ:レア度[6]" , Test1.toString());
    }

    @Test public void appHasAGreeting11() {
        Monster Test1 = new Monster(5);
        assertNotNull("メガ・ゾンビ:レア度[4]" , Test1.toString());
    }

}
