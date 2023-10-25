import java.util.Scanner;

public class LatihanMandiriWeek7_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama, jenisKelamin;

        for (int i = 1; i <= 30; i++) {
            System.out.print(i+". Masukkan nama Mahasiswa: ");
            nama = input.nextLine();

            System.out.println("Laki-laki(L) / Perempuan(P)");
            System.out.print("Masukkan jenis kelamin: ");
            jenisKelamin = input.nextLine();

            if (jenisKelamin.equalsIgnoreCase("p")) {
                System.out.println("Mahasiswa Perempuan: "+nama);
            } else {
                System.out.println("Bukan Mahasiswa Perempuan");
            }

        input.close();
        }
    }
}