import java.util.Scanner;

public class Main {
    static void recursiveMetot() {
        Scanner inp = new Scanner(System.in);
        System.out.print("N Sayısı : ");
        int n = inp.nextInt();

        int firstNumber = n;
        System.out.print("Çıktısı : " +n+" ");

        for (int i=n; i>0;i-=5){
            firstNumber-=5;
            System.out.print(firstNumber+" ");
        }

        int lastNumber = firstNumber;
        for (int i = lastNumber; i < n ; i += 5){
            lastNumber += 5;
            System.out.print(lastNumber+" ");

        }

    }
    public static void main(String[] args) {

        recursiveMetot();
    }
}
