package lesson2;

public class numbers_in_a_row {
    public static void main(String[] args) {
        String str = "нужно посчитать количество цифр 1, 2 и 3 в этой строке 1111 22 2 2 2  33 3 3 3 3 3";
        int i;
        int count_1 = 0;
        int count_2 = 0;
        int count_3 = 0;

        for (i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1') {
                count_1++;
            } if (str.charAt(i) == '2') {
                count_2++;
            } if (str.charAt(i) == '3') {
                count_3++;
            }
        }
        System.out.println("Кол-во 1: " + count_1);
        System.out.println("Кол-во 2: " + count_2);
        System.out.println("Кол-во 3: " + count_3);
    }
}
