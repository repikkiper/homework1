public class homework2 {
    private static void CheckSum (int a, int b) {
        int c, SumUIMax, SumUIMin ;
        c=a+b;
        SumUIMax = 20;
        SumUIMin = 10;
        boolean sum = c<=SumUIMax;
        if (sum && c>=SumUIMin) {
            System.out.println("CheckSumm = " + c + " is Good!");
        } else {
            System.out.println("СheckSumm = " + c + " is bad");
        }
    }
    public static void main (String[] args) {
        int z = 10;
        int x = 9;
        CheckSum(z, x);
        z = 6;
        x = 3;
        CheckSum(z, x);

    }
}

// * Задание 2
// Написать метод, принимающий на вход два целых числа,
// и проверяющий что их сумма лежит в пределах от 10 до 20(включительно),
// если да – вернуть true, в противном случае – false;

// Мать моя женщина, кто же придумал этот git...