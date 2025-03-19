public class MahasiswaBerprestasi06 {
    Mahasiswa06 [] listMhs = new Mahasiswa06[5];
    int idx;

    void tambah (Mahasiswa06 mhs) {
        if (idx < listMhs.length) {
            listMhs[idx] = mhs;
            idx++;
        } else {
            System.out.println("data sudah penuh");
        }
    }

    void tampil() {
        for (Mahasiswa06 m : listMhs) {
            m.tampilInformasi();
            System.out.println("-------------------------");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            for (int j = 1; j < listMhs.length - i; j++) {
                if (listMhs[j].ipk > listMhs[j - 1].ipk) {
                    Mahasiswa06 tmp = listMhs[j];
                    listMhs[j] = listMhs[j -1];
                    listMhs[j - 1] = tmp;
                }
            }
        }
    }
}
