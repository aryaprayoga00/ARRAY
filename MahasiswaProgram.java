public class MahasiswaProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah data: ");
        int jumlahData = input.nextInt();
        Mahasiswa[] mahasiswas = new Mahasiswa[jumlahData];

        for (int i = 0; i < jumlahData; i++) {
            System.out.println("\nMahasiswa Ke: " + (i + 1));
            mahasiswas[i] = new Mahasiswa();
            mahasiswas[i].inputData();
        }

        System.out.println("\nDAFTAR NILAI MAHASISWA\n");
        System.out.println("No\tNama\tNilai\tStatus");
        double totalNilai = 0;

        for (int i = 0; i < jumlahData; i++) {
            totalNilai += mahasiswas[i].getNilai();
            System.out.println((i + 1) + "\t" + mahasiswas[i].getNama() + "\t" + mahasiswas[i].getNilai() + "\t" + mahasiswas[i].getStatus());
        }

        System.out.println("\nJumlah: " + totalNilai);
        System.out.println("Nilai Rata-rata: " + (totalNilai / jumlahData));
    }
}

class Mahasiswa {
    private String nama;
    private double nilai;

    public void inputData() {
        Scanner input = new Scanner(System.in);

        System.out.print("Nama: ");
        nama = input.next();

        System.out.print("Nilai: ");
        nilai = input.nextDouble();
    }

    public String getNama() {
        return nama;
    }

    public double getNilai() {
        return nilai;
    }

    public String getStatus() {
        if (nilai >= 60) {
            return "Lulus";
        } else {
            return "Tidak Lulus";
        }
    }
}