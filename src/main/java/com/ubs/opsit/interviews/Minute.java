package com.ubs.opsit.interviews;

import java.util.stream.IntStream;

/**
 * Created by Avadhoot on 8/13/2017.
 */
public class Minute {

    private Integer minute;

    public Minute(int minutes) {
        this.minute = minutes;


    }

    public String representTopRow() {
        StringBuilder output = new StringBuilder();
        int topLampsInRed = (minute - (minute % 5))/5;
        boolean bottomLampsInRedExists= minute % 5 >0;

        IntStream.range(0, topLampsInRed).forEach(i -> {
            if (bottomLampsInRedExists && (i ==2 || i ==5 ||i==8)){
                output.append("R");
            }else {
                output.append("Y");
            }

        });
        IntStream.range(topLampsInRed, 11).forEach(i -> output.append("O"));
        return output.toString();
    }

    public String representBottomRow() {
        StringBuilder output = new StringBuilder();
        int bottomLampsInRed= minute % 5;
        IntStream.range(0, bottomLampsInRed).forEach(i -> output.append("Y"));
        IntStream.range(bottomLampsInRed, 4).forEach(i -> output.append("O"));
        return output.toString();
    }
}
