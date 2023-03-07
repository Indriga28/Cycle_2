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

    public static void task1() {
        System.out.println("Задача 1");
        int savings = 15000;
        int total = 0;
        int month = 1;
        while (total <= 2459000) {
            total = savings + total;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей.");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int number = 0;
        while (number < 10) {
            number++;
            System.out.print(number + " ");
        }
        System.out.println("");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }

    public static void task3 () {
        System.out.println();
        System.out.println("Задача 3");
        int year = 1;
        int population = 12000000;
        int mortality = 8;
        int birth = 17;
        int growthRate = birth - mortality;
        while (year <= 10) {
            population = population + (population/1000 * growthRate);
            year++;
            System.out.println("Year " + year + ", population equals to " + population);
        }
    }

    public static void task4 () {
        System.out.println("Задача 4");
        int savings = 15000;
        int month = 1;
        int interest = 7;
        while (savings < 12_000_000) {
        savings = savings + savings * interest/100;
            System.out.println(month + " - " + savings);
        month++;
        }
    }
    public static void task5 () {
        System.out.println("Задача 5");
        int savings = 15000;
        int month = 1;
        int interest = 7;
        while (savings < 12_000_000) {
            savings = savings + savings * interest/100;
            month++;
            if (month%6 ==0) {
            System.out.println(month + " - " + savings); }
        }
    }

    public static void task6 () {
        System.out.println("Задача 6");
        int savings = 15000;
        int month = 1;
        int interest = 7;
        while (month < 108) {
            savings = savings + savings*interest/100;
            month++;
            if (month%6==0) {
            System.out.println(month + " - " + savings); }
        }

    }
    public static void task7 () {
        System.out.println("Задача 7");
        int friday = 3;
        int month = friday;
        while (month <= 31) {
            if (month == 1 || month == 21 || month == 31) {
                System.out.println("Today is Friday, the " + month + "st. Time to prepare a report");
            } else if (month == 2 || month == 22) {
                System.out.println("Today is Friday, the " + month + "nd. Time to prepare a report");
            } else if (month == 3 || month == 23){
                System.out.println("Today is Friday, the " + month + "rd. Time to prepare a report");
            } else {
                System.out.println("Today is Friday, the " + month + "th. Time to prepare a report");
            }
            month += 7;
        }
    }

    public static void task8 () {
        System.out.println("Задача 8");
        int year = 0;
        int comet = 79;
        int nowdays = 2022;
        while (year < nowdays + 100) {
            year += comet;
            if (year > nowdays - 200 && year < nowdays +100)   {
                System.out.println(year);
            }
        }

    }
}