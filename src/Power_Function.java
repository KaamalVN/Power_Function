import java.util.Scanner;

public class Power_Function {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(power_mod(a,b,c));
    }

    static int power_mod(int a, int b, int c) {
        if(b==0){
            return 1;
        }
        int p=power_mod(a,b/2,c);
        if(b%2==0){
            return (p*p)%c;
        }
        else{
            return (p*p*a)%c;
        }
    }
}
