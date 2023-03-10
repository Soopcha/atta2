package atta;
/*
Реализовать функцию (именно с таким названием, т.к. проверка автоматическая)
public static int solve(int[] arr) { ... }     ,
которая ищет в массиве целых чисел и возвращает максимальный локальный минимум (значение). Локальные минимумы – элементы массива,
соседи которых по значению больше данного элемента. Под соседями элемента будем понимать элементы непосредственно справа или
слева от данного (у первого и последнего элемента массива – по одному соседу, у остальных – по два). Если массив состоит из одного элемента, такой элемент также будем считать локальным минимумом.
Если локальных минимумов в массиве нет, следует вернуть значение Integer.MIN_VALUE.
Пример:
{ 8, 4, 2, 3, 7, 4, 5, 3 } → 4
Цветом в примере выделены локальные минимумы, красный – максимальный из них.
В решении запрещено создавать новые объекты (массивы, коллекции и т.п.).
Переданный массив изменяться не должен.
Естественно, можно и даже желательно при необходимости использовать вспомогательные функции.
 */


public class Nomber1 {
    public static void main(String[] args) {
        int[] arr = { 10, 9, 7 };
        System.out.println(solve(arr));
    }
    public static int solve(int[] arr) {
        if (arr.length == 1){
            return arr[0];
        }
        if (arr.length==0){
            return Integer.MIN_VALUE;
        }

        int maxLoc=Integer.MIN_VALUE;
        int loc = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++){
            if (i == 0){
                if ( arr[1] > arr[i]){
                    loc = arr[i];
                }
            } else  if (i == arr.length-1){
                if ( arr[arr.length-2] > arr[i]){
                    loc = arr[i];
                }
            } else {
                if ( arr[i+1] > arr[i] && arr[i-1] > arr[i]){
                    loc = arr[i];
                }
            }
            if (loc > maxLoc){
                maxLoc = loc;
            }

        }
        return maxLoc;
    }
}
