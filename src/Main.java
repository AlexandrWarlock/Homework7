public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        int cost = 15000;
        int all = 2459000;
        int i = 0;
        int moneySave = 0;
        while (cost < all) {
            all = all - cost;
            i = i +1;
            moneySave = i * cost;
            System.out.println("Месяц " + i + " сумма накоплений равна " + moneySave + " рублей");
        }
    }
    public static void task2 () {
        System.out.println("Задача 2");
        int i = 0;
        int j = 10;
        while (i < 10) {
            i++;
            System.out.print(" " + i);
        }
        System.out.println(" ");
        for (; j > 0; j--) {
            System.out.print(" " + j);
        }
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int Y = 12_000_000;
        int bornPerYear = 17 * 1000000 / 1000;
        int diedPerYear = 8 * 1000000 / 1000;
        for (int year = 1; year < 10; year++) {
            Y = Y + bornPerYear - diedPerYear;
            System.out.println("Год " + year + " численность населения состовляет " + Y + " человек");
        }
    }
    public static void task4 () {
        System.out.println("Задача 4");
        double money = 15000;
        int i = 0;
        while (money < 12_000_000) {
            i = i +1;
            money = money + money * 0.07;
            System.out.println("Сумма " + money + " , количество месяцев " + i);
        }
    }
    public static void task5 () {
        System.out.println("Задача 5");
        double money = 15000;
        int i = 0;
        for (; money < 12_000_000; i++) {
            money = money + money * 0.07;
            if (i % 6 == 0) {
                System.out.println("Сумма " + money + " , количество месяцев " + i);
            }
        }
    }
    public static void task6 () {
        System.out.println("Задача 6");
        double money = 15000;
        int i = 0;
        for (; i <= 9 * 12; i++) {
            money = money + money * 0.07;
            if (i % 6 == 0) {
                System.out.println("Сумма " + money + " , количество месяцев " + i);
            }
        }
    }
    public static void task7 () {
        System.out.println("Задача 7");
        int month = 0;
        for (int fr = 0; month < 31; month++) {
            fr = fr +1;
            if ((fr - 2) % 7 == 0 && 0 < fr && fr < 31)
                System.out.println("Сегодня пятница " + fr + " необходимо подготовить отчет" );
        }
    }
    public static void task8 () {
        System.out.println("Задача 8");
        int i = 0;
        for (; i < 2123; i = i + 79) {
            if (i > 1823) {
                System.out.println(i);
            }
        }
    }
}
