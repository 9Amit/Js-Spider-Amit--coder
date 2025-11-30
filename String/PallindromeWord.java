package String;

public class PallindromeWord {
    public static void main(String[] args) {
        String s="malaayalam";
        char c[]=s.toCharArray();
        int i=0,j=c.length-1;

        while(i<=j){
            if(c[i++]!=c[j--]) {
                System.out.println("False");
                break;
            }

        }

    }
}
