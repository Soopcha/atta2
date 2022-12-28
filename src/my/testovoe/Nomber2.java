package my.testovoe;
/*Реализовать функцию (именно с таким названием, т.к. проверка автоматическая)
public static void solve(int[] arr) { ... }     ,
которая переставит местами первый максимальный и последний минимальный элементы в переданном массиве целых чисел.
 */

import java.util.Arrays;

public class Nomber2 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 4, 6, 99, 1, 0, 867, 1};
        int[] num2 = new int[4];
        solve(nums);
        System.out.println(Arrays.toString(nums));

    }

    public static int[] solve(int[] arr) {
        int maxEl = arr[0];
        int minEl = arr[0];
        int indMaxEl = 0;
        int indMinEl = 0;

        if (arr.length == 0 ){
            return arr;
        } else {
            if (arr.length == 1) {
                //System.out.println(Arrays.toString(arr));
                //Utils.printArr(arr);
                // System.out.println(arr); - метод тустринг он не подходит
                return arr;
            } else {
                for (int i = 0; i <= arr.length - 1; i++) {
                    if (arr[i] > maxEl) {
                        maxEl = arr[i];
                        indMaxEl = i;
                    }
                    if (arr[i] <= minEl) {
                        minEl = arr[i];
                        indMinEl = i;
                    }

                }
                arr[indMaxEl] = minEl;
                arr[indMinEl] = maxEl;
                return arr;
            }
        }


    }
}
