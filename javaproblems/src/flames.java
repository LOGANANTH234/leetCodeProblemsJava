import  java.util.*;
public class flames {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the frstName:");
        String frstname = in.next();
        System.out.print("enter the SecondName:");
        String secondName = in.next();
        int count = 0;
        frstname = frstname.toLowerCase();
        secondName = secondName.toLowerCase();
        char[] firstNme = frstname.toCharArray();
        char[] secnme = secondName.toCharArray();
        for (int i = 0; i < firstNme.length; i++) {
            for (int j = 0; j < secnme.length; j++) {


                if (firstNme[i] == secnme[j]) {
                    count++;
                    firstNme[i] = 0;
                    secnme[j] = 0;
                    break;

                    System.out.println(frstname.charAt(i));
                }
            }
        }

        count = count * 2;

        count = frstname.length() + secondName.length() - count;
        System.out.println(count);
        String flam = "flames";
        switch (count) {
            case 1:
                System.out.println("Sister");
                break;
            case 2:
            case 5:
            case 8:
            case 12:
            case 13:
                System.out.println("Affection");
                break;
            case 4:
            case 7:
            case 9:
                System.out.println("Enemy");
                break;
            case 3:
            case 14:
            case 16:
            case 18:
                System.out.println("Friend");
                break;
            case 6:
            case 11:
            case 15:
            case 17:
            case 20:
                System.out.println("Marriage");
                break;
            case 10:
                case 19:
                System.out.println("Love");
        }

    }
}
