package calculator;

public class Calculator {
  //The main function of the calculator
  public static int add(String text){
    if(text.equals(""))
      return 0;

    if(hasNewDelimeter(text))
      text = fixDelimeter(text);

    if(hasNewLine(text))
      text = newLineFix(text);

    if(text.contains(","))
      return total(split(text));

    return toInt(text);
  }

  //Parses the string into integers
  public static int toInt(String text) {
    return Integer.parseInt(text);
  }

  //Seperates each integer in the string
  private static String[] split(String text){
    return text.split(",");
  }

  //Adds up the value of each number in the string and returns the total integer value
  public static int total(String[] text) {
    int total = 0;
    for(String number : text) {
      if(toInt(number) < 0)
        throw new IllegalArgumentException(negativeNumber(text));

      if(toInt(number) < 1000)
        total += toInt(number);
    }
    return total;
  }

  //Checks if the string contains \n
  public static boolean hasNewLine(String text) {
    return text.contains("\n");
  }

  //Swaps out the \n character for a comma
  public static String newLineFix(String text) {
    return text.replaceAll("\n", ",");
  }

  //Handles negative number error message output
  private static String negativeNumber(String[] numbers) {
    String error = "Negatives not allowed: ";
    for(String number : numbers) {
      if(toInt(number) < 0) {
        error += number + ", ";
      }
    }
    return error;
  }

  //Checks if the string has some special delimeters
  private static boolean hasNewDelimeter(String text) {
    return (text.contains("//") && text.contains("\n"));
  }

  //Swaps out the strange delimeter for a comma, returns a clean, comma seperate string
  private static String fixDelimeter(String text) {
    text = text.substring(2, text.length());
    char delimeter = text.charAt(0);
    text = text.substring(2, text.length());

    return text.replaceAll(String.valueOf(delimeter), ",");
  }
}
