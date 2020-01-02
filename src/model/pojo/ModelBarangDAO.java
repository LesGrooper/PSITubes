
package model.pojo;

public class ModelBarangDAO {
    private String namaBarang;
    private int harga;
    private int qty;
    private int total;

    public ModelBarangDAO(String namaBarang, int harga) {
        this.namaBarang = namaBarang;
        this.harga = harga;
    }
    
    public ModelBarangDAO(){
        
    }

    @Override
    public String toString() {
        return this.getNamaBarang();
    }

    /**
     * @return the namaBarang
     */
    public String getNamaBarang() {
        return namaBarang;
    }

    /**
     * @param namaBarang the namaBarang to set
     */
    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }


    /**
     * @return the harga
     */
    public double getHarga() {
        return harga;
    }

    /**
     * @param harga the harga to set
     */
    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void setQty(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setTotal(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the qty
     */
    public int getQty() {
        return qty;
    }

    /**
     * @return the total
     */
    public int getTotal() {
        return total;
    }
}
