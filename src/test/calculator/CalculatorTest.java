package calculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest{


  @Test //0
  public void testEmptyString(){
    assertEquals(0, Calculator.add(""));
  }

  @Test //1
  public void oneIntInput(){
    assertEquals(9, Calculator.add("9"));
    assertEquals(4, Calculator.add("4"));
    assertEquals(129, Calculator.add("129"));
  }

  @Test //2
  public void twoIntInput(){
    assertEquals(9, Calculator.add("5,4"));
    assertEquals(4, Calculator.add("4,0"));
    assertEquals(3, Calculator.add("2,1"));
  }

  @Test //3
  public void multipleIntInput(){
    assertEquals(9, Calculator.add("1,2,3,3"));
    assertEquals(4, Calculator.add("4,0,0,0,0,0,0,0,0"));
    assertEquals(3, Calculator.add("2,1"));
  }

  @Test //4
  public void testNewLineInput(){
  assertEquals(6, Calculator.add("1\n2,3"));
  assertEquals(10, Calculator.add("1\n2\n3\n2\n2"));
  }
}
