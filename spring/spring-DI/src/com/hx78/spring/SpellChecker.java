package com.hx78.spring;

import org.springframework.stereotype.Service;

/**
 * Created by linming on 2015/8/31 0031.
 */
//@Service("spellChecker")
public class SpellChecker {
    public SpellChecker() {
        System.out.println("Inside SpellChecker constructor." );
    }

    public void checkSpelling() {
        System.out.println("Inside checkSpelling." );
    }
}
