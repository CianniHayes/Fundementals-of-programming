import java.util.Scanner;
public class Pyramid {
  public static void main(String [] args) {
    Scanner input = new Scanner(System.in);
    System.out.println ( "Enter the number of lines (2- 15) :" ); 
    int height = input.nextInt();
    
    if (height > 15) {
      System.out.println("Error the number of lines you enter must be between 2 and 15!");
                           System.out.println ( "Enter the number of lines (2- 15) :" ); 
                         
                         }
 else if (height< 2) {
   System.out.println("Error the number of lines you enter must be between 2 and 15!");
                        System.out.println ( "Enter the number of lines (2- 15) :" ); 
                      }
else {
  System.out.print(height); 
}
     

int i; 
int j;

for (i=1; i<= height ; i++){
  for ( j= 0; j < 2*(height -i); j++){
  System.out.print( " " );
  }
  for (j= i; j>= 1; j--) {
    System.out.print( j + " " );
  }
  for (j=2; j<=i; j++) {
    System.out.print( j + " " );
  }
  System.out.println();
}
  }
}
  
                                
                              