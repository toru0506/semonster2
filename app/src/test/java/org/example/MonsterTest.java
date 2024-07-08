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
}
