package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double rsl = (a + b + c) / 2;
        double area = Math.sqrt(rsl * (rsl - a) * (rsl - b) * (rsl - c));
        return area;
    }

    public static void main(String[] args) {
        double rsl = area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);
    }
}
