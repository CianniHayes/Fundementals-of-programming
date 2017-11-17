//Cianni Hayes
//87394006
//Hw 2
//9-14-2015 
//Cse 003
import java.util.Scanner;
public class WeekDetailsCianni {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);  //creates a scanner object day
    System.out.print("Enter an integer giving the day of the week (1 - 7)");
    int weekDay = input.nextInt(); // prompts user to enter day of the week.
    if( weekDay == 1) {      
     System.out.println( "This is a Sunday which is the weekend");
    } // after the number 1 is typed this statement will apprear.
    else if (weekDay == 2) {
        System.out.println("This is Monday which is a weekday");
    } // after the number 2 is typed this statement will apprear.
    else if (weekDay == 3) {
      System.out.println("This is Tuesday which is a weekday");
    } // after the number 3 is typed this statement will apprear.
    else if (weekDay == 4) {
       System.out.println("This is Wednesday which is a weekday");
    } // after the number 4 is typed this statement will apprear.
       else if (weekDay == 5) {
         System.out.println("This is a Thursday which is a weekday");
       } // after the number 5 is typed this statement will apprear.
       else if (weekDay == 6) {
         System.out.println("This is a Friday which is a weekday");
       } // after the number 6 is typed this statement will apprear.
       else if (weekDay == 7) {
         System.out.println("This is a Saturday which is a weekend");
       } // after the number 7 is typed this statement will apprear.
input.close();
  }
}
