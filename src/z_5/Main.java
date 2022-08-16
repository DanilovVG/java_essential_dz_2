package z_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Расчитываем площадь круга");
        //задаем параметры

        System.out.println("Введите радиус круга:");
        double r = in.nextDouble();
        MyArea.areaOfCircle(r);

    }

}

