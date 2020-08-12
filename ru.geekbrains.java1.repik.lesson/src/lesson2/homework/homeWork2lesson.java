package lesson2.homework;
import java.util.Arrays;

public class homeWork2lesson {


public static void main (String [] args) {

    /* 1 Задать целочисленный массив, состоящий из элементов 0 и 1.
    Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    Написать метод, заменяющий в принятом массиве 0 на 1, 1 на 0; */

    int[] ar1 = {1, 0, 1, 1, 0, 1, 0, 0, 1, 0}; // Здесь мы создали массив ar1 для задания 1

    newMassiveZeroOne(ar1); // Здесь мы обратились к методу, который проверяет значения в массиве, и если находит 1, присваевает 0 и наоборот
    printMassive(ar1); // Здесь на костылях вывод на экран, без импорта библиотеки, т.к. почему-то Unused

    int[] ar2 = new int[8]; // создали пустой целочисленный массив для задачи 2
    touchMassive(ar2);   // обратились к методу для заполнения массива, задача 2
    printMassive(ar2);   // вывели на экран массив из задачи 2

    int[] ar3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 }; // Создали массив для задания 3
    changeAndX2(ar3);
    printMassive(ar3);

    int[] ar4 =  new int[4]; //{1, 7, 8, 9}; // Создали массив для задания 4
    ar4[0] = 1;
    ar4[1] = 7;
    ar4[2] = 8;
    ar4[3] = 9;

    massiveVerification(ar4);


}
    private static void newMassiveZeroOne (int [] ar1) //приватный метод для проверки и заполнения массива ar1 задания 1
    {

        // int [] ar1 = new int[10], запишем сразу, что попросили;

        for (int i = 0; i < ar1.length; i++)
            if (ar1[i] == 1) {
                ar1[i] = 0;
            } else ar1[i] = 1;
    }
    private static void printMassive (int [] ar1) // приватный метод для распечаки массива из 1 и 2 задачи (может и дрругих)
    {
         for (int i=0; i < ar1.length; i++) {
             System.out.print(ar1[i] + " ");
         }
         System.out.println();
    }

    /* Задать пустой целочисленный массив размером 8.
    Написать метод, который помощью цикла заполнит его значениями 1 4 7 10 13 16 19 22; */

    private static void touchMassive (int [] ary) //приватный метод для заполнения массива ar2
    {
        // ary[0] = 1
        for (int i = 0; i < ary.length; i++)
            if (ary[i] == ary[0]) {
                ary[0] = 1;   // или можно перед for внести в ary[0] = 1 и цикл начать с i = 1
            }
            else ary[i]=ary[i-1]+3;  // эта формула была подобрана методом научного тыка, я и нет думал, что можно обратиться к ячейке памяти таким образом
    }

    /* 3 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ], написать метод, принимающий на вход массив и умножающий числа меньше 6 на 2; */

    private static void changeAndX2 (int [] arz) // Приватный метод для проверки и заполнения массива ar3 задания 3
    {
        for (int i = 0; i < arz.length; i++)
            if (arz[i] < 6)   //если значение в массиве меньше 6, то значение в массиве умножаем на 2
            {
                arz[i] = arz[i]*2;
            } else arz[i] = arz[i];  // если значение в массиве >= 6 то тогда значению в массиве присваиваем текущее значение в массиве :)
    }

    /* ЗАДАНИЕ 4
    Задать одномерный массив. Написать методы поиска в нём минимального и максимального элемента */


   private static void massiveVerification (int [] arx) {
       int max = arx[0];   // будем считать что в 0 ячейке изначально значение max и min - это здесь все так красиво получилось, а потратил я на это 4 часа
       int min = arx[0];
       for (int i = 0; i < arx.length; i++) {
           if (arx[i] > max) max = arx[i];
           if (arx[i] < min) min = arx[i];
       }
       System.out.println("Наибольшее число в массиве " + max);
       System.out.println("Наименьшее число в массиве " + min);
       };

   }


