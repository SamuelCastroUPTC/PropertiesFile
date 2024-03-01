package co.edu.uptc.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ManagerProperties {

    private String fileName=".\\configuration.properties";
    Properties properties= new Properties();

    public void setFileName(String name){
        this.fileName=name;
    }

    public void load() throws FileNotFoundException, IOException{
        properties.load(new FileInputStream(fileName));   
        
    }

    public String getValue(String key){
        if (properties.isEmpty()) {
            try {
                load();
            } catch (Exception e) {
                return null;
            }
        }
        return properties.getProperty(key);
    }

}
