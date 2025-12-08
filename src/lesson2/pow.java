package lesson2;

public class pow {
    public static void main(String[] args) {
        int count = 2;
        if (count % 2 == 0) {
        System.out.println(Math.pow(count, 10));
        } else {
            System.out.println(Math.pow(count, 3));
        }
    }
}
