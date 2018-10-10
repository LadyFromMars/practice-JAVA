/* Remove n exclamation marks in the sentence from left to right.
n is positive integer. */



public class Kata {

  public static String remove(String string, int n){
        StringBuilder newString = new StringBuilder();


    for (char i : string.toCharArray()) {
      if(n > 0 && i == '!') {

        n--;
      }
      else {
        newString.append(i);
      }
    }
    
    return newString.toString();

  }

}
