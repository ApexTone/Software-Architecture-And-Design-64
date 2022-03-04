package com.solid.lsp;

public class Main {

    private static final int width = 4;
    private static final int height = 5;

    public static void main(String[] args) {
        AbstractGeometricObject reg1 = new Rectangle(width, height);
        System.out.println("==== Rectangle ====");
        System.out.println("Width = " + width);
        System.out.println("Height = " + height);
        System.out.println("Area = " + reg1.getArea());

        AbstractGeometricObject reg2 = new Square(5);
        // The next 2 lines have no use since Square don't extend Rectangle anymore.
        // reg2.setWidth(width);
        // reg2.setHeight(height);
        System.out.println("====   Square  ====");
        // The next 2 lines are incoherent to the square's dimension since it read data from static fields declared above.
        // System.out.println("Width = " + width);
        // System.out.println("Height = " + height);
        System.out.println("Area = " + reg2.getArea());
    }
}
