public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int integerExample = 2000000000;
        byte byteExample = 127;
        short shortExample = 32000;
        long longExample = 2148000000L;
        float floatExample = 3.89f;
        double doubleExample = 45.99999999;
        System.out.println("Значение переменной integerExample с типом int равно " + integerExample);
        System.out.println("Значение переменной byteExample с типом byte равно " + byteExample);
        System.out.println("Значение переменной shortExample с типом short равно " + shortExample);
        System.out.println("Значение переменной longExample с типом long равно " + longExample);
        System.out.println("Значение переменной floatExample с типом float равно " + floatExample);
        System.out.println("Значение переменной doubleExample с типом double равно " + doubleExample);

        System.out.println("\nЗадача 2");
        float myFloat = 27.12f;
        long myLong = 987678965549L;
        short myShort = 2786;
        short myShort2 = 569;
        short myShort3 = -159;
        short myShort4 = 27897;
        byte myByte = 67;

        System.out.println("\nЗадача 3");
        byte numOfKids1 = 23;
        byte numOfKids2 = 27;
        byte numOfKids3 = 30;
        int paperSheetsTotal = 480;
        int paperSheetsPerStudent = paperSheetsTotal / (numOfKids1 + numOfKids2 + numOfKids3);
        System.out.println("На каждого ученика рассчитано " + paperSheetsPerStudent + " листов бумаги.");

        System.out.println("\nЗадача 4");
        byte productivityPerMinute = 16/2;
        int twentyMinutesProductivity = productivityPerMinute * 20;
        System.out.println("За 20 минут машина произвела " + twentyMinutesProductivity + " штук бутылок.");
        int dailyProductivity = productivityPerMinute * 60 * 24;
        System.out.println("За сутки машина произвела " + dailyProductivity + " штук бутылок.");
        int threeDaysProductivity = dailyProductivity * 3;
        System.out.println("За три дня машина произвела " + threeDaysProductivity + " штук бутылок.");
        int monthlyProductivity = threeDaysProductivity * 10;
        System.out.println("За месяц машина произвела " + monthlyProductivity + " штук бутылок.");

        System.out.println("\nЗадача 5");
        short totalPaintBought = 120;
        byte whitePaintPerRoom = 2;
        byte brownPaintPerRoom = 4;
        int rooms = totalPaintBought / (whitePaintPerRoom + brownPaintPerRoom);
        int whitePaintBought = rooms * whitePaintPerRoom;
        int brownPaintBought = rooms * brownPaintPerRoom;
        System.out.println("В школе, где " + rooms + " классов, нужно " + whitePaintBought + " банок белой краски и " + brownPaintBought + " банок коричневой краски.");

        System.out.println("\nЗадача 6");
        byte bananaQuantity = 5;
        byte bananaWeight = 80;
        short milkQuantity = 200;
        float milkWeight = 105f/100f;
        byte iceCreamQuantity = 2;
        byte iceCreamWeight = 100;
        byte eggQuantity = 4;
        byte eggWeight = 70;
        int breakfastGm = bananaQuantity * bananaWeight + (int)(milkQuantity * milkWeight) + iceCreamQuantity * iceCreamWeight + eggQuantity * eggWeight;
        float breakfastKg = breakfastGm / 1000f;
        System.out.println("Вес спортзавтрака в граммах: " + breakfastGm);
        System.out.println("Вес спортзавтрака в килограммах: " + breakfastKg);

        System.out.println("\nЗадача 7");
        short totalWeight = 7000;
        short weightPerDay1 = 250;
        short weightPerDay2 = 500;
        short days1 = 7000/250;
        short days2 = 7000/500;
        int averageDays = (days1 + days2) / 2;
        System.out.println( days1 + " дней уйдет на похудение, если спортсмен будет терять каждый день по 250 грамм.");
        System.out.println( days2 + " дней уйдет на похудение, если спортсмен будет терять каждый день по 500 грамм.");
        System.out.println( averageDays + " день уйдет на похудение в среднем.");

        System.out.println("\nЗадача 8");
        int mashaSalary = 67760;
        int denisSalary = 83690;
        int christinaSalary = 76230;

        float mashaNewSalary = mashaSalary * 1.1f;
        float mashaSalaryDiff =  mashaNewSalary - mashaSalary;
        System.out.println("Маша теперь получает " + mashaNewSalary + " рублей. Годовой доход вырос на " + mashaSalaryDiff + " рублей");

        float denisNewSalary = denisSalary * 1.1f;
        float denisSalaryDiff =  denisNewSalary - denisSalary;
        System.out.println("Денис теперь получает " + denisNewSalary + " рублей. Годовой доход вырос на " + denisSalaryDiff + " рублей");

        float christinaNewSalary = christinaSalary * 1.1f;
        float christinaSalaryDiff =  christinaNewSalary - christinaSalary;
        System.out.println("Кристина теперь получает " + christinaNewSalary + " рублей. Годовой доход вырос на " + christinaSalaryDiff + " рублей");
    }
}