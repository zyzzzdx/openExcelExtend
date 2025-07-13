package org.mark.gui;

import javafx.application.Platform;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.geometry.Insets;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Timer;
import java.util.TimerTask;


public class RootStatusBar {

    public static HBox createStatusBar() {
        HBox statusBar = new HBox();
        statusBar.setPadding(new Insets(10));
        statusBar.setStyle("-fx-background-color: #eee;");

        Label statusLabel = new Label();
        statusLabel.setText("就绪");

        Label timeLabel = new Label();
//        timeLabel.setStyle("-fx-font-weight: bold;");

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                Platform.runLater( ()-> {
                    String time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

                timeLabel.setText(time);
                });

            }
        }, 0, 1000);

        Region spacer = new Region();
        HBox.setHgrow(spacer, Priority.ALWAYS);

        statusBar.getChildren().addAll(statusLabel,spacer,timeLabel);
        return statusBar;


    }
}
