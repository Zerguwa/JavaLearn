import java.util.Scanner;

public class Stepik1_18_2 {
    public static void main(String[] args) {
        boolean fl = false;
        Scanner sc = new Scanner(System.in);
        String mas[] = sc.nextLine().toUpperCase().split(" ");

        for (int i = 0; i < mas.length; i++) {
            if (mas[i].equals("ПОВТОРЕНИЕ")) {
                System.out.println("YES");
                fl = true;
                break;
            }
        }
        if (!fl) System.out.println("NO");
    }
}
