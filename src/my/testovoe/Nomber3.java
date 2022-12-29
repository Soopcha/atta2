package my.testovoe;
/*
Реализовать функцию (именно с таким названием, т.к. проверка автоматическая)
public static int solve(int[][] arr) { ... }     ,
которая для переданного двумерного массива посчитает кол-во строк, в которых присутствуют как четные, так и нечетные значения.
Обязательно должна быть реализована вспомогательная функция для проверки строки на соответствие указанному условию (проверю "руками").
 */

import java.util.Arrays;

public class Nomber3 {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 1},
                {1, 8},
                {2, 4},
                {3, 4}
        };
        int[][] arr1 = {{4, 5, 6}, {4, 5, 6}, {4, 5, 6}, {4, 5, 6}, {2, 4, 5}, {2, 4, 4}, {2, 4, 4}, {3, 3, 3}};
        int[][] arr2 = {};
        System.out.println(Arrays.toString(arr1[1]));
        System.out.println(solve(arr1));
        System.out.println(solve(arr2));


    }

    public static int solve(int[][] arr) {
        int numberOfSentences = 0;

        for (int i = 0; i < arr.length; i++) {
            if (condition(arr[i])) {
                numberOfSentences++;
            }
        }
        return numberOfSentences;
    }

    public static boolean condition(int[] arr) {
        boolean bool = false;
        int even = 0; //чётные
        int odd = 0;  //нечётные
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            if (even >= 1 && odd >= 1) {
                bool = true;
                break;
            }
        }
        return bool;
    }

}
