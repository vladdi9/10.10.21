package org.itstep;

public class Paradigme {

    public static void main(String[] args) {
	//Отсуствие парадигмы
       /* double r1 = 1;
        double s1 = Math.PI*r1*r1;
        double p1 = 2*Math.PI*r1;
        System.out.printf("Radius: %f, Area: %f, Perimeter: %f%n", r1, s1, p1);
        double r2 = 2;
        double s2 = Math.PI*r2*r2;
        double p2 = 2*Math.PI*r2;
        System.out.printf("Radius: %f, Area: %f, Perimeter: %f%n", r2, calcArea(r2), calcPerim(r2));


        //ООП
        Circle circle1 = new Circle();
        circle1.setRadius(1);
        System.out.println(circle1.toString());
        System.out.println(circle1.calcArea());
        System.out.println(circle1.calcPerim());


        Circle circle2 = new Circle(2);
        System.out.println(circle2.toString());

        System.out.println(new Circle(3).toString()); */

        System.out.println(new CircleMod(3).toString());
    }





    static double calcArea(double r){
        return Math.PI*r*r;
    }

    static double calcPerim(double r){
        return 2*Math.PI*r;
    }
}

class CircleMod extends Circle{
    private double diam = 0;

    CircleMod(double radius){
        super(radius);
        diam = 2*radius;
    }

    public double calcArea(){
        return Math.PI*diam*diam/4;
    }
    public double calcPerim() {
        return 2 * Math.PI * diam;
    }

    public double getDiam() {
        return diam;
    }

    public void setDiam(double diam) {
        this.diam = diam;
    }
}
