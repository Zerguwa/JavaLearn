// TODO: 11/17/2022 Напишите программу, которая считает натуральное число n c клавиатуры и создаст список, в котором
//  будут хранится строковые представления чисел от 0 до n-1. Затем программа считывает число m (m <= n) и строку s.
//  Вставьте строку s на позицию m. Выведите список на экран через пробел.

import java.util.ArrayList;
import java.util.Scanner;

public class Stepik1_18_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String str = sc.next();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(i, Integer.toHexString(i));
        }
        list.add(m, str);
        for (String r : list) {
            System.out.print(r + " ");
        }
    }
}
