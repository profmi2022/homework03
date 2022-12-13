import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задачи 1 и 2");

        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        for (int index = 0; index < arr.length; index++) {
            if (index == arr.length - 1) {
                System.out.println(arr[index]);
                break;
            }
            System.out.print(arr[index] + " ,");
        }

        double[] arr2 = {1.57, 7.654, 9.986};

        for (int index = 0; index < arr2.length; index++) {
            if (index == arr2.length - 1) {
                System.out.println(arr2[index]);
                break;
            }
            System.out.print(arr2[index] + " ,");
        }
        char[] arr3 = {64, 73, 35, 68};

        for (int index = 0; index < arr3.length; index++) {
            if (index == arr3.length - 1) {
                System.out.println(arr3[index]);
                break;
            }
            System.out.print(arr3[index] + " ,");
        }
    }

    public static void task2() {
        System.out.println("Задача 3");

        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        for (int index = arr.length - 1; index >= 0; index--) {
            if (index == 0) {
                System.out.println(arr[index]);
                break;
            }
            System.out.print(arr[index] + " ,");
        }

        double[] arr2 = {1.57, 7.654, 9.986};

        for (int index = arr2.length - 1; index >= 0; index--) {
            if (index == 0) {
                System.out.println(arr2[index]);
                break;
            }
            System.out.print(arr2[index] + " ,");
        }

        char[] arr3 = {64, 73, 35, 68};

        for (int index = arr3.length - 1; index >= 0; index--) {
            if (index == 0) {
                System.out.println(arr3[index]);
                break;
            }
            System.out.print(arr3[index] + " ,");
        }
    }

    public static void task3() {
        System.out.println("Задача 4");

        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] % 2 != 0) {
                arr[index] = arr[index] + 1;
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
