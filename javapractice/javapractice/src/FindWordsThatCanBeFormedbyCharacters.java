import java.util.*;
public class  FindWordsThatCanBeFormedbyCharacters {
    public static void main(String[] args) {
Scanner in = new Scanner (System.in);
        int length=in.nextInt();
       String [] c= new String[length];
        for(int i=0;i<length;i++){
            c[i]=in.next();
        }
       
       String s = in.next();
        System.out.println(countCharacters(c,s));
    }

    public static int countCharacters(String[] c, String s) {


        int sum=0;
        int cc=0;
        for(int i=0;i<c.length;i++){
            String temp=c[i];


            ArrayList<Character> m= new ArrayList<>();
            for(int ii=0;ii<s.length();ii++) {
                m.add( s.charAt(ii));
            }

            int j=0;
            while(j<temp.length()){
                if(m.contains(temp.charAt(j))){

                    m.remove(m.indexOf(temp.charAt(j)));


                }
                else{
                    cc++;
                    break;
                }
                j++;
            }
            if(cc<=0){


                sum=sum+temp.length();
            }
            cc=0;
        }
        return sum;
    }
}

