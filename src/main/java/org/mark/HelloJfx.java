package org.mark;

import javafx.application.Application;

import javafx.scene.Scene;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


import org.mark.gui.PubLoadProperties;
import org.mark.gui.RootMenuBar;
import org.mark.gui.RootStatusBar;
import org.mark.gui.RootWorkspace;

import java.util.Properties;



public class HelloJfx extends Application {

    @Override
    public void start(Stage stage) {

        // 配置文件
        Properties properties = PubLoadProperties.loadProperties();


        // 1. 创建菜单栏
        MenuBar menuBar = RootMenuBar.createMenuBar();
        // 2. 创建工作区
        RootWorkspace rootWorkspace = new RootWorkspace(properties);
        VBox workspace = rootWorkspace.workspace;

        // 3. 创建状态栏
        HBox statusBar = RootStatusBar.createStatusBar();

        BorderPane root = new BorderPane();
        root.setTop(menuBar);
        root.setCenter(workspace);
        root.setBottom(statusBar);


        Scene scene = new Scene(root, 800, 600);

        stage.setTitle("Excel工具");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args); // 启动应用
    }

}
