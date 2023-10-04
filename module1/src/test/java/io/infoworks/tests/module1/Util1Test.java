package io.infoworks.tests.module1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Util1Test {
  @Test
  public void testSayName() {
    // Arrange
    // Assuming Util1.sayHello() returns "Util1 says hello"

    // Act
    String result = Util1.sayName("Shubham");

    // Assert
    assertEquals("hiShubham", result);
  }
}
