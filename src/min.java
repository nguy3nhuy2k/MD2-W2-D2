import java.util.Scanner;

public class min {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("tao do dai mang :");
        int n = scanner.nextInt();
        timmin(n);
    }
    public static void timmin(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int)(Math.random() * 30);
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        int min = arr[0];
        for (int j = 0; j < arr.length; j++) {
            if(arr[j] < min)
                min = arr[j];
        }
        System.out.println("min :" + min);
    }
}
