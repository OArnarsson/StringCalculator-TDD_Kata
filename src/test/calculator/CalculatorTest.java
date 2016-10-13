package calculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest{

  @Test
  public void testEmptyString(){
    assertEquals(0, Calculator.add(""));
  }

  @Test
  public void oneIntInput(){
    assertEquals(9, Calculator.add("9"));
  }
}
