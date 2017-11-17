public class Array{
  public static void main(String [] args){
    int[] randomArray= randomArray(); 
    printArray(randomArray);
    System.out.println("Mean: " +mean(randomArray));
    System.out.println("Range: " +range(randomArray));
    System.out.println("Standard Deviation: " +standardDeviation(randomArray));
    System.out.println("Variance: " +(standardDeviation(randomArray)*standardDeviation(randomArray)));   
  }
  public static int[] randomArray(){
    int[] randomArray=new int[9];
    for(int i = 0; i<9; i++){
      randomArray[i] =(int) (Math.random()*15);
    }
    return randomArray;
  }
  
  public static void printArray(int[] randomArray){
    for(int i = 0; i<randomArray.length; i++){
      System.out.println("element " + i+ " is " + randomArray[i]);
    }
  }
  public static double mean(int[] randomArray){
  int n = randomArray.length;
  double mean=0; 
  for( int i = 0; i<randomArray.length; i++){
    mean+= randomArray[i];
  }
  double average= mean/n;
return average;
  }
  
  public static int range(int[] randomArray){
    java.util.Arrays.sort(randomArray);
    int min= randomArray[0];
    int max= randomArray[8];
    int range= max- min;
    return range;
  }
  public static double standardDeviation(int[] randomArray){
  int n = randomArray.length;
  double sqr= 0;
  double val = 0;
  double mean = mean(randomArray);
  for(int i = 0; i<randomArray.length; i++){
    sqr= (randomArray[i]-mean)*(randomArray[i]-mean);
    val+= sqr;
  }
    double variance= val/(n-1);
    double std= Math.sqrt(variance);
    return std;
  }
}
    
    
    
  
    
      