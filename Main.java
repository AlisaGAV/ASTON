    import java.util.Arrays;
public class Main {
    public static void main (String [] args) {
        taskOne();
        taskTwo();
        taskThree();
        taskFour();;
        System.out.println(taskFive(5,10));
        System.out.println(taskFive(15,10));
        taskSix();
        System.out.println(taskSeven(-2));
        System.out.println(taskSeven(0));
        System.out.println(taskSeven(5));
        taskEight("love",3);
        System.out.println(taskNine(2000));
        System.out.println(taskNine(1986));
        taskTen();
        taskEleven();
        taskTwelve();
        taskThirteen();
        printArrayInConsole(taskFourteen(9,7));
    }


// 1.Создайте метод,который при вызове должен отпечатать в столбец три слова: Orange, Banana, Apple.
    public static void taskOne() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

// 2.Создайте метод, в теле которого объявите две int переменные a и b, и инициализируйте их любыми значениями, 
// которыми захотите. Далее метод должен просуммировать эти переменные, и если их сумма 
// больше или равна 0, то вывести в консоль сообщение “Сумма положительная”, в противном случае - “Сумма отрицательная”;
    public static void taskTwo() {
        int a = 4;
        int b = 6;
        int c = a + b;
        if (c >= 0) {
            System.out.println("sum is positive");
        } else {
            System.out.println("sum is negative");
        }
    }

// 3.Создайте метод в теле которого задайте int переменную value и инициализируйте ее любым значением. Если value меньше 0 
// (0 включительно), то в консоль метод должен вывести сообщение “Красный”, если лежит в пределах от 0 (0 исключительно) 
// до 100 (100 включительно), то “Желтый”, если больше 100 (100 исключительно) - “Зеленый”
    public static void taskThree() {
        int value = 101;
        if (value <=0) {
            System.out.println("red");
        } if (value>0 && value<100) {
            System.out.println("yellow");
        } if (value>100) {
            System.out.println("green");
        }
    }

// 4. Создайте метод, в теле которого объявите две int переменные a и b, и инициализируйте их любыми значениями, 
// которыми захотите. Если a больше или равно b, то необходимо вывести в консоль сообщение “a >= b”, в противном случае “a < b”
    public static void taskFour() {
        int a = 40;
        int b = 40;
        if  (a>=b) {
            System.out.println("a>=b");
        } if (a<b) {
            System.out.println("a<b");
        }
    }

// 5. Напишите метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно),
//  если да – вернуть true, в противном случае – false.
    public static boolean taskFive(int a2, int b2) {
        int c2 = a2 + b2;
        boolean less = (c2 >= 10);
        boolean more = (c2 <= 20);
        if (less && more) {
            return true;
        } else {
            return false;
        }
    }

// 6. Напишите метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль, положительное ли 
// число передали или отрицательное. Замечание: ноль считаем положительным числом
    public static void taskSix() {
        int a3=7;
        if (a3 >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }

// 7. Напишите метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное, 
// и вернуть false если положительное.Замечание: ноль считаем положительным числом
    public static boolean taskSeven(int l) {
        if (l>=0) {
            return false;
        }
        return true;
    }

// 8. Напишите метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль указанную 
// строку,указанное количество раз
    public static void taskEight(String message, int b) {
        for (int k = 0; k < b; k++) {
            System.out.println(message);
        }
    }

// 9. Напишите метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true, 
// не високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    public static boolean taskNine(int year) {
        if ((year % 4 == 0) && ((year % 4 == 0) && (year % 100 > 0)) || ((year % 4 == 0) && (year%100==0) && (year % 400==0))) {
            return true;
        } else {
            return false;
        }
    }

// 10. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. 
// С помощью цикла и условия заменить 0 на 1, 1 на 0
    public static void taskTen() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (arr[i] == 1) ? 0 : 1;
            }
            System.out.println(Arrays.toString(arr));
        }

// 11. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 ... 100        
    public static void taskEleven() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }

// 12. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2
    public static void taskTwelve() {
        int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

// 13. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) 
// заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно). Определить элементы одной 
// из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], ..., [n][n]
    public static void taskThirteen() {
        int size = 5;
        int[][] arr = new int[size][size];
        for (int i = 0; i < size; i++)  {
            arr[i][i] = 1;
            arr[i][size - i - 1] = 1;
        }
        for (int i = 0; i < size; i++) {
            System.out.println(Arrays.toString(arr[i]));
            }
    }

// 14. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int
// длиной len, каждая ячейка которого равна initialValue.
    public static int[] taskFourteen(int len, int initialValue) {
        int arr[] = new int[len];
        for (int i = 0; i < arr.length; i++){
            arr[i] = initialValue;
        }
        return arr;
    }
    public static void printArrayInConsole(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + " ");
        }
        System.out.println();
    }
}
