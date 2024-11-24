package com.vaadin.training.spring.views;

import com.vaadin.navigator.View;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.training.spring.menu.Menu;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

@SpringView(name = "")
public class StartView extends HorizontalLayout implements View {
    public StartView() {
        setSizeFull();
        Label label = new Label("start view");
        VerticalLayout mainWindow = new VerticalLayout(label);
//        Menu sideMenu = new Menu();
//        this.addComponents(sideMenu, mainWindow);
        this.addComponent(mainWindow);
    }
}
