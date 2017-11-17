import java.util.Scanner;
  public class MovieTicket{
  public static void main(String []args){
   Scanner scan = new Scanner(System.in);
      String id= "manager1";
    String psw="myMovie123*";
    int movieTheaterSize= 300;
   managerLogin(id, psw);
    String movieTitle= getMovieInfo();
    double ticketPrice= getMoviePrice();
    int times= getMovieTime();
    int seats= getMovieSeats(movieTheaterSize);
    
    double cosTickets= getTicketValue(seats);
    double inserted= getMoney(cosTickets, ticketPrice);
    double change = returnChange(inserted, ticketPrice);
    
    displayMovieInfo(movieTitle, ticketPrice, times, seats);
    
    
    
  }
  
  public static void managerLogin(String psw, String id){
      Scanner scan = new Scanner(System.in);
    boolean flag= true;
    System.out.println("Enter ID");
    String mgId= scan.next();
    while(flag= true){
      if ( mgId.equals(id)){
        break;
      }
      else{
        System.out.print("Please enter correct password");
      }
    }
    System.out.println("Enter password");
    String password = scan.next();
    while(flag= true){
      if ( password.equals(psw)){
        break;
      }
      else{
        System.out.print("Please enter correct password");
      }
    }
  }
  public static String getMovieInfo(){
       Scanner scan = new Scanner(System.in);
    boolean flag= true;
    System.out.println("What is todays movie?");
    String movieName= scan.next();
    int length= movieName.length;
    while(flag= true){
      if( length <0){
        System.out.print("Please enter valid movie");
      }
      else{ 
        System.out.println(movieName);
      }
    }
    return movieName;
  }
  
  public static double getMoviePrice(){
       Scanner scan = new Scanner(System.in);
    boolean flag= true;
    System.out.println("What is the price of this movie?");
    double moviePrice= scan.nextInt();
    while(flag= true){
      if(moviePrice <0){
        System.out.print("Please enter valid movie price");
        moviePrice= scan.nextInt();
      }
      else{
        return moviePrice;
      }
    }
  }
  
  public static int getMovieTime(){
      Scanner scan = new Scanner(System.in);
    boolean flag= true;
    System.out.println("What is the movie time in military hours?");
    int times= scan.nextInt();
    while(flag= true){
      if(times< 0000){
        System.out.print("Please enter valid movie time");
      }
      else if( times> 2300){
        System.out.print("Please enter valid movie time");
      }
      
      else{ 
        
        return times;
      }
    }
  }
  
  public static int getMovieSeats(int movieTheaterSize){
      Scanner scan = new Scanner(System.in);
    System.out.print("How many seats are available");
    int seats= scan.nextInt();
    boolean flag= true;
    while(flag= true){
      if(seats <0){
        System.out.print("Please enter valid movie theater seats");
      }
      else if (seats> movieTheaterSize){
        System.out.print("Please enter valid movie theater seats");
      }
      else{ 
       seats--;
       break;
      }
    }
     return seats;
  }
  public static void displayMovieInfo(String w, double x, int y, int z){
    System.out.print("The movie being shown today is" + w);
    System.out.print("The price of this movie is" + x);
    System.out.print("The show time is" + y);
    System.out.print("The number of seats available is" + z);
  }
  
  public static int getTicketValue(int seats){
       Scanner scan = new Scanner(System.in);
    System.out.println("How many tickets would you like to purchase?");
      int tickets= scan.nextInt();
    if ( tickets > seats){
      System.out.println("There are not that many seats available");
      
  }
  }
  
  public static double getMoney(double cosTicket, double ticketPrice){
       Scanner scan = new Scanner(System.in);
    double cost= cosTicket* ticketPrice;
System.out.print("Insert money");
    double insert= scan.nextDouble();
    while(true){
      if (insert< cost){
        System.out.println("Please enter more money");
    insert= scan.nextDouble();
      }
    return insert;
  }
  }
  
  public static double returnChange(double insert, double price){
  double change = insert - price;
    return change;
  }
  
  public static void printTicket(String names, double price, int  time){
    System.out.println("Movie Info");
    System.out.println( "Your have brought a ticket to see" +names+ "at" +time+ "for" +price+ "dollars");
  }
  }


  
  
  
  
  
  
  
  