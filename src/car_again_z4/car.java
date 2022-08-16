package car_again_z4;

public class car {
    private int year, weight;
    private double speed;
    private String color;

    public car() {
        this.year = 2022;
        this.speed = 120;
        this.weight = 3000;
        this.color = "white";
    }

    public car(int year) {
        this.year = year;

    }

    public car(int year, String color) {
        this.year = year;
        this.color = color;
    }

    //вызов конструктора в конструкторе
    public car(int year, double speed, String color) {
        this(year, color);
        this.speed = speed;
    }

    //вызов конструктора в конструкторе
    public car(int year, double speed, int weight, String color) {
        this(year, speed, color);
        this.weight = weight;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

}
