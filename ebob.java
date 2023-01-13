import java.util.Scanner;
public class ebob {
    public static void main(String[] args) {

        int n1;
        int n2;
        int ekok;

        Scanner number = new Scanner(System.in);

        System.out.print("Please enter number n1 : ");
        n1 = number.nextInt();

        System.out.print("Please enter number n2 : ");
        n2 = number.nextInt();

        int smallNumber = n1 < n2 ? n1 :n2; // Küçük olan sayıyı başa almak için sorgu

        int ebob=1;

        int i=n1;
            while (i >= 1) {
                if (n1 % i == 0 && n2 % i == 0) {
                    ebob = i;
                    System.out.println("Ebob : " + ebob);
                    System.out.println("Ekok : " + (n1*n2) / ebob);
                    break;
                }
                i--;
            }
            

        }

        }
