import java.util.Scanner;

public class WhileKelipatan27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int kelipatan;
        int i = 1, total=0, counter=0;
        double avg;

        System.out.print("Masukkan bilangan kelipatan (1-9): ");
        kelipatan = scan.nextInt();

        while (i<=50) {
            if (i%kelipatan==0) {
                total += i;
                counter++;
            }
            i++;
        }

        avg = (double) total/counter;

        System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n",kelipatan,counter);
        System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n",kelipatan,total);
        System.out.printf("Rata-rata dari total bilangan kelipatan %d dari 1 sampai 50 adalah %f\n",kelipatan,avg);

        scan.close();
    }
}