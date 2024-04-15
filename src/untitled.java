import java.util.Scanner;

public class untitled {
    public static void  main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số bạn muốn kiểm tra:");
        int number = sc.nextInt();
        if ( number > 2)
            System.out.printf(number+" is not a prime");
        else {
            int i = 2;
            boolean check = true;
            while ( i <= Math.sqrt(number)){
                if (number % i ==0){
                    check = false;
                    break;
                }
                    i++;
            }
            if (check)
                System.out.printf(number+" is a prime");
            else
                System.out.printf(number+" is not a prime");
        }
    }
}
