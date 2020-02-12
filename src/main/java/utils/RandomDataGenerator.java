package utils;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomDataGenerator {
  public static String generateRandomInputString(){
    return RandomStringUtils.random(10, true, false);
  }

  public static String generateRandomEmail(){
    return RandomStringUtils.random(5, true, false) +
        "." + RandomStringUtils.random(5, true, false) +
        "@" + RandomStringUtils.random(10, true, false) + ".com";
    }

    public static String generateRandomMobileNumber(){
      return "+" + RandomStringUtils.random(10, false, true);
    }
}