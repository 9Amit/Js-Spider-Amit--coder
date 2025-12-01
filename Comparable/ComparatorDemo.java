package Comparable;

import java.util.Comparator;


public class ComparatorDemo implements Comparator {
    public int compare(Object arg1,Object arg2){
        String s1=(String) arg1;
        String s2=(String) arg2;

        if(s1.length()>s2.length()) return 1;
        if(s1.length()<s2.length()) return -1;
        else return 0;


    }
}
