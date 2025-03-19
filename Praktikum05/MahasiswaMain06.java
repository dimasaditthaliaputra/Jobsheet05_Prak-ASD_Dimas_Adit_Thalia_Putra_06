import java.util.Scanner;

public class MahasiswaMain06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MahasiswaBerprestasi06 list = new MahasiswaBerprestasi06();

        for (int i = 0; i < 5; i++) {
            System.out.println("=========================");
            System.out.println("Mahasiswa ke-" + (i + 1));
            System.out.print("Masukan NIM: ");
            String nim = input.nextLine();
            System.out.print("Masukan Nama: ");
            String nama = input.nextLine();
            System.out.print("Masukan Kelas: ");
            String kelas = input.nextLine();
            System.out.print("Masukan IPK: ");
            double ipk = input.nextDouble();
            input.nextLine();
            System.out.println("=========================\n");

            Mahasiswa06 mhs = new Mahasiswa06(nim, nama, kelas, ipk);
            list.tambah(mhs);
        }

        System.out.println("Data mahasiswa sebelum sorting: ");
        list.tampil();

        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC): ");
        list.bubbleSort();
        list.tampil();
    }
}
