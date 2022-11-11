import java.util.Scanner;
//TODO Ввод и вывод данных производятся через стандартные потоки ввода-вывода.
//
//На планете Роботов очень не любят десятичную систему счисления, поэтому они попросили Вас написать программу, которая заменяет все встречающиеся в тексте числа на эти же числа, но в двоичной системе счисления.

public class Stepik1_17_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] ch = sc.nextLine().toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (Character.isDigit(ch[i])) {
                System.out.print(Integer.toBinaryString(Integer.parseInt(String.valueOf(ch[i]))));
            } else System.out.println(ch[i]);
        }
    }
}
