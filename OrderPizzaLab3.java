//CianniHayes
//873940065
//9-2-2015
//Cse002
import java.util.Scanner;
public class OrderPizzaLab3 {
  public static void main(String[]args) {
    Scanner slice = new Scanner(System.in);
    System.out.println("how many friends will attend the party?");
    int numberOfFriends= slice.nextInt();
    System.out.println("how many slices will each person get?");
   int numberOfSlicesPerPerson= slice.nextInt(); 
   System.out.println("how many slices come in a pizza");
   int numberOfSlicesPerPizza= slice.nextInt();
   System.out.println("how much will each pizza cost?");
     double costOfEachPizza= slice.nextDouble();
      int totalNumberOfPersons= numberOfFriends+ 1;
        int totalNumberOfSlicesPerPerson=totalNumberOfPersons* numberOfSlicesPerPerson;
        int totalNumberOfPizzas= totalNumberOfSlicesPerPerson/ numberOfSlicesPerPizza;
        double totalCostOfPizzas= costOfEachPizza* totalNumberOfPizzas;
 System.out.println("I need to order "+totalNumberOfPizzas+"pizzas and the total cost is "+ totalCostOfPizzas);
 System.out.println("I need to print total cost after rounding "+ Math.round(totalCostOfPizzas*100.0)/100.0);
 System.out.println("I need to order "+totalNumberOfSlicesPerPerson);
 System.out.println("I need to order "+totalNumberOfPizzas);
     System.out.println("I need to order "+totalNumberOfPersons);
System.out.println("I need to order "+totalCostOfPizzas);
  } //end of main method
} //end of class

  
      
      