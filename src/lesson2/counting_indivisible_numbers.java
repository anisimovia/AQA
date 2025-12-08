package lesson2;

public class counting_indivisible_numbers {
    public static void main(String[] args) {
        int n = 10;
        int i = 1;
        int count = 0;
        while (i <= n) {
            if (i != 2 && i != 3 && i != 5) {
                count++;
            }
            i++;
        }
        System.out.println(count);
        int c;
        for (c = 1; c < 5; c++) {
            System.out.println("Итерация " + c);
        }
    }
}
