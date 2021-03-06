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

  @Test //5
  (expected = IllegalArgumentException.class)
  public void testNegativeNumbers(){
  assertEquals("-1", Calculator.add("-1,2"));
  assertEquals("-4,-5", Calculator.add("2,-4,3,-5"));
  }

  @Test //6
  public void testOverThousand(){
  assertEquals(2, Calculator.add("2"));
  assertEquals(1014, Calculator.add("1232,10,2,3,512345,999"));
  assertEquals(1000, Calculator.add("1000"));
  }

  @Test //7
  public void newDelimeter(){
  assertEquals(2, Calculator.add("//&\n1&1"));
  assertEquals(8, Calculator.add("//O\n1O1O1O1O1O1O1O1"));
  }
}
