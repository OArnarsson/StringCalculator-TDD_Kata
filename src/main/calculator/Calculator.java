package calculator;

public class Calculator {
  public static int add(String text){
    if(text.equals(""))
      return 0;

    return toInt(text);
  }

  public static int toInt(String text) {
    return Integer.parseInt(text);
  }
}
