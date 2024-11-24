package com.vaadin.training.spring;

import com.vaadin.navigator.View;
import com.vaadin.spring.annotation.SpringViewDisplay;
import com.vaadin.ui.Component;
import com.vaadin.ui.Panel;

@SpringViewDisplay
public class AppViewDisplay extends Panel {

    public void showView(View view){
        setContent((Component) view);
    }
}
