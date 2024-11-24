package com.vaadin.training.spring.menu;

import com.vaadin.spring.navigator.SpringNavigator;
import com.vaadin.ui.Button;
import com.vaadin.ui.VerticalLayout;
import org.springframework.beans.factory.annotation.Autowired;

public class Menu extends VerticalLayout {

    public Menu(){
        Button firstViewBtn = new Button("first view");
        Button secondViewBtn = new Button("second view");
        firstViewBtn.addClickListener(event -> getUI().getNavigator().navigateTo("firstView"));
        secondViewBtn.addClickListener(event -> getUI().getNavigator().navigateTo("secondView"));
        this.addComponents(firstViewBtn,secondViewBtn);
    }
}
