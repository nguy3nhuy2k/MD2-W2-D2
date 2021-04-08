import java.util.Scanner;

public class maxmang2chieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so hang");
        int n = scanner.nextInt();
        System.out.println("nhap so cot");
        int m = scanner.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m ; j++) {
                arr[i][j]= (int)(Math.floor(Math.random() * 100));
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println("max :" + max(arr));
        System.out.println("min :" + min(arr));

    }
    public static int max(int[][] arr){
        int max = arr[0][0];
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if(arr[i][j] > max)
                    max = arr[i][j];
            }
        }
        return max;
    }
    public static int min(int[][]arr){
        int min = arr[0][0];
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if(arr[i][j] < min)
                    min = arr[i][j];
            }
        }
        return min;
    }


}
