package com.songmho.java;

/**
 * Created by songm on 2016-12-16.
 */
public class RawData {
    int wholeCount, curCount;
    String content;

    static int wholeCountSum=0, curCountSum=0;


    public RawData(String content){
        this.content = content;
        this.wholeCount = 1;
        this.curCount = 1;
    }

    public int getCurCount() {
        return curCount;
    }

    public int getWholeCount() {
        return wholeCount;
    }

    public String getContent() {
        return content;
    }


    public static int getCurCountSum() {
        return curCountSum;
    }

    public static int getWholeCountSum() {
        return wholeCountSum;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setCurCount(int curCount) {
        this.curCount = curCount;
    }

    public void setWholeCount(int wholeCount) {
        this.wholeCount = wholeCount;
    }

    public void addWholeCount(){
        this.wholeCount++;
        this.wholeCountSum++;
    }
    public void addCurCount(){
        this.curCount++;
        this.wholeCountSum++;
    }

}
