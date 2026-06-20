package lesson3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Repeating_Creation {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,4,5,1);
        Set<String> result = setCreation(numbers);
        System.out.println(result);
    }

    public static Set<String> setCreation(List<Integer> numbers) {

        Set<String> resultNumbers = new HashSet<>();
        Set<Integer> processed = new HashSet<>();
        // запускаем цикл
        for (int i = 0; i < numbers.size(); i++) {
            int count = 0;

            // проверка на уже обработанное значение
            if (processed.contains(numbers.get(i))) {
                continue;
            }

            // считаем количество повторений
            for (int j = i; j < numbers.size(); j++) {
                if (numbers.get(i) == numbers.get(j)) {
                    count++;
                }
            }

            // добавляем значения
            if (count == 1) {
                resultNumbers.add(numbers.get(i).toString());
            } else {
                resultNumbers.add(numbers.get(i).toString() + " - " + count);
                processed.add(numbers.get(i));
            }
        }
        return resultNumbers;
    }
}


