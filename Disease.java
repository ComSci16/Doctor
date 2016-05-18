import java.util.ArrayList; 

public class Disease{
  
  public static String getDiseaseEfficient(ArrayList<String> symptoms) {
    
    ArrayList<String> coughDisease = new ArrayList<String>();
  coughDisease.add("cough");
  coughDisease.add("soreThroat");
  coughDisease.add("baba");
  
  
  // IF it has at least 4 /  5/  6 of the symptoms, then return disease.
  int counter = 0;
    for(int i = 0; i < symptoms.size(); i++){
      if(symptoms.contains(coughDisease.get(i))){
        counter++;
      }
    }
    if (counter > 2) {
      return "Cough Disease";
    }
    return "?";
  }
public static String getDisease(ArrayList<String> symptoms) {
  //Create an object for each Disease that contains the INfo, cure, symptoms bla bal bal...
  
    for (int i = 0; i < symptoms.size(); i++ ) {
      if(symptoms.contains("cough") &&
         symptoms.contains("soreThroat")) { //the if statements to define what disease it is.
        return "Common Cold";
      }
    }
    return "Cancer";
  }
}

