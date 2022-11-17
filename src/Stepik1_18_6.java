//TODO Напишите программу, которая считает натуральное число n c клавиатуры и создаст список, в котором первый и
// последний элементы будут равны строчке 1, а между ними будет n 0. Выведите список на экран через пробел.

import java.util.ArrayList;
import java.util.Scanner;

public class Stepik1_18_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        list.add(0, 1);
        for (int i = 1; i <= n + 1; i++) {
            list.add(i, 0);
        }
        list.add(n + 1, 1);
        for (int i = 0; i <= n + 1; i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
