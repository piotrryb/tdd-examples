package pl.sda.poznan;

public class Greeting {

  public static String greet(String... names) {

    if (names == null) {
      return "Hello, my friend";
    }
    if (names.length == 1) {
      String name = names[0];
      if (name.equals(name.toUpperCase())) {
        return String.format("HELLO, %S", name);
      }
      return String.format("Hello, %s", name);
    } else {
      StringBuilder sb = new StringBuilder();
      sb.append("Hello");
      String capitalName = null;
      for (int i = 0; i < names.length - 1; i++) {
        if (names[i].equals(names[i].toUpperCase())) {
          capitalName = names[i];
          continue;
        }
        sb.append(", ").append(names[i]);
      }
      sb.append(" and ").append(names[names.length - 1]);
      if (capitalName != null) {
        sb.append(". AND HELLO ").append(capitalName);
      }
      return sb.toString();
    }
  }

}
