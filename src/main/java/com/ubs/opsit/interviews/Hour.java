package com.ubs.opsit.interviews;

import java.util.stream.IntStream;

/**
 * Created by Avadhoot on 8/13/2017.
 */
public class Hour {

    private Integer hour;

    public Hour(int hours) {
        this.hour = hours;
    }

    public String representTopRow() {
        StringBuilder output = new StringBuilder();
        int topLampsInRed = (hour - (hour % 5))/5;
        IntStream.range(0, topLampsInRed).forEach(i -> output.append("R"));
        IntStream.range(topLampsInRed, 4).forEach(i -> output.append("O"));
        return output.toString();
    }

    public String representBottomRow() {
        StringBuilder output = new StringBuilder();
        int bottomLampsInRed= hour % 5;
        IntStream.range(0, bottomLampsInRed).forEach(i -> output.append("R"));
        IntStream.range(bottomLampsInRed, 4).forEach(i -> output.append("O"));
        return output.toString();
    }
}
