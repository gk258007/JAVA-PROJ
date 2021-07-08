package movies;
import java.io.*;
public class Romantic 
{
void listMovies()
{
System.out.println("The file gets exported to the File directory find your");

}
public static void main(String args[])
{

 try {
      FileWriter myWriter = new FileWriter("E:/JAVA MOVIE SE/movies/Romance.txt");
      myWriter.write("Title: To all the boys ive loved before! \n Runtime:2hr \n whereToWatch:https://www.netflix.com/title/80203147\t\n\nTitle:");
      myWriter.close(); 
      System.out.println("Check your directory for the top list of movies under the genre");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
}
}
 