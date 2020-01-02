package model.data;

import com.koneksi.koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.pojo.ModelBarangDAO;
import utilities.DatabaseUtilities;

/**
 *
 * @author Acer
 */
public class PesananModelDAO {
 
    public List<ModelBarangDAO> loadPesanan() throws  SQLException{
        List<ModelBarangDAO> barangList;
        Connection con = DatabaseUtilities.getConnection();
        try {
            Statement state = con.createStatement();
            ResultSet rs = state.executeQuery("SELECT * FROM pesanan");
            barangList = new ArrayList<>();
            while (rs.next()) {                
                ModelBarangDAO brg = new ModelBarangDAO();
                brg.setNamaBarang(rs.getString("barang"));
                brg.setHarga(rs.getInt("harga"));
                brg.setQty(rs.getInt("qty"));
                brg.setTotal(rs.getInt("jumlah"));
                
                barangList.add(brg);
            }
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return  barangList;
    }
    
    public int insert(ModelBarangDAO brg) throws SQLException{
        Connection con = DatabaseUtilities.getConnection();
        try{
            PreparedStatement state = con.prepareStatement("INSERT INTO pesanan values(?,?,?,?)");
            state.setString(1, brg.getNamaBarang());
            state.setDouble(2, brg.getHarga());
            state.setInt(3, brg.getQty());
            state.setInt(4, brg.getTotal());
            return state.executeUpdate();
        } finally{
            if(con != null){
                con.close();
            }
        }
    }
    
    public List<ModelBarangDAO> tampilTabel() throws SQLException {
        List<ModelBarangDAO> brgDAO = null;
        ResultSet rss;
        Statement stt;
        DefaultTableModel model = null;
        Connection con = koneksi.getConnection();
        try {
            stt = con.createStatement();
            String sql = "SELECT * FROM paket_makanan";
            rss = stt.executeQuery(sql);
            while (rss.next()) {
                Object[] o;
                o = new Object[4];
                o[0] = rss.getString("id_paket");
                o[1] = rss.getString("nama_paket");
                o[2] = rss.getString("harga");
                model.addRow(o);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return brgDAO;
    }

    
    
}
    