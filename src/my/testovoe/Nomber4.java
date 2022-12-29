package my.testovoe;
/*
Реализовать функцию (именно с таким названием, т.к. проверка автоматическая)
public static int[][] solve(int rowCount, int colCount) { ... }     ,
которая создает и возвращает прямоугольный двумерный массив размером из rowCount строк и colCount столбцов, заполненный значениями
по следующему шаблону:

0	1	2	3	4	5
1	2	3	4	5	6
2	3	4	5	6	7
3	4	5	6	7	8
Для примера:

Тест	Результат
int[][] arr = solve(4, 6);
Utils.printArr(arr);
{
  { 0, 1, 2, 3, 4, 5 },
  { 1, 2, 3, 4, 5, 6 },
  { 2, 3, 4, 5, 6, 7 },
  { 3, 4, 5, 6, 7, 8 }
}
int[][] arr = solve(4, 6);
Utils.printArr(arr);
{
  { 0, 1, 2, 3, 4, 5 },
  { 1, 2, 3, 4, 5, 6 },
  { 2, 3, 4, 5, 6, 7 },
  { 3, 4, 5, 6, 7, 8 }
}
 */

import java.util.Arrays;

public class Nomber4 {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(solve(4, 6)));
        System.out.println(Arrays.deepToString(solve(1, 10)));
        System.out.println(Arrays.deepToString(solve(0, 0)));
        System.out.println(Arrays.deepToString(solve(11, 11)));
    }

    public static int[][] solve(int rowCount, int colCount) { //row - строка column-столбец
        int nomber = 0;
        int[][] arr = new int[rowCount][colCount];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = nomber;
                nomber ++;
                if (j == arr[i].length-1){
                    nomber = nomber - arr[i].length+1;
                }
            }
        }
        return arr;
    }
}
