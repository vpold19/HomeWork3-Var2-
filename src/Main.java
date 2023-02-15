
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
          byte a = 1;
          System.out.println("Значение переменной byte с типом a равно " + a);
          short b = 200;
          System.out.println("Значение переменной short с типом b равно " + b);
          int i = 3000;
          System.out.println("Значение переменной int с типом i равно " + i);
          long d = 5000000000L;
          System.out.println("Значение переменной long с типом d равно " + d);
          float e = 3f;
          System.out.println("Значение переменной float с e типом равно " + e);
          double g = 4d;
          System.out.println("Значение переменной double с g типом равно " + g);
     }

     public static void task2() {
          System.out.println("Задача 2");
          double a = 27.12d;
          System.out.println("double = " + a);
          long b= 987678965549L;
          System.out.println("long = " +b);
          double c=2.786d;
          System.out.println("double= " + c);
          short d= 569;
          System.out.println("short = " + d);
          short e=-159;
          System.out.println("short = " + e);
          int f=27897;
          System.out.println("int = " + f);
          byte g=67;
          System.out.println("byte = " + g);
     }

     public static void task3() {
          System.out.println("Задача 3");
          byte lp = 23;
          byte as = 27;
          byte ea = 30;
          short allPaper= 480;
          int allStudents= (lp+as+ea);
          int paperOneStudent= (allPaper/allStudents);
          System.out.println("На каждого ученика рассчитано "+ paperOneStudent + " листов бумаги");
     }

     public static void task4() {
          System.out.println("Задача 4");
          byte bottleOneMin=16/2;
          int bottleTwentyMin= bottleOneMin*20;
          System.out.println("За 20 мин машина произвела " + bottleTwentyMin + " штук бутылок");
          int bottleOneDay= bottleOneMin*1440;
          System.out.println("За один день машина произвела " + bottleOneDay + " штук бутылок");
          int bottleThreeDay= bottleOneMin*4320;
          System.out.println("За три дня машина произвела " + bottleThreeDay + " штук бутылок");
          int bottleOneMonth= bottleOneMin*43400;
          System.out.println("За один месяц машина произвела " + bottleOneMonth + " штук бутылок");
     }

     public static void task5() {
          System.out.println("Задача 5");
          int paintCans=120;
          byte whiteCansOneClass=2;
          byte brownCansOneClass=4;
          int cansOneClass= (whiteCansOneClass+brownCansOneClass);
          int classOfSchool=( paintCans/cansOneClass);
          int allWhiteCans=(classOfSchool*whiteCansOneClass);
          int allBrownCans=(classOfSchool*brownCansOneClass);
          System.out.println("В школе, где " + classOfSchool + " классов, нужно " + allWhiteCans + " банок белой краски и " + allBrownCans + " банок коричневой краски");
     }

     public static void task6() {
          System.out.println("Задача 6");
          int ban = 5 * 80;
          System.out.println(ban + " гр бананов");
          int milk = 105*2;
          System.out.println(milk + " гр молока");
          int iceCream = 100 *2;
          System.out.println(iceCream + " гр мороженного");
          int eggs=4*70;
          System.out.println(eggs + " гр яиц");
          int shakeGr=(ban + milk + iceCream + eggs );
          System.out.println(shakeGr + " гр коктейла");
          double shakeKg = shakeGr/1000;
          System.out.println(shakeKg + " кг в коктейле");
     }

     public static void task7() {
          System.out.println("Задача 7");
          int sevenKgInGr=7*1000;
          int lowWeight=sevenKgInGr/250;
          int highWeight=sevenKgInGr/500;
          System.out.println(lowWeight + "  дней уйдет на похудение, если спортсмен будет терять каждый день по 250 грамм");
          System.out.println(highWeight + " дней уйдет на похудение, если спортсмен будет терять каждый день по 500 грамм");
          int midWeight =( lowWeight + highWeight) /2;
          System.out.println(midWeight + " дней может потребоваться в среднем, чтобы добиться результата похудения");
     }

     public static void task8() {
          System.out.println("Задача 8");
          int mariaSalary=67760;
          double mariaBonus= mariaSalary*0.1;
          double mariaSalaryMonth = 67760 + mariaBonus;
          double mariaAnualSalaryBefore= 67760*12;
          double mariaAnualSalaryAfter= mariaSalaryMonth*12;
          double mariaSalaryDiff = mariaAnualSalaryAfter-mariaAnualSalaryBefore;
          System.out.println("Маша теперь получает " + mariaSalaryMonth + " рублей в месяц");
          System.out.println("Годовой доход Марии вырос на " + mariaSalaryDiff + " рублей");
          int kristinaSalary=76230;
          double kristinaBonus= kristinaSalary*0.1;
          double kristinaSalaryMonth = 76230 + kristinaBonus;
          double kristinaAnualSalaryBefore= 76230*12;
          double kristinaAnualSalaryAfter= kristinaSalaryMonth*12;
          double kristinaSalaryDiff = kristinaAnualSalaryAfter-kristinaAnualSalaryBefore;
          System.out.println("Кристина теперь получает " + kristinaSalaryMonth + " рублей в месяц");
          System.out.println("Годовой доход Марии вырос на " + kristinaSalaryDiff + " рублей");
          int denisSalary=83600;
          double denisBonus= denisSalary*0.1;
          double denisSalaryMonth = 83600 + denisBonus;
          double denisAnualSalaryBefore= 83600*12;
          double denisAnualSalaryAfter= denisSalaryMonth*12;
          double denisSalaryDiff = denisAnualSalaryAfter-denisAnualSalaryBefore;
          System.out.println("Денис теперь получает " + denisSalaryMonth + " рублей в месяц");
          System.out.println("Годовой доход Марии вырос на " + denisSalaryDiff + " рублей");
     }
}
