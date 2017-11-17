public class threeDArray {
  public static void main(String[]args){
    String[] apple= {"ipod", "iphone"};
    String[] ge= {"fridge", "tv", "washing machine", "Dryer", "dishwasher", "microwave"};
    String[] kenmore= {"fridge", "tv", "washing machine", "Dryer", "dishwasher", "microwave"};
    String[] electroux= {"fridge","dishwasher", "microwave"};
    String[] whirlpool= {"fridge","washing maching", "dryer","dishwasher", "microwave"};
    String[] sony= { "cameras", "tv"};
    String[] stores= {"Best Buy", "Sears", "Frys", "RichardPcSons", "Target"};
    String[] man= {"Apple", "Ge", "KenMore", "Electroulx", "Whirlpool", "Sony"};
    String [][] manf= {apple, ge, kenmore, electroux, whirlpool,sony};
    String[][][] a= {manf, manf, manf, manf,manf};
    print( stores, man, a);
    
  }
  public static void print( String[] a, String[] b, String[][][] c){
   /* for(int i= 0; i<a.length; i++){
      System.out.println(a[i]);
      for(int l= 0; l< b.length; l++){
        System.out.println(b[l]);
      }
    }*/
        for(int m= 0; m< c.length; m++){
           System.out.println(a[m]);
          for(int n= 0; n< c[m].length; n++){
            System.out.println(b[n]);
            for(int k= 0; k< c[m][n].length; k++){
              System.out.println(c[m][n][k]);
            }
          }
        }
        
        
      }
    }
  
    
    
    
    
    
    
    
