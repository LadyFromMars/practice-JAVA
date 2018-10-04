/* A simple Library tool to help analyze completed books
in a small, personal library. */

import java.util.HashMap;



public class Library {

//Constructor

 public Library(){

 }


 // Checks what books are finished

  public void getFinishedBooks (HashMap<String, Boolean> library){

    if(library.size() < 1){
      System.out.println("Error: Data base is empty.");

    } else {
      for(String book : library.keySet()){
        if(library.get(book)==true){
          System.out.println(book);
        }
      }
     }
    }

    //MAIN

   public static void main(String[] args){

        HashMap <String, Boolean> myBooks = new HashMap<String, Boolean>();

       //library
     myBooks.put("Road Down The Funnel", true);
     myBooks.put("Rat: A Biology", false);
     myBooks.put("TimeIn", true);
     myBooks.put("3D Food Printing", false);

     Library myLibrary = new Library();

      //function call
     myLibrary.getFinishedBooks(myBooks);

   }
  }
