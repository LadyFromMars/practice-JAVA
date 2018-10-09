/* Write a function called repeatStr which repeats the given string
string exactly n times.*/


public class Solution {
    public static String repeatStr(int repeat, String string) {

     String newString = "";

     for(int i=0; i<repeat; i++){

     newString= newString + string;
     }

     return newString;
    }
}
