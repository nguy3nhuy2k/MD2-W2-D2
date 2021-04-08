import java.util.Scanner;

public class untitled {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] students =  {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        System.out.println("nhap ten cua hoc sinh :");
        String name = scanner.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(name)) {
                System.out.println("Position of the students in the list " + name + " is: " + (i + 1));
                isExist = true;
                break;
            }
        }
        if (!isExist)
            System.out.println("Not found" + name + " in the list.");
    }
}
