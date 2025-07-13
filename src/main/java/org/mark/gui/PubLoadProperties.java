package org.mark.gui;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class PubLoadProperties {

    public static Properties loadProperties() {
        Properties props = new Properties();
        String configName = "config.properties";

        try(InputStream input = new FileInputStream(configName)) {
            props.load(input);
        }catch (Exception e){
        }
        return props;
    }


}
