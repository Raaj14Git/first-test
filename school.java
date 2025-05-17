public class school {

 

    public  static void main (String args[]){

int num []= {21,22,22,23};


for (int i=0; i<num.length; i++)
{
System.out.println("for loop " +num[i]);

}


for (int var:num)
{
    System.out.println(var);
}
    }
    
}
