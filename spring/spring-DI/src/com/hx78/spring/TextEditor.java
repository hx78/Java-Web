package com.hx78.spring;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by linming on 2015/8/31 0031.
 */
public class TextEditor {
    //@Autowired
    private SpellChecker spellChecker;

    //@Autowired
    private String name;

    public TextEditor() {
    }

    @Autowired
    public TextEditor( SpellChecker spellChecker, String name ) {
        this.spellChecker = spellChecker;
        this.name = name;
    }

    //@Autowired
    public void setSpellChecker(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void spellCheck() {
        spellChecker.checkSpelling();
    }

}
