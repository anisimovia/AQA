package lesson2;

public class natural_number {
    public static void main(String[] args) {

        //объявляем переменные
        int n = 123456789;
        int count = 0;
        int sumn = 0;
        int work = 1;
        int arithmetic = 0;
        int sumX2 = 0;
        int sumX3 = 0;

        //запускаем цикл
        while (n > 0) {
            int d = n % 10;
            n /= 10;
            count++;
            sumn += d;
            work *= d;
            arithmetic = sumn / count;
            sumX2 += (int) Math.pow(d, 2);
            sumX3 += (int) Math.pow(d, 3);
        }

        //выводим значение n
        System.out.println("n = 123456789");

        //выводим количество цифр в n
        System.out.println("Количество цифр в n = " + count);

        //выводим сумму всех цифр в n
        System.out.println("Сумма всех цифр в n = " + sumn);

        //выводим произведение всех цифр в n
        System.out.println("Произведение всех цифр в n = " + work);

        //выводим среднее арифметическое значение всех цифр в n
        System.out.println("Среднее арифметическое значение всех цифр в n = " + arithmetic);

        //выводим сумму квадратов всех цифр в n
        System.out.println("Сумма квадратов всех цифр в n = " + sumX2);

        //выводим сумму кубов всех цифр в n
        System.out.println("Сумма кубов всех цифр в n = " + sumX3);

        //выводим первую цифру в n
        n = 123456789;
        int nFirst = 0;

        while (n >= 10) {
            n /= 10;
            nFirst = n;
        }
        System.out.println("Первая цифра в n = " + nFirst);

        //выводим последнюю цифру в n
        n = 123456789;
        int nLast = 0;

        while (n >= 10) {
            n %= 10;
            nLast = n;
        }
        System.out.println("Последняя цифра в n = " + nLast);

        //выводим сумму первой и последней цифры

        System.out.println("Сумма первой и последней цифр в n = " + Integer.sum(nLast, nFirst));
    }
}
