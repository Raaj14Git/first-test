import java.util.Scanner;
import java.util.Random;

public class Hello{

  public static void main (String args[]) {

    Random rand = new Random();
    int i = 0;
    
    while(i!=5 )
    
     

    {
      i = rand.nextInt(8);

      System.out.println(i);

     // i++;
    }
  }
}
