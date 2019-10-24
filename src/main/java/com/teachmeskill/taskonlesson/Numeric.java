public class Numeric {
    public static void main (String[] args){
        int num = 0 ;
        do {
            num++;
            if(num %2 != 0){
                System.out.println(num);
                break;
            }
        } while (num <=5);
    }
}
