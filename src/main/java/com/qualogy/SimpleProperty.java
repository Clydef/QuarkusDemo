package com.qualogy;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class SimpleProperty {
    public SimpleProperty() {}
 
    private String key;
    private String value;

    public SimpleProperty(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "SimpleProperty{" +
                "key='" + key + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}