import java.util.Scanner;

public class gopmang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số phần tử mảng 1:");
        int n = scanner.nextInt();
        arr(n);
        System.out.println("");
        System.out.println("nhập số phần tử mảng 2:");
        int n2 = scanner.nextInt();
        arr(n2);
        int[] arr2 = new int[n + n2];
        for (int i = 0; i < n + n2 ; i++){
        }

    }
    public static void arr(int n){
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
                arr[i]= (int)(Math.floor(Math.random() * 100));
                System.out.print(arr[i] + " ");
            }


    }
}
