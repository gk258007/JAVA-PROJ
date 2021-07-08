package movies;
import java.util.*;
public class Genre extends Romantic
{
char genre;
Scanner GG = new Scanner(System.in);
public void dis()
{
System.out.println("You landed into Genre picker");
}
public void choice()throws Exception
{
System.out.println("/////--////GENRE's are Listed below please select one//////-////");
System.out.println("\n COMedy\nRomance\nThriller\nHorror");
String genre = GG.nextLine();
switch(genre)
{
case "comedy":
case "Comedy":
System.out.println("COMEDY IT IS");
break;
case "Romance":
case "romance":
Romantic R = new Romantic();
R.listMovies();
//System.out.println("Romance it is");
break;
case "Horror":
case "horror":
System.out.println("horror");
break;
case "thriller":
case "Thriller":
System.out.println("Thriller");
break;
default: System.out.println("Illegal  choice "+genre);
throw new Exception("What alienated script is that");
}
}

public static void main(String args[])
{
Genre a = new Genre();
try{
a.choice();
}catch(Exception e){System.out.println("[-_-]");
}
}
}