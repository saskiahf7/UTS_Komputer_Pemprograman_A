import java.util.ArrayList;
import java.util.List;

// Class Gudang
class Gudang {
    private List<BarangGudang> daftarBarang = new ArrayList<>();

    public void tambahBarang(BarangGudang b) {
        daftarBarang.add(b);
        System.out.println("Barang berhasil ditambahkan ke gudang!");
    }

    public BarangGudang cariBarang(String kode) {
        for (BarangGudang b : daftarBarang) {
            if (b.getKodeBarang().equalsIgnoreCase(kode)) {
                return b;
            }
        }
        return null;
    }

    public void tampilkanSemuaBarang() {
        if (daftarBarang.isEmpty()) {
            System.out.println("Belum ada barang di gudang.");
        } else {
            System.out.println("\n=== DAFTAR STOK BARANG GUDANG ===");
            for (BarangGudang b : daftarBarang) {
                b.getInfo();
            }
        }
    }
}

