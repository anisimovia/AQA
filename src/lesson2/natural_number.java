package lesson2;

public class natural_number {
    public static void main(String[] args) {
        int n = 123456789;
        int count = 0;
        int sum = 0;
        int work = 1;
        int arithmetic = 0;
        int sumX2 = 0;
        int sumX3 = 0;
        int nLast = n % 10;

        while (n > 0) {
            int s = n % 10;
            n = n / 10;
            count += 1;
            sum += s;
            work *= s;
            arithmetic = sum / count;
            sumX2 += Math.pow(s, 2);
            sumX3 += Math.pow(s, 3);
        }
//       a) количество цифр
        System.out.println("количество цифр = " + count);
//       б) сумма цифр
        System.out.println("сумма цифр = " + sum);
//       в) произведение цифр
        System.out.println("произведение цифр = " + work);
//       г) ср арифметическое цифр
        System.out.println("ср арифметическое цифр = " + arithmetic);
//       д) сумму квадратов цифр
        System.out.println("сумму квадратов цифр = " + sumX2);
//       e) сумму кубов цифр
        System.out.println("сумму кубов цифр = " + sumX3);
//       ж) первую цифру
        n = 123456789;
        int nFirst = 0;

        while (n > 10) {
            n /= 10;
            nFirst = n;
        }
        System.out.println("Первая цифра в n = " + nFirst);
//       ж) последнюю цифру
        System.out.println("последнюю цифру = " + nLast);
//       з) сумму его первой и последней цифр
        System.out.println("сумму его первой и последней цифр = " + Integer.sum(nLast, nFirst));
    }
}
