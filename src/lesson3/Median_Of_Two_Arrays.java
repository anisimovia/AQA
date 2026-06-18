package lesson3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Median_Of_Two_Arrays {
    public static void main(String[] args) {

//        medianOfTwoArrays - получаем медиану двух отсортированных массивов
        List<Integer> list1 = Arrays.asList(1,3,5);
        List<Integer> list2 = Arrays.asList(2,4,6,7,8,9);
        double result = medianOfTwoArrays1(list1, list2);
        System.out.println(result);
    }

    public static double medianOfTwoArrays1(List<Integer> list1, List<Integer> list2) {

        List<Integer> result = new ArrayList<>();
//        Объявляем переменные счетчики
        int pointer1 = 0;
        int pointer2 = 0;

//        Запускаем цикл сравнения значений в массивах
        while (pointer1 < list1.size() && pointer2 < list2.size()){
            if (list1.get(pointer1) < list2.get(pointer2)){
                result.add(list1.get(pointer1));
                pointer1++;
            }else {
                result.add(list2.get(pointer2));
                pointer2++;
            }
        }
//        Если в каком-то из двух массивов после перебора остались значения, то мы просто добавляим их к общему списку
        if (pointer1 < list1.size()){
            while (pointer1 < list1.size()) {
                result.add(list1.get(pointer1));
                pointer1++;
            }
        }
        if (pointer2 < list2.size()){
            while (pointer2 < list2.size()) {
                result.add(list2.get(pointer2));
                pointer2++;
            }
        }
//        Выводим медиану объединенного списка с учетом четности
        double median;
        if (result.size() % 2 == 1) {
            median = result.get(result.size()/2);
        } else {
            median = (double) (result.get((result.size()/2)-1) + result.get(result.size()/2))/2;
        }
        return median;
    }
}
