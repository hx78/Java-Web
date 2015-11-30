package com.hx78.webapps;

import com.hx78.webapps.utils.Caculator;
import junit.framework.TestCase;

/**
 * Created by linming on 2015/8/21 0021.
 */
public class CaculatorTest extends TestCase{
    public void testAdd() {
        assertEquals(3, (new Caculator()).add(2,2));
    }
}
