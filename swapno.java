import java.util.Scanner;
class usingthird{
    public static void find(){

    System.out.println("Enter a , b no.");
     Scanner sc = new Scanner(System.in);
     int a = sc.nextInt();
     int b = sc.nextInt();
     System.out.println("Before a = "+a+ " b= "+b);
     int temp =a;
     a = b;
     b= temp;
     System.out.println("a = "+a+ " b = "+b );
    }
    }
class withouthird{
    public static void find(){
        System.out.println("Enter a , b no.");
     Scanner sc = new Scanner(System.in);
     int a = sc.nextInt();
     int b = sc.nextInt();
     System.out.println("Before a = "+a+ " b= "+b);
     a= a+b;
     b= a-b;
     a= a-b;
    System.out.println("a = "+a+ " b = "+b );
    }
}    

    
public class swapno{
    public static void main(String []args){
        usingthird.find();
        withouthird.find();
    }
}    