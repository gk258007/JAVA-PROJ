package TVSHOW;
import java.io.*;
import java.awt.Desktop;
public class thriller 
{
void listtvshows()
{
System.out.println("The file gets exported to the File directory find your");

}
public static void main(String args[])
{

 try {
      FileWriter myWriter = new FileWriter("E:/JAVAMOVIESE/TVSHOW/thriller.txt");
      File file = new File("E:/JAVAMOVIESE/TVSHOW/thriller.txt");
      Desktop desktop = Desktop.getDesktop();
      if (file.exists()) 
      desktop.open(file);
      myWriter.write("Title: Money Hiest \n whereToWatch:https://www.netflix.com/in/title/80192098%22");
      myWriter.write("Title: Breaking Bad \n whereToWatch:https://www.netflix.com/in/title/70143836%22");
      myWriter.write("Title: Sacred games\n whereToWatch:https://www.netflix.com/in/title/80115328%22");

      myWriter.close(); 
      System.out.println("Check your directory for the top list of tv shows under the genre");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
}
}