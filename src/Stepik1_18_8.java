// TODO: 11/18/2022 Напишите программу, которая считает натуральное число n c клавиатуры и создаст список,
//  в котором будут хранится строковые представления чисел от 0 до n-1. Затем программа считывает число m (m < n) и строку s.
// Замените строкой s элемент на позиции m. Выведите список на экран через пробел.

import java.util.ArrayList;
import java.util.Scanner;

public class Stepik1_18_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String str = sc.next();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i <= n - 1; i++) {
            list.add(i, Integer.toString(i));
        }
        list.set(m, str);
        for (String r : list) {
            System.out.print(r + " ");
        }

    }
}
