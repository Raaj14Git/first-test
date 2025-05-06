import java.util.Scanner;

public class Hello{

  public static void main(String args [])
  {
Scanner scan = new Scanner(System.in);
int a = scan .nextInt();


if (a %3 == 0 && a%5 ==0)
System.out.println("a is devide by both 3 and 5");

else if (a%3 == 0)
System.out.println("A is devide by 3 only");

else 
System.out.println("Ais devide by 5 only");


switch (a){

case 1:
System.out.println("case " + a);
break;
case 2:
System.out.println ("case" + a);
  break;
}
    

//System.out.println(res);
  }
}