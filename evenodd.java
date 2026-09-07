import java.util.Scanner;
public class evenodd {
    public static void main(String [ ] args){
         System.out.print("Enter Number size :");
        Scanner scan = new Scanner (System.in);
        int n  = scan.nextInt() ;
        // int[] arr = new int[n];
        System.out.println(n);
        System.out.println("Enter " + n + " numbers:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
              arr[i] = scan.nextInt();
        if(arr[i]%2==0){
            System.out.println(arr[i] + " is Even");
        }
        else{
            System.out.println(arr[i] + " is Odd");
        }

    }
}
}