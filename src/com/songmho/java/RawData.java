package com.songmho.java;

import java.math.*;

/**
 * Created by songm on 2016-12-16.
 */
public class RawData {
    int wholeCount, curCount;
    String content;
    double avgCurCount;
    static int wholeCountSum=0, wholeAvgHit=0, curCountSum=0, contentCount=0;


    public RawData(String content){
        this.content = content; 		// ī�װ���
        this.wholeCount = 1;			// ��ü ���� ī��Ʈ ��
        this.curCount = 1;				// ���� ���� ī��Ʈ
        this.avgCurCount = 1;			// ���� ��� ���� ī��Ʈ
        this.contentCount += contentCount; 	//ī�װ��� ī��Ʈ
    }

    public RawData(String content, int wholeCount, int curCount){
        this.content = content;			// ī�װ���
        this.wholeCount = wholeCount;	// ��ü ���� ī��Ʈ ��
        this.curCount = curCount;		// ���� ���� ī��Ʈ ��
        this.wholeCountSum += wholeCount;	// ��ü ī�װ� ī��Ʈ ���� ��
        this.curCountSum += curCount;		// ���� ī��Ʈ ��
    }
    
    // ���� �ش� ī�װ� ī��Ʈ
    public int getCurCount() {
        return curCount;
    }
    
    // ��ü ī��Ʈ
    public int getWholeCount() {
        return wholeCount;
    }

    // ī�װ���
    public String getContent() {
        return content;
    }

    // ���� ��ü ��
    public static int getCurCountSum() {
        return curCountSum;
    }
    
    // ��ü �ش� ī�װ� ī��Ʈ
    public static int getcontentCount() {
    	return contentCount;
    }

    // ��ü ī��Ʈ ��
    public static int getWholeCountSum() {
        return wholeCountSum;
    }

    // ���� ��Ʈ
    public void setContent(String content) {
        this.content = content;
    }

    // ���� ī�װ� ī��Ʈ set
    public void setCurCount(int curCount) {
        this.curCount = curCount;
    }
    
    // ��ü ī��Ʈ set
    public void setWholeCount(int wholeCount) {
        this.wholeCount = wholeCount;
    }

    // ��ü ī��Ʈ ��
    public void addWholeCount(){
        this.wholeCount++;
        this.wholeCountSum++;
    }
    
    // ���� ī��Ʈ ��
    public void addCurCount(){
        this.curCount++;
        this.wholeCountSum++;
    }
    
    public double getAvgCount() {
    	return this.avgCount;
    }
    
    // �Ϸ� �Ĵ� Ŭ�� / �Ϸ� �� Ŭ��
    public double AvgCurCount() {
    	return curCount / wholeCurCount;
    }
    
    
    public double AvgCount() {
    	return  contentCount / wholeCount;
    }
    
    public void AvgCountSum() {
    	this.AvgCount = this.AvgCount + AvgCount;
    }
    
    public double variance() {
    	return AvgCountSum / contentCount;
    }
    
    public double sigma() {
    	return Math.pow(variance(), 2);
    }
    
   
}
