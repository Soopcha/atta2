package my.testovoe;
//Реализовать функцию (именно с таким названием, т.к. проверка автоматическая)
//public static int solve(int[] arr) { ... }
//которая ищет в массиве целых чисел и возвращает максимальное значение, рядом с которым
// (слева или справа) не содержится значение 0.
//
//Если таких элементов нет - вернуть 0.

public class Nomber1 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 4, 6, 99, 1, 0, 867, 1};
        int[] num2 = new int[4];
        System.out.println(solve(nums));

    }
    public static int solve(int[] arr) {
        int max_ch=0;
        if (arr.length == 1){
            return arr[0];
        }
        if (arr[1] !=0){
            max_ch = arr[0];
        }
        if (arr[arr.length-2] !=0){
            if (max_ch < arr[arr.length-1]) {
                max_ch = arr[arr.length - 1];
            }
        }

        for (int i = 1; i <= arr.length-2; i++){
            if (arr[i-1] != 0 && arr[i+1] != 0 ) {
                if (max_ch < arr[i]) {
                    max_ch = arr[i];
                }
            }
        }
        return max_ch;

    }
}
