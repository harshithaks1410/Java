import java.util.Scanner;
class twolargestno{
    static void find(){
    System.out.println("Enter 2 no");
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    if(a>b){
        System.out.println(a + " is largest");
    }else{
        System.out.println(b + " is largest");
    }
}
}
class threelargestno{
    static void find(){
        System.out.println("Enter 3 no");
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    if(a>b && a>c){
        System.out.println(a + " is largest");
    }else if (b>a && b>c){
        System.out.println(b + " is largest");
    }
    else{
        System.out.println(c + " is largest");
    }
    }
}
class nlargestno{
    public static void find(){
        System.out.println("Enter size  no");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter "+n+" no");
        for (int i =0; i<n;i++){
            arr[i] = sc.nextInt();
        }

        int largest = arr[0];
        for (int i = 1; i < n; i++) {
    if (arr[i] > largest) {
        largest = arr[i];
    }

}
         System.out.println(largest + " is largest");

    }
}
public class largestno {
    public static void main(String[] args){
        twolargestno.find();
        threelargestno.find();
        nlargestno.find();

    }
}

