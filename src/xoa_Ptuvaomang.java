import java.util.Scanner;

public class xoa_Ptuvaomang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1,n2;
        do {
            System.out.println("nhập số ptu vao mảng :");
            n1 = scanner.nextInt();
        } while ( n1 <= 0);
        int[] arr = new int[n1];
        System.out.println("nhập các ptu vao mang :");
        for (int i = 0; i < n1; i++) {
            System.out.println("nhập ptu thứ " + i + ": " );
            arr[i] = scanner.nextInt();

        }
        System.out.println("nhập số nguyên :");
        int num = scanner.nextInt();
        int i;
        for ( n2 = i = 0; i < n1 ; i++) {
            if(arr[i] != num){
                arr[n2] = arr[i];
                n2++;
            }
        }
        n1 = n2;

        for (i = 0; i < n1; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
