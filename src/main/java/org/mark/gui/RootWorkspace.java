package org.mark.gui;

import javafx.scene.layout.VBox;

import java.util.Properties;

public class RootWorkspace {

    public VBox workspace;

    public RootWorkspace(Properties properties) {
        this.workspace = this.createWorkspace(properties);

    }

    public  VBox createWorkspace(Properties properties) {
        VBox container = new VBox();

        return container;
    }
}
