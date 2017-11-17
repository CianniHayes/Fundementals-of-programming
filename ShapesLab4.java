import java.util.Scanner;
  public class ShapesLab4 {
  public static void main(String[]args) {
    Scanner input= new Scanner(System.in); 
    System.out.println("1.Circle");
      System.out.println("2.Triangle");
      System.out.println("3. Square");
      System.out.println("4.Rectangle");
     System.out.println("Choose from one of these shapes (enter 1,2,3,4):");
       int Shape = input.nextInt();
    double Area = 0;
       if (Shape== 1){  
      System.out.println("Enter the radius of the Circle");
        int radius= input.nextInt();
        final double PI= 3.14;
         Area= PI * radius * radius;
        System.out.print("Area of the Circle ="+ Area);
       
        
       }
       
       else if (Shape == 2){
         System.out.println("Enter base of the Triangle");
       int base= input.nextInt();
       System.out.println("Enter height of the triangle");
       int height= input.nextInt();
      Area = base * height/ 2;
       System.out.print("Area of the Triangle="+ Area);
       
       }
       else if (Shape == 3) {
         System.out.println("Enter length of side");
         int length= input.nextInt();
        Area = length* length;
         System.out.print("Area of the rectangle ="+ Area);
        
        
                            }
else if (Shape== 4) {
  System.out.println("Enter width of the rectangle");
  int width= input.nextInt();
                     System.out.println("Enter length of the rectangle");
                      int length= input.nextInt(); 
                      Area= width * length;
                      System.out.print("Area of the Rectangle="+ Area);
                     
}
}
  }

                            
      
      
      