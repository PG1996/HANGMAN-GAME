/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Parth Goel
 */
public class WinOrLose {
    String tester(String p,String d,char ch,int count)
    {
        String s="";
        int f=0;
        int l = p.length();
        //System.out.println(a);
        String w = "",t="";
        for(int i = 0;i < l;i++){
            if(p.charAt(i) == ch)
            {
                w = w + ch;
            }
            else
                w = w + d.charAt(i);
        }
        if (d.equals(w))
            t = "up";
        else if(w.equals(p))
            t = "1";
        else
            t = w;
        return t;
    }
    
}
