package com.ubs.opsit.interviews;

/**
 * Created by Avadhoot on 8/13/2017.
 */
public class Second {

    private Integer seconds;

    public Second(int seconds) {
        this.seconds = seconds;
    }

    public String representSecondsInBerlinFormat(){

        return (this.seconds % 2 == 0) ? "Y" :"O";
    }
}
