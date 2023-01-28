import java.util.*;
public class longestPalindromelength {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("enter");
        String string = in.next();
        System.out.println(length(string));
    }
    public static int length(String s){
        if(s.length()==1){
            return 1;
        }
        char[] ch= s.toCharArray();
     //   Arrays.sort(ch);
        for(int i=0;i<ch.length;i++){
            for(int j=1;j<ch.length-i;j++){
                if(ch[j-1]>ch[j]){
                    int temp=ch[j-1];
                    ch[j-1]=ch[j];
                    ch[j]=(char)temp;
                    System.out.println(Arrays.toString(ch));
                }
            }
        }

        int c=0;
        for(int i=1;i<ch.length;i++){
            if(ch[i-1]==ch[i]){
                ch[i]=0;
                c++;
            }
        }
        c=c*2;
        if (ch.length-c==0){
            return c;
        }
        return c+1;
    }
}