import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Gudang gudang = new Gudang();

        while (true) {
            System.out.println("\n=== SISTEM INVENTORI GUDANG ===");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Tambah Stok");
            System.out.println("3. Kurangi Stok");
            System.out.println("4. Tampilkan Semua Barang");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = input.nextInt();
            input.nextLine(); // membersihkan buffer

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode barang: ");
                    String kode = input.nextLine();
                    System.out.print("Masukkan nama barang: ");
                    String nama = input.nextLine();
                    System.out.print("Masukkan stok awal: ");
                    int stok = input.nextInt();

                    BarangGudang barang = new BarangGudang(kode, nama, stok);
                    gudang.tambahBarang(barang);
                    System.out.println("Barang berhasil ditambahkan!");
                    break;

                case 2:
                    System.out.print("Masukkan kode barang: ");
                    kode = input.nextLine();
                    BarangGudang bTambah = gudang.cariBarang(kode);
                    if (bTambah != null) {
                        System.out.print("Masukkan jumlah stok yang ingin ditambah: ");
                        int tambah = input.nextInt();
                        bTambah.tambahStok(tambah);
                    } else {
                        System.out.println("Barang tidak ditemukan!");
                    }
                    break;

                case 3:
                    System.out.print("Masukkan kode barang: ");
                    kode = input.nextLine();
                    BarangGudang bKurang = gudang.cariBarang(kode);
                    if (bKurang != null) {
                        System.out.print("Masukkan jumlah stok yang ingin dikurangi: ");
                        int kurang = input.nextInt();
                        bKurang.kurangiStok(kurang);
                    } else {
                        System.out.println("Barang tidak ditemukan!");
                    }
                    break;

                case 4:
                    gudang.tampilkanSemuaBarang();
                    break;

                case 5:
                    System.out.println("Terima kasih! Program selesai.");
                    input.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid. Coba lagi!");
            }
        }
    }
}