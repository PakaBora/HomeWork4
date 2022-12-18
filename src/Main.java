public class Main {
    public static void main(String[] args) {
        ///задание1
        int variable1 = 5;
        byte variable2 = 2;
        short variable3 = -5;
        long variable4 = 700_500_600_750L;
        float variable5 = 2.15F;
        double variable6 = 2.151515;

        System.out.println("Значение переменной variable1  c  типом int равно " +  variable1);
        System.out.println("Значение переменной variable2  c  типом byte равно " +  variable2);
        System.out.println("Значение переменной variable3  c  типом short равно " +  variable3);
        System.out.println("Значение переменной variable4  c  типом long равно " +  variable4);
        System.out.println("Значение переменной variable5  c  типом float равно " +  variable5);
        System.out.println("Значение переменной variable6  c  типом double равно " +  variable6);

        ///задание2 27.12 ,  987 678 965 549 , 2,786 , false, 569 , -159 , 27897 , 67.
        float var1 = 27.12F;
        long var2 = 987_678_965_549L;
        double var3 = 2.786;
        boolean x = var1 < var3;
        int var4 = 569;
        short var5 = -159;
        int var6 = 27897;
        byte var7 = 67;


        //задание 3
        int LP = 23;
        int AC = 27;
        int EA = 30;
        int paper = 480;

        int paperForStudent = paper/(LP+AC+EA) ;

        System.out.println("На каждого ученика рассчитано " +paperForStudent + " листов бумаги");

        //Задание 4
        int bottle =16;
        int minutes =2;
        int bottleInMinute = bottle / minutes;

        int minutesInterval = 20;
        System.out.println("За " + minutesInterval+ " минут машина произвела бутылок "+bottleInMinute * minutesInterval+" штук");
        int minutesInDay = 24*60;
        System.out.println("За " + minutesInDay+ " минут машина произвела бутылок "+bottleInMinute * minutesInDay+" штук");
        int minutesInThreeDays = minutesInDay*3;
        System.out.println("За " + minutesInThreeDays+ " минут машина произвела бутылок "+bottleInMinute * minutesInThreeDays+" штук");
        int minutesInMonth = minutesInDay*30;
        System.out.println("За " + minutesInMonth+ " минут машина произвела бутылок "+bottleInMinute * minutesInMonth+" штук");


        // задание 5

        int totalPaint =120;
        int whitePaintInClass = 2;
        int brownPaintInClass = 4;

        int totalClassInSchool= totalPaint/(whitePaintInClass+brownPaintInClass);
        int totalWhitePaint= totalClassInSchool *  whitePaintInClass;
        int totalBrownPaint= totalClassInSchool* brownPaintInClass;

        System.out.println("В школе, где " + totalClassInSchool +" классов, нужно " + totalWhitePaint +" банок белой краски и " +totalBrownPaint+ " банок коричневой краски\"");

        // задание 6

        int weightBanana = 80; //грамм
        int weightMilk100= 105; //грамм
        int weightIceCream = 100; // грамм
        int weightEgg = 70; // грамм

        int totalWeightRecipe= weightBanana*4 + weightMilk100*2 + weightIceCream*2 + weightEgg*4;
        double totalWeightInKilo = (totalWeightRecipe * 0.001);
        System.out.println( "Вес рецепта составляет: "+ totalWeightInKilo + " кг");

        //задание 7
        int weightReduce = 7;
        int reduceInDay= 250;
        int reduceInDay2= 500;

        int totalDayToReduce1= (weightReduce*1000)/ reduceInDay;
        int totalDayToReduce2= (weightReduce*1000)/ reduceInDay2;

        System.out.println("Если спортсмен будет терять "+ reduceInDay+ "г. в день, то " +weightReduce+ " кг. он сбросит за "+totalDayToReduce1+" дней");
        System.out.println("А если спортсмен будет терять "+ reduceInDay2+ "г. в день, то " +weightReduce+ " кг. он сбросит за "+totalDayToReduce2+" дней");

        //задание 8
        //Маша получает 67 760 рублей в месяц
        //Денис получает 83 690 рублей в месяц
        //Кристина получает 76 230 рублей в месяц

        int marySalary= 67760;
        int denSalary = 83690;
        int krisSalary = 76230;

        int maryYearSalary= 67760 * 12;
        int denYearSalary = 83690 * 12;
        int krsYearSalary= 76230 * 12;

        float maryNewSalary= 67760 * 1.1F;
        float denNewSalary = 83690 * 1.1F;
        float krisNewSalary= 76230 * 1.1F;

        float maryNewYearSalary= maryNewSalary * 12;
        float denNewYearSalary= denNewSalary *12;
        float krisNewYearSalary= krisNewSalary * 12;

        float maryDifferenceSalary= maryNewYearSalary - maryYearSalary;
        float denDifferenceSalary = denNewYearSalary - denYearSalary;
        float krisDifferenceSalary= krisNewYearSalary - krsYearSalary;

        System.out.println("Маша теперь получает "+ maryNewSalary+ " рублей. Годовой доход вырос на " + maryDifferenceSalary + " рублей");
        System.out.println(" Денис теперь получает "+ denNewSalary+ " рублей. Годовой доход вырос на " + denDifferenceSalary + " рублей");
        System.out.println(" Кристина теперь получает "+ krisNewSalary+ " рублей. Годовой доход вырос на " + krisDifferenceSalary + " рублей");













    }
}