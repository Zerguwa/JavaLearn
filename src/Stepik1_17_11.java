import java.util.Scanner;
//TODO У второклассников очень популярна следующая задача:
//
//101 = 1
//8181515 = 4
//1111112 = 0
//8888888 = 14
//1010101 = 3
//7000007 = ?

//Преподавателю программирования в некоем Центре для одаренных детей так понравилась эта задачка, что он решил именно ее использовать для проверки знаний математики 2-го класса у своих учеников.
//
//Пусть первое число x, а соответствующее ему n

public class Stepik1_17_11 {
    public static void main(String[] args) {
        System.out.println("Hello World!!!");

        int count = 0;
        Scanner sc = new Scanner(System.in);
        char[] ch = sc.nextLine().toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '0' || ch[i] == '6' || ch[i] == '9') count++;
            if (ch[i] == '8') count += 2;
        }
        System.out.println(count);
    }
}
