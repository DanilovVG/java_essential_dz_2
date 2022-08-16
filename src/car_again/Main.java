package car_again;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Машинка");
        //задаем параметры

        System.out.println("Введите год машины:");
        int s1 = in.nextInt();
        System.out.println("Введите цвет машины:");
        String s2 = in.next();
        System.out.println("Введите скорость:");
        double s3 = in.nextDouble();
        System.out.println("Введите вес машины:");
        int s4 = in.nextInt();
        car cars4 = new car(s1, s3, s4, s2);
        car carstri = new car(s1, s3, s2);
        car carstwo = new car(s1, s2);
        car carsone = new car(s1);
        car cars = new car();
        System.out.println("Вывода конструктора:");
        System.out.println("Вывод данных по-умолчанию:");
        System.out.println("год машины: " + cars.getYear() + "; скорость машины: " + cars.getSpeed() + "; вес машины: " + cars.getWeight() + "; цвет машины: " + cars.getColor());
        System.out.println("Вывод данных передача с одним параметром(год передали):");
        System.out.println("год машины: " + carsone.getYear());
        System.out.println("Вывод данных передача 2х параметра(год и цвет передали):");
        System.out.println("год машины: " + carstwo.getYear() + "; цвет машины: " + carstwo.getColor());
        System.out.println("Вывод данных передача 3х параметров(год, цвет и скорость передали):");
        System.out.println("год машины: " + carstri.getYear() + "; скорость машины: " + carstri.getSpeed() + "; цвет машины: " + carstri.getColor());
        System.out.println("Вывод данных передача 4х параметров(все параметры):");
        System.out.println("год машины: " + cars4.getYear() + "; скорость машины: " + cars4.getSpeed() + "; вес машины: " + cars4.getWeight() + "; цвет машины1: " + cars4.getColor());


    }
}
