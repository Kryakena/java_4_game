package ru.geekbrains.lesson_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("���� ������ ������� �����.");
        int range = 10;
        int number = (int) (Math.random() * range);
        while (true){
            System.out.println("�������� ����� �� 0 �� " + range);
            int input_number = scanner.nextInt();
            if (input_number == number){
                System.out.println("�� �������.");
                break;
            } else if (input_number > number) {
                System.out.println("���������� ����� ������");
            } else {
                System.out.println("���������� ����� ������");
            }
        }
        scanner.close();
    }
}