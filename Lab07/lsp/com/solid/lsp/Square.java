package com.solid.lsp;

public class Square extends AbstractGeometricObject {

    private int side;

    Square(int side) {
        this.setSide(side);
    }

    public void setSide(int side) {
        if (side <= 0) {
            this.side = 1;
            return;
        }
        this.side = side;
    }

    @Override
    public int getArea() {
        return side * side;
    }
}
