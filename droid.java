
/* This is a Hopper - a simple Droid (robot) that can travel on different planets
 and search for signs of life presence.
 This project creates some baseline behaviors of the droid. */

import java.util.Random;


public class Droid{

 int batteryLevel;

  Droid(){

    batteryLevel = 100;
  }

//Activate
  public void activate(){
   System.out.println("Activated. How can I help you?") ;
   batteryLevel -=5;
    System.out.println("Battery level is: " + batteryLevel + " percent.");
  }


 // Charge the battery
  public void chargeBattery(int hours){
    System.out.println("Droid is charging...");

    if(batteryLevel>=100){
      System.out.println("Droid is fully charged.");
    } else {
       batteryLevel += hours;
      System.out.println("Battery level is: " + batteryLevel + " percent.");
    }
  }

// Check battery level

  public int checkBatteryLevel(){
    System.out.println("Battery level is: " + batteryLevel + " percent.");
    return batteryLevel;
  }


 // Hover

  public void hover(int feet){

    if(batteryLevel>=20){

    if(feet>2){
     System.out.println("Error! I cannot hover above 2 feet.");
    } else {
      System.out.println("Hovering...");
      batteryLevel -= 20;
      System.out.println("Battery level is: " + batteryLevel + " percent.");
    }}
    else
    {System.out.println("I'm too tired for this. I need to charge.");}

  }


 // Go to another planet

  public void travel(String planet) {

      if (batteryLevel>=50){
     System.out.println("Going to the " + planet + "...  Speed of light:
      activated. Zooooooooom. UUUUU, it's nice here. ");
     batteryLevel -= 50;
      System.out.println("Battery level is: " + batteryLevel + " percent.");

      }
      else{
          System.out.println("I'm too tired for this. I need to charge.");
      }
  }


  // Search for water

  public void searchForWater(){

      if(batteryLevel>=20){

      int random = (int )(Math.random() * 3 + 1);


      if(random==1){
       System.out.println("Searching for water...  Can't find a water on this planet");
      } else if (random==2){
          System.out.println("Searching for water...  I found not significant presence of frozen water");
      } else {
          System.out.println("Searching for water...  BINGO! I found a liquid water under the surface!");
      }

      batteryLevel -= 20;
      System.out.println("Battery level is: " + batteryLevel + " percent.");
      } else {
          System.out.println("I'm too tired for this. I need to charge.");
      }
  }


  // Search for life

  public void searchForLife() {

      if(batteryLevel>=20){

  int random = (int )(Math.random() * 3 + 1);

   if(random==1){
       System.out.println("Searching for life...  No sign of life. I feel lonely...");
      } else if (random==2){
          System.out.println("Searching for life...  I found a toxic bio matter that looks like a death flower. I know what to send to you on your Birthday!");
      } else {
          System.out.println("Searching for life...  I found a bird. I'll call it Cobrachicken.");
      }

      batteryLevel -= 20;
      System.out.println("Battery level is: " + batteryLevel + " percent.");}
      else {
          System.out.println("I'm too tired for this. I need to charge.");
          System.out.println("Battery level is: " + batteryLevel + " percent.");
      }
  }



  // main

  public static void main(String[] args){

   Droid hopper = new Droid();

   hopper.activate();
   hopper.chargeBattery(5);
   hopper.hover(2);
   hopper.searchForWater();
   hopper.searchForLife();
   hopper.chargeBattery(40);
   hopper.travel("Mars");
  }


}
