package org.test.sort.unit;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class SimplestUnitTest {

    @Test
    @DisplayName("Simple JUnit Test")
    void firsTtest() {
        assertTrue(true);
    }

}
