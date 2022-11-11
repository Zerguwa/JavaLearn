import java.util.Scanner;

public class Stepik1_17_11 {
    public static void main(String[] args) {
        System.out.println("Hello World!!!");

        int count = 0;
        Scanner sc = new Scanner(System.in);
        char[] ch = sc.nextLine().toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '0' || ch[i] == '6' || ch[i] == '9') count++;
            if (ch[i]=='8') count+=2;
                   }
        System.out.println(count);
    }
}
