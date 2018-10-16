/*Write a class function named repeat() that takes two arguments
(a string and a long integer), and returns a new string where the input string
 is repeated that many times. */

 import org.junit.Test;
 import static org.junit.Assert.assertEquals;
 import org.junit.runners.JUnit4;


public class Repeater{
  public static String repeat(String string,long n){

  String result = string;

  for (int i=0; i<n-1; i++){

  result = result + string;

  }
  return result;
  }
}



//Test case


public class SolutionTest {
    @Test
    public void testSomething() {
        assertEquals("Hello Hello Hello Hello Hello ",Repeater.repeat("Hello ",5));
        assertEquals("Yeah! Yeah! Yeah! Yeah! Yeah! Yeah! Yeah! Yeah! Yeah! Yeah! Yeah! Yeah! Yeah! Yeah! Yeah! Yeah! ",Repeater.repeat("Yeah! ", 16));
        assertEquals("Wub Wub Wub Wub Wub Wub ",Repeater.repeat("Wub ", 6));
    }
}
