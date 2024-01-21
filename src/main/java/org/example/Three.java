package org.example;

public class Three {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 9, 12, 15, 18, 21};

        System.out.println("Элементы массива, кратные 3:");
        for (int num : array) {
            if (num % 3 == 0) {
                System.out.println(num);
            }
        }
    }
}
