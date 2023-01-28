public class leftTruncatable {
    public static void main(String[] args) {

        System.out.println("leftTruncatable");
        System.out.println(leftTruncatable(137));
    }
    public static boolean leftTruncatable(int num) {
        //System.out.println(isPrime(num));
        if (isPrime(num) && digits(num)) {
            int place = 1;
            int temp = num;
            while (temp != 0) {
                place = place * 10;
                temp = temp / 10;
            }
            place = place / 10;
            while (num != 0) {
                num = num % place;
                //  System.out.println(num);
                if (!isPrime(num)) {
                    return false;
                }
                place = place / 10;

            }
        } else {
            return false;
        }
    return true;
    }
    public static boolean isPrime(int number){

        for(int i =2;i<=number/2;i++){
        if(number%i==0){
            return false;
        }

    }
        return true;

}
public static boolean digits (int num) {
    int n = num;


    while (n != 0) {
        int ne = n % 10;
        if (ne == 0){
            return false;
    }
        n=n/10;
    }



    return true;
}

}