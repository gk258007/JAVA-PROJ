import java.util.*;
import movies.*;
import javax.swing.*;
class MAIn 
{
char choice;
Scanner sc = new Scanner(System.in);

void intromessage()
{
System.out.println("-//////-///-/MOVIE PICKER-/-////-////////-///");
System.out.println("Movie picker was made\n");
System.out.println("So that you wont have to stare at a screen with 100000+ content\n");
System.out.println("But chose which genre and have the Top 10 movies with links to them");
System.out.println("Lets dive in");
}

void detailsGrab()
{
System.out.println("Lets start with Your name ");
String NAME = sc.nextLine();  
System.out.println("Hows the Weekend "+NAME+"?");
}

void choice()throws Exception
{
THENAV N = new THENAV();
Genre G = new Genre();
System.out.println("MOVIES OR TV?");
Scanner SS = new Scanner(System.in);
String choice = SS.nextLine();
switch(choice)
{
case "MOVIES":
case "movies":
N.display();
G.dis();
G.choice();
break;
case "tv":
case "TV":
System.out.println("PODA TV");
break;
default: System.out.println("Illegal  choice "+choice);
throw new Exception("What alienated script is that");
}
}
public static void main(String args[])
{
MAIn M = new MAIn();
M.intromessage();
M.detailsGrab();
try{
M.choice();
}catch(Exception e){System.out.println("[-_-]");
}
}
}

