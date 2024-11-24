package com.vaadin.training.spring;

import com.vaadin.navigator.Navigator;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.spring.navigator.SpringNavigator;
import com.vaadin.training.spring.menu.Menu;
import com.vaadin.training.spring.views.FirstView;
import com.vaadin.training.spring.views.SecondView;
import com.vaadin.training.spring.views.StartView;
import com.vaadin.training.spring.views.myNavigator;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.UI;
import org.springframework.beans.factory.annotation.Autowired;

@SpringUI
public class VaadinUI extends UI {

//    @Autowired
//    private myNavigator myNav;

    @Autowired
    private AppViewDisplay viewDisplay;

//    @Autowired
//    private SpringNavigator navigator;

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        HorizontalLayout layout = new HorizontalLayout();
        layout.addComponent(new Menu());
        layout.addComponent(viewDisplay);
        setContent(layout);
        //navigator.init(this, this);
        //navigator.navigateTo("");
    }
}
