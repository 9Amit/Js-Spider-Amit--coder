package String;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
      String s="Amit";
      char c[]=s.toCharArray();
      int left=0,right=c.length-1;

      while(left<right){
          if(c[left]!=c[right]){
              char temp=c[left];
              c[left]=c[right];
              c[right]=temp;
              left++;
              right--;
          }
      }
        System.out.println(new String(c));
    }
}
