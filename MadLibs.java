public class MadLibs {
  /*
  This program generates a mad libbed story.
  Author: Sanayah + Codecademy
  Date: 7/30/2023
  */
  	public static void main(String[] args){
      String name1 = "Tanya";
      String name2 = "Dave";

      String adjective1 = "smart";
      String adjective2 = "brave";
      String adjective3 = "silly";

      String verb1 = "jumping";

      String noun1 = "dog";
      String noun2 = "cat";
      String noun3 = "skyscraper";
      String noun4 = "corner store";
      String noun5 = "spaghetti";
      String noun6 = "notebook";
      
      int number = 22;

      String place1 = "New York";
       
      //The template for the story
      String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";

      System.out.println(story);
    }       
}
