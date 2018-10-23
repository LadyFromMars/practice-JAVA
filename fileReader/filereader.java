
import java.io.*;
import java.util.*;

public class filereader {

private Scanner x;


//opening

public void openFile(){
    try {
      x = new Scanner (new File("nouns.txt"));
    }
    catch (Exception e) {
      System.out.println("Could not find a file");
    }
}

//reading

public void readFile () {
  while(x.hasNext()) {
    String a = x.next();
    String b = x.next();
    String c = x.next();
    String d = x.next();
    String e = x.next();


    System.out.printf("%s %s %s %s %s\n", a,b,c,d,e);
  }
}

//closing

public void closeFile(){
  x.close();
}


}
