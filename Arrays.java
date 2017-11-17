import java.util.Scanner;
  public class Arrays{
  public static void main(String [] args){
    Scanner scan = new Scanner(System.in);
    int[] myList= new int[10];
    System.out.println("Enter 10 integers");
    for (int i = 0; i < 10; i++){
      myList[i] = scan.nextInt();
    }
    for ( int i = 0 ; i < 10; i++) {
      System.out.println(myList[i]);
    }
   
    System.out.println("The highest entry is " + largestNum(myList));
     System.out.println("The lowest entry is " + smallestNum(myList));
      System.out.println("The sum is " + arraySum(myList));
     printNewArray(myList);
    
    
  }
  
  public static int largestNum(int[] myList){
  int highestNum= 0;
    for( int i = 0; i< myList.length ; i++){
    if ( myList[0] > myList[i]){
       highestNum = myList[0];
    }
    else {
      highestNum = myList[i];
    }
      
  
}
      return highestNum;
  }
  
  public static int smallestNum(int[] myList) {
    int smallestNum= 0;
    for( int i = 0; i< myList.length ; i++){
    if (myList[0] < myList[i]){
       smallestNum = myList[0];
    }
    else{
      smallestNum = myList[i];
    }
    
  }
     return smallestNum;
   
  }
  
  public static int arraySum(int[] myList){
     int sum=0;
    for ( int i = 0; i< myList.length ; i++){
       sum += i;
    }
    
    return sum;
  }
  
  public static void printNewArray(int[] myList){
    int[] newArray= new int[10];
    for ( int i = 0; i < myList.length ; i++){
      if (i == myList[0]){
        newArray[0] = myList[9];
      }
      else if (i == myList[1]){
        newArray[1] = myList[8];
      }
      else if (i == myList[2]){
        newArray[2] = myList[7];
      }
      else if (i == myList[3]){
        newArray[3] = myList[6];
      }
      else if (i == myList[4]){
        newArray[4] = myList[5];
      }
      else if (i == myList[5]){
        newArray[5] = myList[4];
      }
      else if (i == myList[6]){
        newArray[6] = myList[3];
      }
      else if (i == myList[7]){
        newArray[7] = myList[2];
      }
      else if (i == myList[8]){
        newArray[8] = myList[1];
      }
      else if (i == myList[9]){
        newArray[9] = myList[0];
      }
    }
    for ( int i = 0; i < myList.length ; i++){
    System.out.println(myList[i]+ "  " +  newArray[i]);

  }
  }
  }
    
        
        
        
        
        
        
        
        
        
        
        
        