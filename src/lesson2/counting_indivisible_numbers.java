package lesson2;

public class counting_indivisible_numbers {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0) {
                System.out.println(i);
            }
        }
    }
}
