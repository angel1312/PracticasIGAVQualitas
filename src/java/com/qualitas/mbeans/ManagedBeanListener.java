package com.qualitas.mbeans;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class ManagedBeanListener {
    
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    public void handleKeyEvent() {
        text = text.toUpperCase();
    }
    
}
