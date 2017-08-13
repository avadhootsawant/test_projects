package com.ubs.opsit.interviews;

import org.junit.Test;
import static junit.framework.Assert.assertEquals;

/**
 * Created by Avadhoot on 8/13/2017.
 */
public class SecondsTest {

    private Second testee = null;

    @Test
    public void testWhenSecondsZero(){
        testee = new Second(0);
        assertEquals("Y",testee.representSecondsInBerlinFormat());
    }

    @Test
    public void testWhenSecondsFiftyNine(){
        testee = new Second(59);
        assertEquals("O",testee.representSecondsInBerlinFormat());
    }

    @Test
    public void testWhenSecondsFiftyEight(){
        testee = new Second(58);
        assertEquals("Y",testee.representSecondsInBerlinFormat());
    }


}
