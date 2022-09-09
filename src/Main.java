public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задание 1.1");

        int cash = 29000;
        int totalSum  = 0;
        int i = 0;
        while (totalSum <= 2_459_000) {
            i++;
            totalSum += totalSum / 100;
            totalSum += cash;
            System.out.printf("Месяц %d, сумма накоплений равна %d рублей\n", i, totalSum);
        }

        System.out.println("Задание 1.2");
        for (int x = 1; x <= 10; x++) {
            System.out.print (x + " ");}
        System.out.println();
            for (int y = 10; y>=1; y--) {
                System.out.print( y + " ");
            }
        System.out.println();

        System.out.println("Задание 1.3");
            int population = 12_000_000;
            int natality = 17;
            int mortality = 8;
            int delta = natality-mortality;

            for ( i = 1; i<=10; i++) {
                population = population + ( population/1000*delta);
            System.out.println("Год " + i + " численность населения составляет " + population );}
        }

        public static void task2 () {
            System.out.println("Задание 2.1");

            double totalSum = 15000.00;
            int i = 1;
            double percent = 7;
            while (totalSum <= 12_000_000.00) {
                i++;
                totalSum += totalSum * percent / 100;
                System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей\n", i, totalSum);
            }
            System.out.println("Задание 2.1");
            double cash = 15000.00;
            int j = 1;
            double percent1 = 7;
            while (cash <= 12_000_000.00) {
                j++;
                cash += cash * percent1 / 100;
                if (j % 6 == 0)
                    System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей\n", j, cash);
            }

            System.out.println("Задание 2.3");
            double money = 15000.00;
            int x = 1;
            double percent2 = 7;
            while (money <= 12_000_000.00) {
                x++;
                money += money * percent2 / 100;
                if (x % 6 == 0 && x <= 72)
                    System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей\n", x, money);
            }

            System.out.println("Задание 2.4");
               for ( int friday = 1; friday<=31; friday +=7) {
               System.out.printf ("Сегодня пятница %d-е число. Необходимо подготовить отчет. \n", friday);
           }


       }
       public static void task3(){
           System.out.println("Задание 3.1");
        int i;
        int year = 2022;
        for (i = 0; i%79 == 0; i += 79) {
            boolean x = i >=year-200 && i <=year +100;
            if (x)
            System.out.println( i);
        }

           System.out.println("Задание 3.2");
        int a = 2;
        int b = 0;
        char z = 42;
        char y = 61;
        while (b <10) {
            b++;
            int c = a * b;
            System.out.printf( "%d%c%d%c%d\n", a,z,b,y,c);
        }

        }


}