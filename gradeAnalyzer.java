/* A simple tool helps analyze classroom grades stored in an ArrayList.
You able to retrieve the classroom average, the lowest and the highest grade */


import java.util.ArrayList;
import java.util.Arrays;




 public class GradeAnalyzer{

  public  GradeAnalyzer(){

  }

  // Calculate average grade
  public int getAverage(ArrayList<Integer> grades){

    if( grades.size()<1){
      System.out.println("Error:Data Base is empty");
      return 0;
    } else {
      int sum = 0;
      for (int grade : grades) {
        sum = sum + grade;
      }
      int average = sum / grades.size();
      System.out.println("The average grade is " + average);
      return average;

    }
  }


  // Find the lowest grade

  public int minGrade(ArrayList<Integer> grades){

if  (grades.size()<1){
  System.out.println("Error:Data Base is empty");
  return 0;
} else {

int min = grades.get(0);

for (int i=0; i<grades.size(); i++) {
  if(grades.get(i) < min){
    min = grades.get(i);
  }
}

 System.out.println("The lowest class grade is " + min);
 return min;
}

  }


//Find the highest grade

public int maxGrade(ArrayList<Integer> grades){

if  (grades.size()<1){
System.out.println("Error:Data Base is empty");
return 0;
} else {

int max = grades.get(0);

for (int i=0; i<grades.size(); i++) {
if(grades.get(i) > max){
  max = grades.get(i);
}
}

System.out.println("The highest class grade is " + max);
return max;
}
}


  //main
  public static void main(String[] args){

    ArrayList<Integer> myClassroom = new ArrayList<Integer>();

    myClassroom.add(98);
    myClassroom.add(92);
    myClassroom.add(88);
    myClassroom.add(75);
    myClassroom.add(61);
    myClassroom.add(89);
    myClassroom.add(95);

    GradeAnalyzer myAnalyzer = new GradeAnalyzer ();
    myAnalyzer.getAverage(myClassroom);
    myAnalyzer.minGrade(myClassroom);
    myAnalyzer.maxGrade(myClassroom);
  }


}
