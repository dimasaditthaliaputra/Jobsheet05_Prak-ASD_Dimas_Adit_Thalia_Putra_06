import java.util.Scanner;

public class DosenMain06 {
    static Scanner input = new Scanner(System.in);
    static DataDosen06 dataDosen = new DataDosen06();

    public static void main(String[] args) {
        int pilihan;
        do {
            System.out.println("\n===== MENU DATA DOSEN =====");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampil Data");
            System.out.println("3. Data Usia Dosen dari termuda ke tertua (ASC)");
            System.out.println("4. Data Usia Dosen dari tertua ke termuda (DSC)");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    tambahData();
                    break;
                case 2:
                    tampilData();
                    break;
                case 3:
                    sortingASC();
                    break;
                case 4:
                    sortingDSC();
                    break;
                case 5:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        } while (pilihan != 5);

        input.close();
    }

    static void tambahData() {
        for (int i = 0; i < 10; i++) {
            System.out.print("Masukkan kode dosen   : ");
            String kode = input.nextLine();
            System.out.print("Masukkan nama dosen   : ");
            String nama = input.nextLine();
    
            boolean jk = false;
            while (true) {
                System.out.print("Masukkan jenis kelamin (L = Laki-laki, P = Perempuan): ");
                String jenisKelamin = input.nextLine();
    
                if (jenisKelamin.equalsIgnoreCase("L")) {
                    jk = true;
                    break;
                } else if (jenisKelamin.equalsIgnoreCase("P")) {
                    jk = false;
                    break;
                } else {
                    System.out.println("Input tidak valid! Harap masukkan 'L' atau 'P'.");
                }
            }
    
            System.out.print("Masukkan usia dosen   : ");
            int usia = input.nextInt();
            input.nextLine();
    
            Dosen06 dsn = new Dosen06(kode, nama, jk, usia);
            dataDosen.tambah(dsn);
            System.out.println("Data dosen berhasil ditambahkan!");
            System.out.println("-------------------------------");
        }
    }    

    static void tampilData() {
        if (dataDosen.idx == 0) {
            System.out.println("\nBelum ada data dosen.");
        } else {
            System.out.println("\n===== DATA DOSEN =====");
            dataDosen.tampil();
        }
    }

    static void sortingASC() {
        if (dataDosen.idx > 1) {
            System.out.println("\nData usia dosen dari termuda ke tertua (ASC).");
            System.out.println("-------------------------------");
            dataDosen.sortingASC();
            dataDosen.tampil();
        } else {
            System.out.println("\nData belum cukup untuk sorting.");
        }
    }

    static void sortingDSC() {
        if (dataDosen.idx > 1) {
            System.out.println("\nData usia dosen dari tertua ke termuda (DSC).");
            System.out.println("-------------------------------");
            dataDosen.sortingDSC();
            dataDosen.tampil();
        } else {
            System.out.println("\nData belum cukup untuk sorting.");
        }
    }
}