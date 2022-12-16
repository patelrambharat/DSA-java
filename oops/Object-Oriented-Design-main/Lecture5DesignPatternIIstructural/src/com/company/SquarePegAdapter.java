package com.company;

public class SquarePegAdapter extends RoundPeg {

    private SquarePeg squarePeg;

    public SquarePegAdapter() {
       super();
    }

    public SquarePegAdapter(SquarePeg s) {
        this.squarePeg = s;
    }

    public double getRadius() {
        return squarePeg.getWidth() * Math.sqrt(2) / 2;
    }

}
