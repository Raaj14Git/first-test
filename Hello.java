import java.util.Scanner;

public class Hello{
  public static void main (String arg[]){

    Scanner scan = new Scanner (System.in);
System.out.println("enter 1st value");
    int a = scan.nextInt();
System.out.println("enter 2nd value");

int b = scan.nextInt();

String res = a>b ? "a is grater " : " b is grater";

System.out.println(res);
  }
}