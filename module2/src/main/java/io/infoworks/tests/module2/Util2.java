package io.infoworks.tests.module2;

import io.infoworks.tests.module1.Util1;

public class Util2 {

  public static String sayHello() {
    System.out.println("Hi" + Util1.sayHello());
    return "hi" + Util1.sayHello();
  }
}
