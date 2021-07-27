package TVSHOW;
import java.io.*;
import java.awt.Desktop;
public class Romance
{
void listtvshows()
{
System.out.println("The file gets exported to the File directory find your");
}
public static void main(String args[])
{
 try {
      FileWriter myWriter = new FileWriter("E:/JAVAMOVIESE/movies/romance.txt");
      File file = new File("E:/JAVAMOVIESE/movies/romance.txt");
      Desktop desktop = Desktop.getDesktop();
      if (file.exists()) 
      desktop.open(file);
      myWriter.write("Title: MISMATCHED  \n whereToWatch:https://www.netflix.com/in/title/80220079%22");
      myWriter.write("\nTitle: Its okay to not be okay \n whereToWatch:https://www.https//www.netflix.com/in/title/81243992%22");
      myWriter.write("\nTitle: On my block\n whereToWatch:https://www.netflix.com/in/title/80117809%22");
      myWriter.close(); 
      System.out.println("Check your directory for the top list of tv shows under the genre");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
}
}