package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class MonsterTest {
    @Test public void appHasAGreeting() {
        Monster Test1 = new Monster("幽霊",3);
        assertNotNull("幽霊:レア度[3]" , Test1.toString());
    }
}
