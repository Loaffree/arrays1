package com.company;

public class Main {

    public static void main(String[] args) {
        task1();
        System.out.println("\n" + " 2 задача:");
        task2();
        System.out.println("\n" + " 3 задача:");
        task3();
        System.out.println("\n" + " 4 задача:");
        task4();
    }

    public static void task1() {
        int[] array = new int[]{1, 2, 3};
        double[] arrayDouble = new double[]{1.57, 7.654, 9.986};
        int[] random = {5, 6, 4, 7};
    }

    public static void task2() {
        int[] array = new int[]{1, 2, 3};
        double[] arrayDouble = new double[]{1.57, 7.654, 9.986};
        int[] random = {5, 6, 4, 7};

        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[array.length - 1]);

        for (int i = 0; i < arrayDouble.length - 1; i++) {
            System.out.print(arrayDouble[i] + ", ");
        }
        System.out.println(arrayDouble[arrayDouble.length - 1]);

        for (int i = 0; i < random.length - 1; i++) {
            System.out.print(random[i] + ", ");
        }
        System.out.println(random[random.length - 1]);
    }

    public static void task3() {
        int[] array = new int[]{1, 2, 3};
        double[] arrayDouble = new double[]{1.57, 7.654, 9.986};
        int[] random = {5, 6, 4, 7};

        for (int i = array.length - 1; i > 0; i--) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[0]);

        for (int i = arrayDouble.length - 1; i > 0; i--) {
            System.out.print(arrayDouble[i] + ", ");
        }
        System.out.println(arrayDouble[0]);

        for (int i = random.length - 1; i > 0; i--) {
            System.out.print(random[i] + ", ");
        }
        System.out.println(random[0]);
    }

    public static void task4() {
        int[] array = new int[]{1, 2, 3};
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] = array[i] + 1;
            }
            System.out.print(array[i] + " ");
        }
    }
}

