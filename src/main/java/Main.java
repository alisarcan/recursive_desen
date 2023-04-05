import java.util.Scanner;
public class Main {
    static void recursive(int a, int temp){
        if(a > 0){
            System.out.print(a +  " ");
                recursive(a - 5, temp);

        } else if ( a <= 0) {
            recursive2(a, temp);
            
        }


    }
    static void recursive2(int a, int temp) {
        if(temp >= a){
            System.out.print(a + " ");
            recursive2(a + 5, temp);
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz ");
        int a = scan.nextInt();
        int temp = a;
        recursive(a, temp);
    }
}
