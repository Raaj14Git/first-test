import java.util.Scanner;

class Hello{
public static void main (String args[]) {


  int a;
  Scanner scan = new Scanner (System.in);

  do{
System.out.println("enter value A");
a = scan.nextInt();
int factor = a%2;

  }while(a<0);
  System.out.println(factor);
}


}