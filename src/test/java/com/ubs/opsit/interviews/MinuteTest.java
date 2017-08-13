package com.ubs.opsit.interviews;


import org.junit.Ignore;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;


/**
 * Created by Avadhoot on 8/13/2017.
 */
public class MinuteTest {

    private Minute testee = null;

    @Test
    public void testWhenMinutesZero() {
        testee = new Minute(0);
        assertEquals("OOOOOOOOOOO", testee.representTopRow());
        assertEquals("OOOO", testee.representBottomRow());
    }

    @Test
    public void testWhenMinutesSeventeen() {
        testee = new Minute(17);
        assertEquals("YYROOOOOOOO", testee.representTopRow());
        assertEquals("YYOO", testee.representBottomRow());
    }

    @Test
    public void testWhenMinutesFiftyNine() {
        testee = new Minute(59);
        assertEquals("YYRYYRYYRYY", testee.representTopRow());
        assertEquals("YYYY", testee.representBottomRow());
    }


}
