package TVSHOW;
import java.io.*;
import java.awt.Desktop;
public class horror
{
void listtvshows()
{
System.out.println("The file gets exported to the File directory find your");

}
public static void main(String args[])
{

 try {
      FileWriter myWriter = new FileWriter("E:/JAVAMOVIESE/TVSHOW/horror.txt");
      File file = new File("E:/JAVAMOVIESE/TVSHOW/horror.txt");
      Desktop desktop = Desktop.getDesktop();
      if (file.exists()) 
      desktop.open(file);
      myWriter.write("Title:Castle rock \n whereToWatch:https://www.netflix.com/in/title/81036944%22");
      myWriter.write("\nTitle:Marianne\n whereToWatch :https://www.netflix.com/in/title/80217779:%22");
      myWriter.write("\nTitle:Typewriter\n whereToWatch :https://www.netflix.com/in/title/80996338:%22");
      myWriter.close(); 
      System.out.println("Check your directory for the top list of tv shows under the genre");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
}
}