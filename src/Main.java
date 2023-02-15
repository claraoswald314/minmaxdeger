import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int value;
        int number;
        int max=0;
        int min = 0;

        System.out.print("Girilecek sayı miktarı : ");
        value= input.nextInt();

        for(int i=1; i<=value; i++){
            System.out.print("Bir sayı giriniz : ");
            number = input.nextInt();

            if(i==1){
                max=number;
                min=number;

            }
            if(max<number){
                max=number;

            }
            if(min>number){
                min=number;
            }

        }
        System.out.println("En Küçük Sayı : "+min);
        System.out.println("En Büyük Sayı : "+max);


    }
}
