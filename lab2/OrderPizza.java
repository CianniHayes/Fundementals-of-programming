//CianniHayes
//873940065
//9-2-2015
//Cse002
public class OrderPizza {
  public static void main(String[]args) {
    int numberOfFriends = 5; //number of friends
      int numberOfSlicesPerPerson= 4; //each person will have 4 slices
      int numberOfSlicesPerPizza= 8; //each pie contains 8 slices
      double costOfEachPizza= 16.99; //assume this includes tax
      int totalNumberOfPersons= numberOfFriends+ 1;
        int totalNumberOfSlices=totalNumberOfPersons* numberOfSlicesPerPerson;
        int totalNumberOfPizzas= totalNumberOfSlices/ numberOfSlicesPerPizza;
        double totalCostOfPizzas= costOfEachPizza* totalNumberOfPizzas;
 System.out.println("I need to order "+totalNumberOfPizzas+"pizzas and the total cost is "+ totalCostOfPizzas);
 System.out.println("I need to order "+totalNumberOfSlices);
 System.out.println("I need to order "+totalNumberOfPizzas);
     System.out.println("I need to order "+totalNumberOfPersons);
System.out.println("I need to order "+totalCostOfPizzas);
  } //end of main method
} //end of class

  
      
      