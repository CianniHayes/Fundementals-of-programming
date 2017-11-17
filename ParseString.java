import java.util.Scanner;
  public class ParseString {
  public static void main(String [] args){
    Scanner scan = new Scanner(System.in);
      System.out.print("Enter a string that consists of some lower case letters, some uppercase letters, some digits, and some special character (#,*,$,&)"); // prompts user to enter string of any lenght
    String message= scan.next();
    printMsg(message); //calls printMsg method
    System.out.println( "The amount of lowercase letters in the input string is: " + countLowerCase(message)); //calls countLowerCase Method
       System.out.println( "The amount of uppercase letters in the user string is: " + countUpperCase(message)); //calls countUpperCase Method
      System.out.println( "The amount of digits in the user string is: " + countDigit(message));//calls countDigit Method
   System.out.println( "The amount of special characters in the user string is: " + countSpecialChar(message));//calls countSpecialChar Method
  }
  
  public static void printMsg(String message) {
    String message1 = message;
    System.out.println("The users input was " +message1); //prints the message
  }
  
  public static int countLowerCase(String message) {
    int i = 0;
    int j=0;
    boolean isLowerCase= false; 
    int sum;
    for (i=0; i<message.length(); i++){
      if (Character.isLowerCase(message.charAt(i))){
        isLowerCase= true;
        j++; // j is incremented if the character at i is LowerCase
      }
      else {
        isLowerCase = false;
      }
    }
    return j;
  }
  
  public static int countUpperCase(String message) {
     int i = 0;
     int j=0;
    boolean isUpperCase= false; 
    int sum;
    for (i=0; i<message.length(); i++){
      if (Character.isUpperCase(message.charAt(i))){
        isUpperCase= true;
        j++; // j is incremented if the character at i is UpperCase
      }
      else {
        isUpperCase = false;
      }
    }
    return j;
  }
  public static int countDigit(String message) {
     int i = 0;
     int j=0;
    boolean isDigit= false; 
    for (i=0; i<message.length(); i++){
      if (Character.isDigit(message.charAt(i))){
        isDigit= true;
        j++; // j is incremented if the character at i is Digit
      }
      else {
        isDigit = false;
      }
    }
    return j;
  }
  public static int countSpecialChar(String message) {
    int i = 0;
    int j = 0;
    boolean isSpecialCharacter= false;
    for (i=0; i<message.length(); i++){
      if (message.charAt(i)== '#'){
        isSpecialCharacter= true;
        j++; // j is incremented if the character at i is #
      }
      else if (message.charAt(i)== '*'){
         isSpecialCharacter= true;
        j++; // j is incremented if the character at i is *
      }
      else if (message.charAt(i)== '$'){
        isSpecialCharacter= true;
        j++;// j is incremented if the character at i is $
      }
      else if (message.charAt(i)=='&') {
        isSpecialCharacter= true;
      j++;// j is incremented if the character at i is &
      }
      else {
        isSpecialCharacter = false;
      }
    }
    return j;
  }
}
  
        
  
  