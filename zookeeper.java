package zookeeper;

import java.io.IOException;  
import java.util.Scanner;

public class ZooKeeper {
public static void main(String[] args) {

Scanner scnr = new Scanner (System.in);

String monitorAnimal = ""; //monitor animal
String monitorHabitat = ""; //monitor habitat
String exit = "Exit" ;   

//Prompt user to enter an option
System.out.println("What would you like to do: Monitor animal('Type animal name')? Monitor Habitat('Type habitat name')?");
System.out.println("Type 'Exit' to exit program");

//Allow user input as long as "Exit" is not entered

//Animal details
  
while (monitorAnimal.equals("Lion")) { //I don't know how to set this up??? Or continue repeating for each animal selection or promoted to exit
System.out.println("Animal: " + monitorAnimal); //Displays animal type entered by user
System.out.println("Name: Leo"); //Displays the animal's name  
System.out.println("Age: 5"); //Displays the animal's age
System.out.println("*****Health concerns: Cut on left front paw"); //Displays any health concerns
System.out.println("Feeding schedule: Twice daily"); //Displays animals' feeding schedule
System.out.println(); //Prints new line

if (monitorAnimal.equals("Tiger")) {   
System.out.println("Animal: " + monitorAnimal);
System.out.println("Name: Maj");
System.out.println("Age: 15");
System.out.println("Health concerns: None");
System.out.println("Feeding schedule: 3x daily");
System.out.println();

  
if (monitorAnimal.equals("Bear")) {
System.out.println("Animal: " + monitorAnimal);
System.out.println("Name: Baloo");
System.out.println("Age: 1");
System.out.println("Health concerns: None");
System.out.println("*****Feeding schedule: None on record"); //I'd like to have this error out and print output
  
System.out.println("Upate needed to feeding schedule");
System.out.println();


if (monitorAnimal.equals("Giraffe")) {
System.out.println("Animal: " + monitorAnimal);
System.out.println("Name: Spots");
System.out.println("Age: 12");
System.out.println("Health concerns: None");
System.out.println("Feeding schedule: Grazing");
System.out.println();

//Habitat details   
if (monitorHabitat.equals("Penguin")) //Displays name of animal habitat
System.out.println("Habitat: " + monitorHabitat); //Print habitat name
System.out.println("Temperature: Freezing"); //Displays habitat temperature
System.out.println("*****Food source: Fish in water running low"); //Displays habitat food source
System.out.println("Cleanliness: Passed"); //Diplays level of habitat cleanliness
System.out.println();
  

if (monitorHabitat.equals("Bird"))
System.out.println("Habitat: " + monitorHabitat);
System.out.println("Temperature: Moderate");
System.out.println("Food source: Natural from environment");
System.out.println("Cleanliness: Passed");
System.out.println();
  
if (monitorHabitat.equals("Aquarium"))
System.out.println("Habitat: " + monitorHabitat);
System.out.println("Temperature: Varies with output temperature");
System.out.println("Food source: Added daily");
System.out.println("*****Cleanliness: Needs cleaning from algae");
System.out.println();

//Prompt user to describe details about the habitat

if foodSource!= normalRange //Do I nest these within each if statement for each habitat? I don't know how to do that.
System.out.println("Food source needs attention"); //Also, I didn't initialize these. The ***** asterisks indicate a problem. What would I initialize them too?
System.out.println(); //Maybe declare String foodSource = ''; and then if foodSource.contains(*)...it throws an error message?

if healthConcerns != unsafeConditions
System.out.println("Safety concern found, needs immediate attention!");
System.out.println();

if habitatCare != acceptableRange
System.out.println("Habitat needs cleaning");
System.out.println();

if tempRange != normalTemp
System.out.println("Habitat temperature is stable");
System.out.println();
  
}
else { exit
}
