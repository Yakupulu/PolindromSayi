import java.util.Scanner;
//Java ile bir sayının "Palindrom Sayı" olup olmadığını bulan bir program

public class Palidrom {

    static boolean isPalindrom(int x) {
        int temp, newNumber = 0, lastStep;
        temp = x;

        while (temp != 0) {
            lastStep = temp % 10;
            newNumber = (newNumber * 10) + lastStep;
            temp /= 10;
        }

        if (newNumber == x)
            System.out.println(x + "  bir polindrom sayidir.");
        else
            System.out.println(x + "  bir polindrom sayi degildir.");
        return true;
    }

    public static void main(String[] args) {
        int n;
        Scanner inp = new Scanner(System.in);

        System.out.print("Bir Sayi giriniz:");
        n = inp.nextInt();
        isPalindrom(n);
    }
}
