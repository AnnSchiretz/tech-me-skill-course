public class Number1 {
    public static void main(String[] args){
        int num = 1;
        do{
            num++;
            if(num %2 ==0){
                System.out.println(num);
                continue;
            }
        } while( num<=10);

    }
}
