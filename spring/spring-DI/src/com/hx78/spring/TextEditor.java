package com.hx78.spring;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

/**
 * Created by linming on 2015/8/31 0031.
 */
public class TextEditor {
    //@Autowired
    //@Resource
    private SpellChecker spellChecker;

    @Autowired
    public TextEditor( SpellChecker spellChecker ) {
        this.spellChecker = spellChecker;
    }

    public TextEditor() {
    }

    @PostConstruct
    public void init(){
        System.out.println("Bean is going through init.");
    }

    //@Autowired
    public void setSpellChecker(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Bean will destroy now.");
    }
}
