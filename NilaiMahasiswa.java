public class NilaiMahasiswa { 
        public static void main(String[] args) {
    
            int jumlahMahasiswa [] = {1, 2, 3, 4, 5};
            String namaMahasiswa [] = {"Santi", "Aldi", "Riko", "Rahmi", "Koko"};
            int nilaiMahasiswa [] = {100, 50, 100, 90, 50};
            String statusArray [] = new String[jumlahMahasiswa.length];
    
            System.out.println("________________________________");
            for (int i = 0; i < 5; i++) {
                System.out.println("Mahasiswa Ke\t: " + jumlahMahasiswa[i]);
                System.out.println("Nama\t\t\t: " + namaMahasiswa[i]);
                System.out.println("Nilai\t\t\t: " + nilaiMahasiswa[i]);
                System.out.println("________________________________");
            }
    
            double totalNilai = 0;
            System.out.println("DAFTAR NILAI MAHASISWA");
            System.out.println("================================");
            System.out.println("No\tNama\tNilai\tStatus");
            System.out.println("================================");
    
            for (int i = 0; i < 5; i++) {
                totalNilai += nilaiMahasiswa[i];
                statusArray[i] = (nilaiMahasiswa[i] >= 60) ? "Lulus" : "Tidak Lulus";
                System.out.println((i + 1) + "\t" + namaMahasiswa[i] + "\t" + nilaiMahasiswa[i] + "\t\t" + statusArray[i]);
            }
    
            System.out.println("================================");
            System.out.println("Jumlah: " + totalNilai);
            System.out.println("Nilai Rata-rata: " + (totalNilai / 5));
        
    }
}
