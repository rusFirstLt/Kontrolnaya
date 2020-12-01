import java.util.Scanner;

public class Kontr {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 2 числа: \nВведите первое число: ");
        int a = sc.nextInt();
        System.out.println("Введите второе число: ");
        int b = sc.nextInt();
        System.out.println("Верно ли неравенство?\n" + check(a, b));

        //Задание 2
        System.out.println("\nЗадание 2");
        int[] arr1 = new int[8];
        for (int i = 1, j = 0; i < arr1.length; i++) {
            arr1[i] = j += 3;
            for (int x : arr1)
                System.out.println(x + " ");
        }

        //Задание 3
        System.out.println("\nЗадание 3");
        int[] arr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] < 6) {
                arr2[i] *= 2;
                System.out.println(arr2[i] + " ");
            }
        }
    }

    public static boolean check(int a, int b) {
        if ((a + b >= 10) && (a + b <= 20)) {
            return true;
        } else {
            return false;
        }
    }
}