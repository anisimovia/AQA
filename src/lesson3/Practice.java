package lesson3;

import java.util.*;

public class Practice {
    public static void main(String[] args) {
//        Вызываем метод twoNumbers() - выводим индексы двух чисел, сумма которых равна target (переменная в методе twoNumbers());
//        List<Integer> numbers = Arrays.asList(2,7,11,15);
//        Integer target = 16;
//        List<String> result = twoNumbers(numbers, target);
//        System.out.println(result);

//        Вызываем метод setCreation - создаем множество с подсчетом количества повторений
//        List<Integer> numbers = Arrays.asList(1,2,3,4,5,4,5,1);
//        Set<String> result = setCreation(numbers);
//        System.out.println(result);

//        Вызываем метод twoSets - пересечение множества
//        Set<Integer> set1 = Set.of(3,4,5);
//        Set<Integer> set2 = Set.of(1,2,3,4,5);
//        Set<Integer> result = twoSets(set1, set2);
//        System.out.println(result);

//        systemOfRegistration - система регистрации пользователя, проверяем наличие имени в Set если нет - записываем, если есть - генерим новое
//        String newName = "Gun";
//        Set<String> names = new HashSet<>(Set.of("Gun", "Josh", "Pit"));
//        String result = systemOfRegistration(newName, names);
//        System.out.println(result);

//        medianOfTwoArrays - получаем медиану двух отсортированных массивов
//        List<Integer> list1 = Arrays.asList(1,2);
//        List<Integer> list2 = Arrays.asList(3,4,5,6,7,8,9);
//        double result = medianOfTwoArrays(list1, list2);
//        System.out.println(result);

    }

    public static List<String> twoNumbers(List<Integer> numbers, int target) {
        List<String> result = new LinkedList<>();
        boolean flag = false;
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = i + 1; j < numbers.size(); j++) {
                if (numbers.get(i) + numbers.get(j) == target) {
                    result.add(i + "," + j);
                    flag = true;
                    break;
                }
            }
            if (flag) {
                break;
            }
        }
        if (!flag) {
            result.add("Пара не найдена");
        }
        return result;
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

    public static Set<Integer> twoSets(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> result = new HashSet<>();

        set1.forEach(element1 -> {
            set2.forEach(element2 -> {
                if (Objects.equals(element1, element2)) {
                    result.add(element1);
                }
            });
        });
        return result;
    }

    public static String systemOfRegistration(String newName, Set<String> names) {

        if (!names.contains(newName)) {
            names.add(newName);
            return "Регистрация прошла успешно";
        } else {
            Random random = new Random();
            String generatedName = newName;
            while (names.contains(generatedName)) {
                StringBuilder builder = new StringBuilder();
                builder.append(newName);
                builder.append(random.nextInt(10));
                generatedName = builder.toString();
            }
            return "Извините, имя " + newName + " уже занято, ваше имя " + generatedName;
        }
    }

    public static double medianOfTwoArrays(List<Integer> list1, List<Integer> list2) {

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
