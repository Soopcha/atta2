package my.testovoe;
/*
Реализовать функцию (именно с таким названием, т.к. проверка автоматическая)
public static Map<Integer, Integer> solve(List<Integer> list) { ... }     ,
которая найдет и вернет в виде словаря наиболее часто встречающиеся значения в списке целых чисел.
Ключом в данном словаре являются числа в переданном списке, значением - позиции (индексы) первого появления данных чисел в списке.
Пример:
[ 3, 7, 1, 3, 5, 1, 6, 1, 7, 7, 2, 5 ] → { 1: 2, 7: 1 }
В данном примере в списке наиболее часто (по 3 раза) встречаются числа 1 и 7, 1 первый раз встречается в позиции 2 (нумерация с 0), 7 – в позиции 1.
Порядок ключей в словаре не важен (тем более в общем случае этот порядок для словаря не определен). Естественно, можно и даже желательно,
если есть необходимость, использовать дополнительные функции.
 */

import java.util.*;

public class Nomber5 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(3);
        list.add(45);
        list.add(4);
        list.add(4);
        list.add(54);
        list.add(54);
        list.add(54);
        System.out.println(list.get(1));

        List<Integer> list3 = Arrays.asList(109, 109, 184, 183, 134, 111, 184);
        Map<Integer, Integer> map = solve(list3);
        System.out.println(map);


    }

    public static Map<Integer, Integer> solve(List<Integer> list) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxRepeats = 0;
        for (int i = 0; i < list.size(); i++) {
            int kolRepeats = 0;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    ++kolRepeats;
                }
            }
            if (kolRepeats > maxRepeats) {
                maxRepeats = kolRepeats;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            int kolRepeats = 0;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {  //без .equals ничео не получится тк сравнение видимо ссылок
                    ++kolRepeats;
                }
            }
            if (kolRepeats == maxRepeats){
                map.put(list.get(i), i);
            }
        }
        return map;
    }
}
