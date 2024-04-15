import java.util.Scanner;

public class baitap2 {
    public static void main(String[]args) {
        System.out.println("Menu");
        System.out.println("1.Print the rectangle");
        System.out.println("2.Print the square triangle");
        System.out.println("3.Tam giác cân:");
        System.out.println("4.Mời bạn chọn");
        Scanner scanner=new Scanner(System.in);
        int chon = scanner.nextInt();
        switch (chon ){
            case 1:
                for ( int i=1;i<=3;i++){
                    for (int j=1; j<= 10; j++){
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                break;
            case 2:
                for (int i=1; i<=7;i++){
                    for (int j=1; j<= i; j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 3:
                for (int i=7; i>=7;i--){
                    for (int j= i ; j <7; j++){
                        System.out.print("*");
                    }
                    for (int k=0; k<(2*i-1); k++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
        }
    }
}