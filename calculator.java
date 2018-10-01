/* This program is a simple version of calculator. It's able to add two integers, subtract two integers, multiply two integers, divide two integers and apply the modulo operator on two integers  */


public class Calculator {

 Calculator() {

}

// Add

  public int add(int a, int b){
   return a + b;
  }

//substract

  public int substract(int a, int b) {
    return a-b;
  }

//multiply

  public int multiply(int a, int b) {
    return a * b;
  }

//divide

  public int divide(int a, int b) {
    if(b==0){
      System.out.println("Error! Dividing by zero is not allowed..");
      return 0;
    } else {
      return a/b;
    }
  }

//modulo

  public int modulo(int a, int b){
    if(b==0){
      System.out.println("Error! Dividing by zero is not allowed..");
      return 0;
    } else {
      return a%b;
    }
  }


//main

  public static void main(String[] args){

   Calculator myCalculator = new Calculator();

   System.out.println(myCalculator.add(5,7));
   System.out.println(myCalculator.substract(45,11));
   System.out.println(myCalculator.divide(40,5));
   System.out.println(myCalculator.multiply(7,-7));
   System.out.println(myCalculator.modulo(31,4));
   System.out.println(myCalculator.add(-1,11));
  }

}
