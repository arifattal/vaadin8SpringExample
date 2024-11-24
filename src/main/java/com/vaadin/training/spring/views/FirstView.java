package com.vaadin.training.spring.views;

import com.vaadin.navigator.View;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.training.spring.menu.Menu;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

@SpringView(name = "firstView")
public class FirstView extends HorizontalLayout implements View {
    public FirstView() {
        setSizeFull();
        Label label = new Label("first view");
        VerticalLayout mainWindow = new VerticalLayout(label);
//        Menu sideMenu = new Menu();
//        this.addComponents(sideMenu, mainWindow);
        this.addComponent(mainWindow);
    }
}
