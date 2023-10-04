package io.infoworks.tests.module2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Util2Test {
  @Test
  public void testSayHello() {
    // Arrange
    // Assuming Util1.sayHello() returns "Util1 says hello"

    // Act
    String result = Util2.sayHello();

    // Assert
    assertEquals("hiHello", result);
  }
}
