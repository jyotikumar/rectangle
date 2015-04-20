package com.company;

public class Rectangle {

    private double length;
    private double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public static void main(String[] args) {
	Rectangle rectangle = new Rectangle(10, 20);
        rectangle.displayArea();
    }

    private void displayArea() {
        System.out.println("Area of given rectangle is" + length*width);
    }
}
