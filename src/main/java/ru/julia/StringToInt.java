package ru.julia;

public class StringToInt {
    public static void main(String[] args) {
        String string = new String("123");
        String str = new String("7879");
        int a = Integer.parseInt(string);
        int f = Integer.parseInt(str);
        System.out.println(a + f);
        String[] numbers = {"1", "+", "3", "*", "7"};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
//        1 вариант
//        int sum = Integer.parseInt(numbers[0]);
//        for (int i = 0; i < 5; i++) {
//            if (numbers[i].equals("+")) {
//                sum = sum + Integer.parseInt(numbers[i + 1]);
//            }
//            if (numbers[i].equals("-")) {
//                sum = sum - Integer.parseInt(numbers[i + 1]);
//            }
//        }
//        System.out.println(sum);
//        2 Вариант
        int sum = 0;
        String operation = "+";
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i].equals("+")) {
                operation = "+";
            } else if (numbers[i].equals("-")) {
                operation = "-";
            } else if (numbers[i].equals("*")) {
                operation = "*";
            } else if (numbers[i].equals("/")) {
                operation = "/";
            } else if (operation.equals("+")) {
                sum = sum + Integer.parseInt(numbers[i]);
            } else if (operation.equals("-")) {
                sum = sum - Integer.parseInt(numbers[i]);
            } else if (operation.equals("*")) {
                sum = sum * Integer.parseInt(numbers[i]);
            } else if (operation.equals("/")) {
                sum = sum / Integer.parseInt(numbers[i]);
            }
        }
        System.out.println(sum);
    }
}

