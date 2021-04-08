import java.util.Scanner;

public class max {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("tao do dai mang :");
        int n = scanner.nextInt();
        timmax(n);
    }
    public static void timmax(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int)(Math.random() * 100);
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        int max = arr[0];
        for (int j = 0; j < arr.length; j++) {
            if(arr[j] > max)
                max = arr[j];
        }
        System.out.println("max :" + max);
    }
}