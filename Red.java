import java.util.*;
import movies.THENAV;
class ChoiceException extends Exception
{
ChoiceException(String s)
{
super(s);
}
}
class Red
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
void excep()
{
throws ChoiceException("NOPE");
}
void choice()throws ChoiceException
{
System.out.println("MOVIES OR TV?");
Scanner SS = new Scanner(System.in);
String choice = SS.nextLine();
switch(choice){
case "MOVIES":
case "movies":
System.out.println("PODA");
break;
case "tv":
case "TV":
System.out.println("PODA TV");
break;
case "f":
except();
break;
}
}

public static void main(String args[])
{
MAIn M = new MAIn();
M.intromessage();
M.detailsGrab();
try{
M.choice();
}catch(Exception T){System.out.println("Eception occured:" +T);}
//THENAV N = new THENAV();
//N.display();
}
}

