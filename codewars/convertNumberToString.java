/* We need a function that can transform a number into a string.*/



// solution 1
class Kata {
  public static String numberToString(int num) {
    return Integer.toString(num);
  }
}


//solution 2

class Kata {
  public static String numberToString(int num) {
    return ""+num;
  }
}


//solution 3

class Kata {
  public static String numberToString(int num) {
    return String.valueOf(num);
  }
}
