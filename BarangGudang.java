// Class BarangGudang
class BarangGudang {
    private String kodeBarang;
    private String namaBarang;
    private int stok;

    public BarangGudang(String kodeBarang, String namaBarang, int stok) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.stok = stok;
    }

    public void tambahStok(int jumlah) {
        if (jumlah > 0) {
            stok += jumlah;
            System.out.println("Stok berhasil ditambahkan sebanyak " + jumlah);
        } else {
            System.out.println("Jumlah tidak valid!");
        }
    }

    public void kurangiStok(int jumlah) {
        if (jumlah > 0 && stok >= jumlah) {
            stok -= jumlah;
            System.out.println("Stok berhasil dikurangi sebanyak " + jumlah);
        } else {
            System.out.println("Stok tidak mencukupi atau jumlah tidak valid!");
        }
    }

    public void getInfo() {
        System.out.println("Kode: " + kodeBarang + " | Nama: " + namaBarang + " | Stok: " + stok);
    }

    public String getKodeBarang() {
        return kodeBarang;
    }
}

