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
        this.content = content; 		// 카테고리명
        this.wholeCount = 1;			// 전체 누적 카운트 수
        this.curCount = 1;				// 오늘 누적 카운트
        this.avgCurCount = 1;			// 오늘 평균 누적 카운트
        this.contentCount += contentCount; 	//카테고리명 카운트
    }

    public RawData(String content, int wholeCount, int curCount){
        this.content = content;			// 카테고리명
        this.wholeCount = wholeCount;	// 전체 누적 카운트 수
        this.curCount = curCount;		// 오늘 누적 카운트 수
        this.wholeCountSum += wholeCount;	// 전체 카테고리 카운트 누적 합
        this.curCountSum += curCount;		// 오늘 카운트 합
    }
    
    // 오늘 해당 카테고리 카운트
    public int getCurCount() {
        return curCount;
    }
    
    // 전체 카운트
    public int getWholeCount() {
        return wholeCount;
    }

    // 카테고리명
    public String getContent() {
        return content;
    }

    // 오늘 전체 합
    public static int getCurCountSum() {
        return curCountSum;
    }
    
    // 전체 해당 카테고리 카운트
    public static int getcontentCount() {
    	return contentCount;
    }

    // 전체 카운트 합
    public static int getWholeCountSum() {
        return wholeCountSum;
    }

    // 내용 세트
    public void setContent(String content) {
        this.content = content;
    }

    // 현재 카테고리 카운트 set
    public void setCurCount(int curCount) {
        this.curCount = curCount;
    }
    
    // 전체 카운트 set
    public void setWholeCount(int wholeCount) {
        this.wholeCount = wholeCount;
    }

    // 전체 카운트 합
    public void addWholeCount(){
        this.wholeCount++;
        this.wholeCountSum++;
    }
    
    // 오늘 카운트 합
    public void addCurCount(){
        this.curCount++;
        this.wholeCountSum++;
    }
    
    public double getAvgCount() {
    	return this.avgCount;
    }
    
    // 하루 식당 클릭 / 하루 총 클릭
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
