import java.util.Scanner;

public class chuyendoiNgietdo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("menu :");
        System.out.println("1. f to c");
        System.out.println("2. c to f");
        System.out.println("0. exit");
        System.out.println("choice :");
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                System.out.println("f :");
                double f = scanner.nextDouble();
                System.out.println("c :" + fahrehei(f));
                break;
            case 2:
                System.out.println("c :");
                double c =scanner.nextDouble();
                System.out.println("f :" + celsius(c));
                break;
            case 0:
                System.exit(0);

        }
    }
    public static double celsius(double c){
        double f = 1.8 * c + 32;
        return f;
    }
    public  static double fahrehei(double f){
        double c = 1.8 * (f - 32);
        return c;
    }
}
