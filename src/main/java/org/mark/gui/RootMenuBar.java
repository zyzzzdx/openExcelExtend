package org.mark.gui;

import javafx.application.Platform;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;

public class RootMenuBar {


    public static MenuBar createMenuBar(){

        Menu fileMenu = new Menu("文件");
        MenuItem exitMenuItem = new MenuItem("退出");


        exitMenuItem.setAccelerator(new KeyCodeCombination(KeyCode.W , KeyCombination.CONTROL_DOWN));
        exitMenuItem.setOnAction(e -> Platform.exit());


        fileMenu.getItems().addAll(exitMenuItem);


        Menu projectMenu = new Menu("项目");



        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().addAll(fileMenu,projectMenu);

        return menuBar;

    }

}
