package calculator;

public class Calculator {
  public static int add(String text){
    if(text.equals(""))
      return 0;

    if(text.contains(","))
      return total(split(text));

    return toInt(text);
  }

  public static int toInt(String text) {
    return Integer.parseInt(text);
  }

  private static String[] split(String text){
    return text.split(",");
  }

  public static int total(String[] text) {
    int total = 0;
    for(String number : text) {
      total += toInt(number);
    }

    return total;
  }
}
