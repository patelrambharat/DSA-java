package com.company;

public class Main {

    public static void main(String[] args) {
	    //first
        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);
        System.out.println("Answer is " + hole.fits(rpeg));

        SquarePeg small_sqpeg = new SquarePeg(5);
        SquarePeg large_sqpeg = new SquarePeg(10);
        //hole.fits(small_sqpeg);

        RoundPeg small_sqpeg_adapter = new SquarePegAdapter(small_sqpeg);
        RoundPeg large_sqpeg_adapter = new SquarePegAdapter(large_sqpeg);
        System.out.println("Second Answer is " + hole.fits(small_sqpeg_adapter));
        System.out.println("Third Answer is " + hole.fits(large_sqpeg_adapter));


    }
}
