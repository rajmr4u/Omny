package com.rajesh.omny.demo;

public class DataObject {
    public DataObject(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    String key;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    String value;
 public String toString(){
     return "Key  : " + key + "    Value :" +value;
 }

}
