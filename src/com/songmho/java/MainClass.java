package com.songmho.java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by songm on 2016-12-16.
 */
public class MainClass {

    public static void main(String[] args) {
        List<String> dummy = new ArrayList<>();
        List<RawData> rawDatas = new ArrayList<>();
        List<Data> datas = new ArrayList<>();
        List<Data> resultDatas =new ArrayList<>();
        double differRate;

        //데이터 입력
        try {
            ////////////////////////////////////////////////////////////////
            BufferedReader in = new BufferedReader(new FileReader("F:\\Projects\\Java\\ItProjAlgorithm\\src\\com\\songmho\\java\\sample.txt"));
            String s;

            while ((s = in.readLine()) != null) {
                String a[] = s.split(" ");
                for(String str : a){
                    dummy.add(str);
                }

            }
            in.close();
            ////////////////////////////////////////////////////////////////
        } catch (IOException e) {
            System.err.println(e); // 에러가 있다면 메시지 출력
            System.exit(1);
        }

        for(String s : dummy){
            if(!rawDatas.isEmpty())
                for(int i = 0;i<rawDatas.size();i++){
                    if(rawDatas.get(i).getContent().equals(s)){
                        System.out.println(i+" : "+rawDatas.get(i).getContent());
                        rawDatas.get(i).addWholeCount();
                        break;
                    }
                    else {
                        rawDatas.add(new RawData(s));
                        break;
                    }
                }
            else
                rawDatas.add(new RawData(s));
        }


        //데이터 입력
        try {
            ////////////////////////////////////////////////////////////////
            BufferedReader in = new BufferedReader(new FileReader("F:\\Projects\\Java\\ItProjAlgorithm\\src\\com\\songmho\\java\\sample2.txt"));
            String s;

            while ((s = in.readLine()) != null) {
                String a[] = s.split(" ");
                for(String str : a){
                    dummy.add(str);
                }

            }
            in.close();
            ////////////////////////////////////////////////////////////////
        } catch (IOException e) {
            System.err.println(e); // 에러가 있다면 메시지 출력
            System.exit(1);
        }

        for(String s : dummy){
                for(int i = 0;i<rawDatas.size();i++){
                    if(rawDatas.get(i).getContent().equals(s)){
                        System.out.println(i+" : "+rawDatas.get(i).getContent());
                        rawDatas.get(i).addCurCount();
                        break;
                    }
                }
        }

        for(int i=0; i<rawDatas.size(); i++){
            System.out.println("data["+rawDatas.get(i).getContent()+"] : "+rawDatas.get(i).getCurCount()+", "+rawDatas.get(i).getWholeCount());
        }

        System.out.println();
        System.out.println("-------------------------------");
        System.out.println();

        //비율 설정
        differRate = RawData.getCurCountSum() / RawData.getWholeCountSum();

        for(RawData d : rawDatas) {
            double a = d.getWholeCount()*differRate;
            datas.add(new Data(d.getContent(),a));
        }

        for(int i = 0; i<rawDatas.size();i++) {
            double a = (0.7*rawDatas.get(i).getCurCount())+(0.3*datas.get(i).getCount());

            resultDatas.add(new Data(rawDatas.get(i).getContent(),a));
        }

        QuickSort quickSort = new QuickSort();
        quickSort.sort(resultDatas,0,resultDatas.size()-1);
        for(int i=0; i<resultDatas.size(); i++){
            System.out.println("data["+resultDatas.get(i).getContent()+"] : "+resultDatas.get(i).getCount());
        }

        System.out.println();
        System.out.println("-------------------------------");
        System.out.println();

        for(int i=1;i<=10;i++)
            System.out.println(i+"번째 - "+"["+resultDatas.get(resultDatas.size()-i).getContent()+"] : "+resultDatas.get(resultDatas.size()-i).getCount());
    }
}
