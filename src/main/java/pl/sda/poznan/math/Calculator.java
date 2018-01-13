package pl.sda.poznan.math;

import java.net.Inet4Address;

public class Calculator {

  public static int sum(String str) {
    if (str.isEmpty()) {
      return 0;
    }else if(str.length() == 1){
      return parseInteger(str);
    }else {
      String[] split = str.split(",");
      return parseInteger(split[0]) + parseInteger(split[1]);
    }
  }
  private static int parseInteger(String s){
    return Integer.parseInt(s);
  }
}
