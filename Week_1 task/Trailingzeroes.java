public class Trailingzeroes{
    public static void main(String[] args){
        int n = 100,count = 0;
        for (int i = 5; n/i > 0; i*= 5){
            count += n/i;
        }
        System.out.println(count);
    }
}
