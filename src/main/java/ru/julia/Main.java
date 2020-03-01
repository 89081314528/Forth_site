package ru.julia;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        for (int i = 0; i < args.length ; i++) {
            System.out.println(args[i]);
        }
        System.out.println("Количество аргументов " + args.length);
//        int sum = 0;
        int [] a = new int [args.length/2 + 1];
        for (int i = 0; i < args.length; i++) {
            a[i] = Integer.parseInt(args[i]);
            System.out.println(a[i]);
//            sum = sum + a[i];
        }
//        }
//        System.out.println("Сумма аргументов " + sum);
//        for (int i = 0; i < a.length ; i++) {
//            System.out.println(a[i]);
//        }
//        int sumArgs = 0;
//        for (int i = 1; i < a.length; i = i + 2) {
//            if(args[i].equals("+")) {
//                sumArgs = sumArgs + a[i];
//            }
//            else {
//                sumArgs = sumArgs - a[i];
//            }
//        }
//        System.out.println("Сумма/разность аргументов " + sumArgs);
    }
}
