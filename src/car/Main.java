package car;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Машинка");
        //задаем параметры
/*      //вывод с выбором
        System.out.println("Выбор вывода конструктора:");
        System.out.println("ввести:(1) - один параметр \n (2) - 2 параметра \n (любоее число) - по-умолчанию");
        int s3 = in.nextInt();

        switch (s3) {
            case 2: {
                System.out.println("Введите год машины:");
                int s1 = in.nextInt();
                System.out.println("Введите цвет машины:");
                String s2 = in.next();
                Car carstwo = new Car(s1, s2);
                // выводим
                System.out.println("Вывод данных передача 2х параметрами:");
                System.out.println("год машины: " + carstwo.getYear());
                System.out.println("цвет машины: " + carstwo.getColor());
                break;
            }
            case 1: {
                System.out.println("Введите год машины:");
                int s1 = in.nextInt();
                Car carsone = new Car(s1);
                // выводим
                System.out.println("Вывод данных передача с одним параметром:");
                System.out.println("год машины: " + carsone.getYear());
                System.out.println("цвет машины: " + carsone.getColor());
                break;
            }
            default: {
                Car cars = new Car();
                // выводим
                System.out.println("Вывод данных по-умолчанию:");
                System.out.println("год машины: " + cars.getYear());
                System.out.println("цвет машины: " + cars.getColor());
                break;
            }
        }*/

//вывод по очереди
        System.out.println("Введите год машины:");
        int s1 = in.nextInt();
        System.out.println("Введите цвет машины:");
        String s2 = in.next();
        Car carstwo = new Car(s1, s2);
        Car carsone = new Car(s1);
        Car cars = new Car();
        System.out.println("Вывода конструктора:");
        System.out.println("Вывод данных по-умолчанию:");
        System.out.println("год машины: " + cars.getYear()+" цвет машины: " + cars.getColor());
        System.out.println("Вывод данных передача с одним параметром:");
        System.out.println("год машины: " + carsone.getYear()+" цвет машины: " + carsone.getColor());
        System.out.println("Вывод данных передача 2х параметрами:");
        System.out.println("год машины: " + carstwo.getYear()+" цвет машины: " + carstwo.getColor());



    }
}
