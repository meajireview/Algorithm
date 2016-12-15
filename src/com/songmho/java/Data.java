package com.songmho.java;

/**
 * Created by songm on 2016-12-16.
 */
public class Data {
    String content;
    double count;

    public Data(String content, double count){
        this.content = content;
        this.count = count;
    }

    public String getContent() {
        return content;
    }

    public double getCount() {
        return count;
    }
}
