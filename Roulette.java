import java.util.Scanner;
public class Roulette{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);{
System.out.print("Choose a from the following options \n 1.Roulette (Enter R or r) \n 2.Craps (Enter C or c) \n 3. Picking a card from a playing deck of cards. (Enter P or p)");
 String value = input.next();
  int x = (int) (Math.random() * 36 + 1);
  int y = x % 2;
  System.out.println(x);
   String input2 = input.next();
  String redValue = "r";
    String blackValue = "b";
   switch(y){
    case 1:
      if ( input2.equalsIgnoreCase(redValue)){
      System.out.println("Congradulations you win");
    }
      else if (input2.equalsIgnoreCase(blackValue)) {
        System.out.println("Sorry you loose");
      }
      break;
    case 2: 
      if (input2.equalsIgnoreCase(blackValue)){
      System.out.println("Congradulations you win");
    }
      else if (input2.equalsIgnoreCase(redValue)){
        System.out.println("Sorry you loose");
      }
      break;
    case 3:
       if ( input2.equalsIgnoreCase(redValue)){
      System.out.println("Congradulations you win");
    }
      else if (input2.equalsIgnoreCase(blackValue)){
        System.out.println("Sorry you loose");
      }
      break;
    case 4:
      if (input2.equalsIgnoreCase(blackValue)){
      System.out.println("Congradulations you win");
    }
      else if (input2.equalsIgnoreCase(redValue)){
        System.out.println("Sorry you loose");
      }
      break;
    case 5: 
      if  ( input2.equalsIgnoreCase(redValue)){
      System.out.println("Congradulations you win");
    }
      else if (input2.equalsIgnoreCase(blackValue)) {
        System.out.println("Sorry you loose");
      }
      break;
    case 6:
     if (input2.equalsIgnoreCase(blackValue)){
      System.out.println("Congradulations you win");
    }
      else if (input2.equalsIgnoreCase(redValue)){
        System.out.println("Sorry you loose");
      }
      break;
    case 7:
      if ( input2.equalsIgnoreCase(redValue)){
      System.out.println("Congradulations you win");
    }
      
      else if (input2.equalsIgnoreCase(blackValue)) {
        System.out.println("Sorry you loose");
      }
               break;
    case 8:
      if (input2.equalsIgnoreCase(blackValue)){
      System.out.println("Congradulations you win");
    }
      else if (input2.equalsIgnoreCase(redValue)){
        System.out.println("Sorry you loose");
      }
      break;
    case 9:
      if ( input2.equalsIgnoreCase(redValue)){
      System.out.println("Congradulations you win");
    }
      else if (input2.equalsIgnoreCase(blackValue)) {
        System.out.println("Sorry you loose");
      }
      break;
    case 10:
      if (input2.equalsIgnoreCase(blackValue)){
      System.out.println("Congradulations you win");
    }
      else if (input2.equalsIgnoreCase(redValue)){
        System.out.println("Sorry you loose");
      }
      break;
         case 11:
      if ( input2.equalsIgnoreCase(redValue)){
      System.out.println("Congradulations you win");
    }
              
      else if (input2.equalsIgnoreCase(blackValue)){
        System.out.println("Sorry you loose");
      }
               break;
    case 12: 
      if (input2.equalsIgnoreCase(blackValue)){
      System.out.println("Congradulations you win");
    }
      else if (input2.equalsIgnoreCase(redValue)){
        System.out.println("Sorry you loose");
      }
      break;
    case 13:
       if ( input2.equalsIgnoreCase(redValue)){
      System.out.println("Congradulations you win");
    }
      else if (input2.equalsIgnoreCase(blackValue)) {
        System.out.println("Sorry you loose");
      }
      break;
    case 14:
      if (input2.equalsIgnoreCase(blackValue)){
      System.out.println("Congradulations you win");
    }
      else if (input2.equalsIgnoreCase(redValue)){
        System.out.println("Sorry you loose");
      }
      break;
    case 15: 
      if ( input2.equalsIgnoreCase(redValue)){
      System.out.println("Congradulations you win");
    }
      else if (input2.equalsIgnoreCase(blackValue)) {
        System.out.println("Sorry you loose");
      }
      break;
    case 16:
     if (input2.equalsIgnoreCase(blackValue)){
      System.out.println("Congradulations you win");
    }
      else if (input2.equalsIgnoreCase(redValue)){
        System.out.println("Sorry you loose");
      }
      break;
    case 17:
      if ( input2.equalsIgnoreCase(redValue)){
      System.out.println("Congradulations you win");
    }
      else if (input2.equalsIgnoreCase(blackValue)) {
        System.out.println("Sorry you loose");
      }
      break;
    case 18:
      if (input2.equalsIgnoreCase(blackValue)){
      System.out.println("Congradulations you win");
    }
      else if (!(input2.equalsIgnoreCase(redValue))){
        System.out.println("Sorry you loose");
      }
      break;
    case 19:
      if ( input2.equalsIgnoreCase(redValue)){
      System.out.println("Congradulations you win");
    }
      else if (input2.equalsIgnoreCase(blackValue)) {
        System.out.println("Sorry you loose");
      }
      break;
    case 20:
      if (input2.equalsIgnoreCase(blackValue)){
      System.out.println("Congradulations you win");
    }
      else if (input2.equalsIgnoreCase(redValue)){
        System.out.println("Sorry you loose");
      }
      break;
         case 21:
      if ( input2.equalsIgnoreCase(redValue)){
      System.out.println("Congradulations you win");
    }
      else if (input2.equalsIgnoreCase(blackValue)) {
        System.out.println("Sorry you loose");
      }
               break;
    case 22: 
      if (input2.equalsIgnoreCase(blackValue)){
      System.out.println("Congradulations you win");
    }
      else if (input2.equalsIgnoreCase(redValue)){
        System.out.println("Sorry you loose");
      }
      break;
    case 23:
       if ( input2.equalsIgnoreCase(redValue)){
      System.out.println("Congradulations you win");
    }
      else if (input2.equalsIgnoreCase(blackValue)) {
        System.out.println("Sorry you loose");
      }
      break;
    case 24:
      if (input2.equalsIgnoreCase(blackValue)){
      System.out.println("Congradulations you win");
    }
      else if (input2.equalsIgnoreCase(redValue)){
        System.out.println("Sorry you loose");
      }
      break;
    case 25: 
      if ( input2.equalsIgnoreCase(redValue)){
      System.out.println("Congradulations you win");
    }
      else if  (input2.equalsIgnoreCase(blackValue)) {
        System.out.println("Sorry you loose");
      }
      break;
    case 26:
     if (input2.equalsIgnoreCase(blackValue)){
      System.out.println("Congradulations you win");
    }
      else if (input2.equalsIgnoreCase(redValue)){
        System.out.println("Sorry you loose");
      }
      break;
    case 27:
      if ( input2.equalsIgnoreCase(redValue)){
      System.out.println("Congradulations you win");
    }
      else if (input2.equalsIgnoreCase(blackValue)){
        System.out.println("Sorry you loose");
      }
      break;
    case 28:
      if (input2.equalsIgnoreCase(blackValue)){
      System.out.println("Congradulations you win");
    }
      else if (input2.equalsIgnoreCase(redValue)){
        System.out.println("Sorry you loose");
      }
      break;
    case 29:
      if ( input2.equalsIgnoreCase(redValue)){
      System.out.println("Congradulations you win");
    }
      else if (input2.equalsIgnoreCase(blackValue)) {
        System.out.println("Sorry you loose");
      }
      break;
    case 30:
      if (input2.equalsIgnoreCase(blackValue)){
      System.out.println("Congradulations you win");
    }
      else if (input2.equalsIgnoreCase(redValue)){
        System.out.println("Sorry you loose");
      }
      break;
           case 31:
      if ( input2.equalsIgnoreCase(redValue)){
      System.out.println("Congradulations you win");
    }
      else if (input2.equalsIgnoreCase(blackValue)) {
        System.out.println("Sorry you loose");
      }
      break;
    case 32: 
      if (input2.equalsIgnoreCase(blackValue)){
      System.out.println("Congradulations you win");
    }
      else if (input2.equalsIgnoreCase(redValue)){
        System.out.println("Sorry you loose");
      }
      break;
    case 33:
       if ( input2.equalsIgnoreCase(redValue)){
      System.out.println("Congradulations you win");
    }
      else if (input2.equalsIgnoreCase(blackValue)) {
        System.out.println("Sorry you loose");
      }
      break;
    case 34:
      if (input2.equalsIgnoreCase(blackValue)){
      System.out.println("Congradulations you win");
    }
      else if (input2.equalsIgnoreCase(redValue)){
        System.out.println("Sorry you loose");
      }
      break;
    case 35: 
      if ( input2.equalsIgnoreCase(redValue)){
      System.out.println("Congradulations you win");
    }
      else if (input2.equalsIgnoreCase(blackValue)) {
        System.out.println("Sorry you loose");
      }
      break;
    case 36:
     if (input2.equalsIgnoreCase(blackValue)){
      System.out.println("Congradulations you win");
    }
      else if (input2.equalsIgnoreCase(redValue)){
        System.out.println("Sorry you loose");
      }
    break;
   }
    }
  }
}
      
      
      
      
  