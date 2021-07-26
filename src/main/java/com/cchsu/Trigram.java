package com.cchsu;

import java.util.ArrayList;
import java.util.List;

public class Trigram {
    String name;
    boolean firstgram;
    boolean secondgram;
    boolean thirdgram;
    int fuxiOrder;





    public Trigram(String str,boolean first,boolean second,boolean third,int fuxiOrder) {
        this.name=str;
        this.firstgram=first;
        this.secondgram=second;
        this.thirdgram=third;
        this.fuxiOrder=fuxiOrder;
                }

    void inverse(){
     this.firstgram= !this.firstgram;
     this.secondgram=!this.secondgram;
     this.thirdgram=!this.thirdgram;
    }

    void upsidedown(){
        boolean temp = this.firstgram;
        this.firstgram=this.thirdgram;
        this.thirdgram=temp;
    }

    public static List<Trigram> getAllTrigram(){
        List<Trigram> list=new ArrayList<Trigram>();
        list.add(0,new Trigram("乾",true,true,true,1));
        list.add(1,new Trigram("兌",false,true,true,2));
        list.add(2,new Trigram("離",true,false,true,3));
        list.add(3,new Trigram("震",false,false,true,4));
        list.add(4,new Trigram("巽",true,true,false,5));
        list.add(5,new Trigram("坎",false,true,false,6));
        list.add(6,new Trigram("艮",true,false,false,7));
        list.add(7,new Trigram("坤",false,false,false,8));
        return list;
    }
}
