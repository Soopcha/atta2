package atta;

import java.util.Arrays;

/*
Будем называть соседями элемента массива элементы, которые находятся от него слева или справа (индексы отличаются на 1).
Будем называть особыми элементами массива такие, которые четные (по значению) и при этом имеют нечетных соседей.
Необходимо реализовать функцию (именно с таким названием, т.к. проверка автоматическая)
public static void solve(int[] arr) { ... }     ,
которая в переданном массиве целых чисел заменит значения всех особых элементов на значение самого минимального из них (см. пример).
Пример:
{ 4, 2, 8, 3, 6, 8, 7 } → { 4, 2, 6, 3, 6, 6, 7 }
Цветом выделены все особые элементы массива, красным – минимальный из них.
В решении запрещено создавать новые объекты (массивы, коллекции и т.п.).
Естественно, можно и даже желательно при необходимости использовать вспомогательные функции.
 */
public class Nomber2 {
    public static void main(String[] args) {
        int[] arr = {-2, -4, -5, -8};
        solve(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static int[] solve(int[] arr) {
        int minEl = 456;
        int kolzamen = 0;

        if (arr.length == 0) {
            return arr;
        }
        if (arr.length == 1) {
            return arr;
        }
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] % 2 == 0) {
                if (i == 0) {
                    if (arr[1] % 2 != 0) {
                        minEl = arr[i];
                        kolzamen++;
                    }
                } else if (i == arr.length - 1) {
                    if (arr[arr.length - 2] % 2 != 0) {
                        if (minEl > arr[i]) {
                            minEl = arr[i];
                        }
                        kolzamen++;
                    }
                } else {
                    if (arr[i - 1] % 2 != 0 || arr[i + 1] % 2 != 0) {
                        if (minEl > arr[i]) {
                            minEl = arr[i];
                        }
                        kolzamen++;
                    }
                }
            }


        }
        if (kolzamen == 0) {
            return arr;
        }
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] % 2 == 0) {
                if (i == 0) {
                    if (arr[1] % 2!=0) {
                        arr[0] = minEl;
                    }
                } else if (i == arr.length - 1) {
                    if (arr[arr.length - 2] % 2 !=0) {
                        arr[i] = minEl;
                    }
                } else {
                    if (arr[i - 1] % 2 != 0 || arr[i + 1] % 2 != 0) {
                        arr[i] = minEl;
                    }
                }
            }


        }
        return arr;


    }


    public static void solve1(int[] arr) {
        int minEl = 456;
        int kolzamen = 0;

        if (arr.length == 0) {
            System.out.println(Arrays.toString(arr));
        }
        if (arr.length == 1) {
            System.out.println(Arrays.toString(arr));
        }
        for (int i = 0; i <= arr.length - 1; i++) {
            if (i == 0) {
                if (arr[0] % 2 == 0 && arr[1] % 2 == 1) {
                    minEl = arr[0];
                    kolzamen++;
                }
            } else if (i == arr.length - 1) {
                if (arr[arr.length - 1] % 2 == 0 && arr[arr.length - 2] % 2 == 1) {
                    if (minEl > arr[arr.length - 1]) {
                        minEl = arr[arr.length - 1];
                    }
                    kolzamen++;
                }
            } else {
                if (arr[i] % 2 == 0) {
                    if (arr[i - 1] % 2 == 1 || arr[i + 1] % 2 == 1) {
                        if (minEl > arr[i]) {
                            minEl = arr[i];
                        }
                        kolzamen++;
                    }
                }
            }

        }
        if (kolzamen == 0) {
            System.out.println(Arrays.toString(arr));
        }
        for (int i = 0; i <= arr.length - 1; i++) {
            if (i == 0) {
                if (arr[0] % 2 == 0 && arr[1] % 2 == 1) {
                    arr[0] = minEl;
                }
            } else if (i == arr.length - 1) {
                if (arr[arr.length - 1] % 2 == 0 && arr[arr.length - 2] % 2 == 1) {
                    arr[arr.length - 1] = minEl;

                }
            } else {
                if (arr[i] % 2 == 0) {
                    if (arr[i - 1] % 2 == 1 || arr[i + 1] % 2 == 1) {
                        arr[i] = minEl;
                    }
                }
            }

        }
        System.out.println(Arrays.toString(arr));


    }
}
