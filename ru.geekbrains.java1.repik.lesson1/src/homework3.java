public class homework3 {
    private static void plusMinus (int a)
    { if (a >= 0) {System.out.println("Число положительное, оно равно " + a);}
    else {System.out.println("Число отрицательное, оно равно " + a);}
    }
    public static void main (String[] args)
    { int a = 7;
        plusMinus(a);
        a = -3;
        plusMinus(a);
    }
}

// * Задание 3
// Написать метод, которому в качестве параметра передается целое число,
// метод должен проверить положительное ли число передали, или отрицательное.
// Замечание: ноль считаем положительным числом. Результат работы метода вывести в консоль