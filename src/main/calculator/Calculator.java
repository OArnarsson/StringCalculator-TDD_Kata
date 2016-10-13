package calculator;

public class Calculator {
  public static int add(String text){
    if(text.equals(""))
      return 0;

    if(hasNewLine(text))
      text = newLineFix(text);

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
      if(toInt(number) < 0)
        throw new IllegalArgumentException(negativeNumber(text));

      total += toInt(number);
    }
    return total;
  }

  public static boolean hasNewLine(String text) {
    return text.contains("\n");
  }

  public static String newLineFix(String text) {
    return text.replaceAll("\n", ",");
  }

  private static String negativeNumber(String[] numbers) {
    String error = "Negatives not allowed: ";
    for(String number : numbers) {
      if(toInt(number) < 0) {
        error += number + ", ";
      }
    }
    return error;
  }
}
