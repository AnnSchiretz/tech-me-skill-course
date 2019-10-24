public class ArrayApp{
    public static void main(String[] args){

        int [] arr = new int[5];
        int j = 0;
        for (int i = 0; i < 10; i++) {
            if (i %2 != 0){
                arr[j] = i;
                j++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }

//        int [] arr2 = new int[6];
//        for (int i = 0; i < arr2.length; i++){
//            arr2[i] = (int) (100 + (Math.random() * 200));
//            System.out.println(arr2[i]);
//        }
//        int sum = 0;
//        int averageValue = 0;
//        for (int i = 0; i < arr2.length; i++){
//            sum = sum+arr2[i];
//        }
//        averageValue = sum / arr2.length;
//        System.out.println(sum);
//        System.out.println(averageValue);
    }
}