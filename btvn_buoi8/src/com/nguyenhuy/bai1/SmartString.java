package com.nguyenhuy.bai1;

import java.util.ArrayList;

public class SmartString {
    private String text;
    private ArrayList<New> news;

    public SmartString(String text) {
        this.text = text;
        news = new ArrayList<New>();
    }

    public void filter(){
        String tempText = text;
        int indexS = tempText.indexOf("<item>");
        int indexE = tempText.indexOf("</item>");
        String st = "<title><![CDATA[";
        String sl = "<link><![CDATA[";
        String si = "<img src=\"";
        String sd = "<pubDate><![CDATA[";
        while (indexS != -1){
            String item = tempText.substring(indexS + 1, indexE);
            String title, linkDetail, imgLink, date;
            title = item.substring((item.indexOf(st) + st.length()), item.indexOf("]]></title>"));
            linkDetail = item.substring(item.indexOf(sl) + sl.length(), item.indexOf("]]></link>"));
            imgLink = item.substring(item.indexOf(si) + si.length(), item.indexOf("\" /></a>]]></description>"));
            date = item.substring(item.indexOf(sd) + sd.length(), item.indexOf("]]></pubDate>"));
            news.add(new New(title, linkDetail, imgLink, date));
            tempText = tempText.substring(indexE + 1);
            indexS = tempText.indexOf("<item>");
            indexE = tempText.indexOf("</item>");
        }
    }

    public void showNews(){
        System.out.println("=== List of New ===");
        for(New n : news){
            System.out.println("###");
            n.print();
        }
    }


}
