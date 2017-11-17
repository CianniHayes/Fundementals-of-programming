//Cianni Hayes
//87394006
//Hw 3
////9-21-2015 
//Cse 003
import java.util.Scanner;
public class WorldCupWinner {
  public static void main(String[] args){
    Scanner input= new Scanner(System.in);
   int x =(int)(Math.random() * 20.0 + 1);
   System.out.println(x);
  
 String winner1 = "Uraguay";
 String winner2 = "Italy";
 String winner3= "West Germany";
 String winner4 = "Brazil";
    String winner5 = "England";
    String winner6 = "Argentina";
    String winner7 = "France";
    String winner8= "Spain";
    String winner9 = "Germany";
    switch(x){
      case 1:
        int year1 = 1930;
        System.out.print("Who won the world cup in" + year1);
          String input1 = input.next();
      if (input1.equals(winner1)){
        System.out.println("Congratulations, You are correct!");
      }
      else if (!(input1.equals(winner1))){
        System.out.println("Sorry that is incorrect. The winner in 1930's was Uruguay!");
      }
      break;
      case 2:
        int year2 = 1934;
         System.out.print("Who won the world cup in " + year2);
          String input2 = input.next();
        if (input2.equals(winner2)) {
          System.out.println("Congratulations you are correct");
        }
          else if (!(input2.equals(winner2))){
            System.out.println("Sorry that is incorrect. The winner in 1934 was Italy");
                                 }
break;
  case 3:
    int year3 = 1938;
     System.out.print("Who won the world cup in " + year3);
          String input3 = input.next();
          if (input3.equals(winner2)) {
            System.out.println("Congradulations, You are correct");
          }
            else if (!(input3.equals(winner2))) {
              System.out.println("Sorry that is incorrect. The winner in 1938 was Italy");
            }
            break;
             case 4:
    int year4 = 1950;
     System.out.print("Who won the world cup in " + year4);
          String input4 = input.next();
          if (input4.equals(winner1)) {
            System.out.println("Congradulations, You are correct");
          }
            else if (!(input4.equals(winner1))) {
              System.out.println("Sorry that is incorrect. The winner in 1950 was Uruguay");
            }
            break;
            
             case 5:
    int year5= 1954;
     System.out.print("Who won the world cup in" + year5);
          String input5 = input.next();
          if (input5.equals(winner3)) {
            System.out.println("Congradulations, You are correct");
          }
            else if (!(input5.equals(winner3))) {
              System.out.println("Sorry that is incorrect. The winner in 1954 was Germany");
            }
            break;
            
             case 6:
    int year6= 1958;
     System.out.print("Who won the world cup in " + year6);
          String input6 = input.next();
          if (input6.equals(winner4)) {
            System.out.println("Congradulations, You are correct");
          }
            else if (!(input6.equals(winner4))) {
              System.out.println("Sorry that is incorrect. The winner in 1958 was Brazil");
            }
            break;
             case 7:
    int year7= 1962;
     System.out.print("Who won the world cup in " + year7);
          String input7 = input.next();
          if (input7.equals(winner4)) {
            System.out.println("Congradulations, You are correct");
          }
            else if (!(input7.equals(winner4))) {
              System.out.println("Sorry that is incorrect. The winner in 1962 was Brazil");
            }
            break;
             case 8:
    int year8= 1966;
     System.out.print("Who won the world cup in " + year8);
          String input8 = input.next();
          if (input8.equals(winner5)) {
            System.out.println("Congradulations, You are correct");
          }
            else if (!(input.equals(winner5))) {
              System.out.println("Sorry that is incorrect. The winner in 1966 was England");
            }
            break;
             case 9:
    int year9= 1970;
     System.out.print("Who won the world cup in" + year9);
          String input9 = input.next();
          if (input9.equals(winner4)) {
            System.out.println("Congradulations, You are correct");
          }
            else if (!(input9.equals(winner4))) {
              System.out.println("Sorry that is incorrect. The winner in 1970 was Brazil");
            }
            break;
             case 10:
    int year10= 1974;
     System.out.print("Who won the world cup in " + year10);
          String input10 = input.next();
          if (input10.equals(winner3)) {
            System.out.println("Congradulations, You are correct");
          }
            else if (!(input10.equals(winner3))) {
              System.out.println("Sorry that is incorrect. The winner in 1974 was West Germany");
            }
            break;
             case 11:
    int year11= 1978;
     System.out.print("Who won the world cup in " + year11);
          String input11 = input.next();
          if (input11.equals(winner6)) {
            System.out.println("Congradulations, You are correct");
          }
            else if (!(input11.equals(winner6))) {
              System.out.println("Sorry that is incorrect. The winner in 1978 was Argentina");
            }
            break;
             case 12:
    int year12= 1982;
     System.out.print("Who won the world cup in " + year12);
          String input12 = input.next();
          if (input12.equals(winner2)) {
            System.out.println("Congradulations, You are correct");
          }
            else if (!(input12.equals(winner2))) {
              System.out.println("Sorry that is incorrect. The winner in 1982 was Italy");
            }
            break;
   case 13:
    int year13= 1986;
     System.out.print("Who won the world cup in " + year13);
          String input13 = input.next();
          if (input13.equals(winner6)) {
            System.out.println("Congradulations, You are correct");
          }
            else if (!(input13.equals(winner6))) {
              System.out.println("Sorry that is incorrect. The winner in 1986 was Argentina");
            }
            break;
             case 14:
    int year14= 1990;
     System.out.print("Who won the world cup in " +year14);
          String input14 = input.next();
          if (input14.equals(winner3)) {
            System.out.println("Congradulations, You are correct");
          }
            else if (!(input14.equals(winner3))) {
              System.out.println("Sorry that is incorrect. The winner in 1990 was West Germany");
            }
              break;
               case 15:
    int year15= 1994;
     System.out.print("Who won the world cup in " + year15);
          String input15 = input.next();
          if (input15.equals(winner7)) {
            System.out.println("Congradulations, You are correct");
          }
            else if (!(input15.equals(winner7))) {
              System.out.println("Sorry that is incorrect. The winner in 1994 was France");
            }
            break;
   case 16:
    int year16= 1998;
     System.out.print("Who won the world cup in " +year16);
          String input16 = input.next();
          if (input16.equals(winner4)) {
            System.out.println("Congradulations, You are correct");
          }
            else if (!(input16.equals(winner4))) {
              System.out.println("Sorry that is incorrect. The winner in 1998 was Brazil");
            }
            break;
             case 17:
    int year17= 2002;
     System.out.print("Who won the world cup in " + year17);
          String input17 = input.next();
          if (input17.equals(winner4)) {
            System.out.println("Congradulations, You are correct");
          }
            else if (!(input17.equals(winner4))) {
              System.out.println("Sorry that is incorrect. The winner in 2002 was Brazil");
            }
            break;
             case 18:
    int year18= 2006;
     System.out.print("Who won the world cup in " + year18);
          String input18 = input.next();
          if (input18.equals(winner2)) {
            System.out.println("Congradulations, You are correct");
          }
            else if (!(input18.equals(winner2))) {
              System.out.println("Sorry that is incorrect. The winner in 2006 was Italy");
            }
            break;
     case 19:
    int year19= 2010;
     System.out.print("Who won the world cup in " + year19);
          String input19 = input.next();
          if (input19.equals(winner8)) {
            System.out.println("Congradulations, You are correct");
          }
            else if (!(input19.equals(winner8))) {
              System.out.println("Sorry that is incorrect. The winner in 2010 was Spain");
            }
            break;
             case 20:
    int year20= 2014;
     System.out.print("Who won the world cup in " + year20);
          String input20 = input.next();
          if (input20.equals(winner9)) {
            System.out.println("Congradulations, You are correct");
          }
            else if (!(input.equals(winner9))) {
              System.out.println("Sorry that is incorrect. The winner in 2014 was Germany");
            }
            break;
            }
    input.close();
}
}