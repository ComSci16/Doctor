import java.util.Scanner;
import java.util.ArrayList; 
public class Doctor{
  
  public static void main(String[] args) {
    String disease = "Cancer"; // Starting Disease
    System.out.println("Hello! Welcome to the Online Doctor! ");
    System.out.println("To find out what disease you have, type the symptoms, and I'll tell you what you have!");
    
    ArrayList<String> symptoms = new ArrayList<String>();
    Scanner sc = new Scanner(System.in);
    String text = "";    //dummy value
    while(!text.equals("end") && !text.equals("stop") && !text.equals("done")) {
      text = sc.next();   // Scanner
      symptoms.add(text);
    }
    symptoms.remove(symptoms.size()-1);
    
    System.out.println("The Symptoms you gave me were: ");
    disease = Disease.getDiseaseEfficient(symptoms);
    System.out.println();    // Line
    
    if(text.equals("end") || text.equals("done") ||text.equals("stop")){
      System.out.println(symptoms);  //Typing END stops asking for symptoms
    }
    System.out.println("You have: " + disease);   // Print Symptoms given.
    
    System.out.println("Would you like a cure?");
    String answer = sc.next();
    if(answer.contains("y")) {
      Cures.getCure();
    } else {
      System.out.println("Die then.");
    }
    
  }
  
}