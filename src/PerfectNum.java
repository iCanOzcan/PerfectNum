import java.util.Scanner;
public class PerfectNum {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        long total=0;
        System.out.print("bir sayi giriniz:");
        long num =scan.nextLong();

        for(long i=1; i<=(num-1); i++){
            if(num%i==0){
                total+=i;
            }
        }
        if(total==num){
            System.out.println(num+" mukemmel sayidir");
        }else{
            System.out.println(num+" mukemmel sayi degildir");
        }
    }
}
