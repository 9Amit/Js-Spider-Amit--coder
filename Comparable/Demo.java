package Comparable;

import java.util.Arrays;
import java.util.Comparator;

public class Demo {
    public static void main(String[] args) {
        String [] s1={"Amit","cat","a"};
        ComparatorDemo cmp = new ComparatorDemo();
        Arrays.sort(s1,cmp);

        for(String s:s1){
            System.out.println(s);
        }
    }
    
     public static void sort(Object[] s2,Comparator c){
        for(int i=0;i<s2.length;i++){
            for(int j=0;j< s2.length-1;j++){
                if(c.compare(s2[j],s2[j+1])>0){
                    Object temp=s2[j];
                    s2[j]=s2[j+1];
                    s2[j+1]=temp;

                }
            }
            
        }
    }

}

