import java.util.Scanner;
class twosum{
    public static void sum(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a+b);
    }
} 

class nsum{
    public static void sum(){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("enter no.");
        int n = sc.nextInt();
        int sums=0;
        while(n>0){
            int digit=n%10;
            sums=sums+digit;
            n=n/10;
        }
        System.out.print(sums);

    }
}

public class sumofdigits {
    public static void main(String[]args){
        twosum.sum();
        nsum.sum();

    }
}
