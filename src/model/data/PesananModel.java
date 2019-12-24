/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.ModelBarang;
import model.ModelPenjualan;
import utilities.DatabaseUtilities;

/**
 *
 * @author Acer
 */
public class PesananModel {
 
    public List<ModelBarang> loadPesanan() throws  SQLException{
        List<ModelBarang> barangList;
        Connection con = DatabaseUtilities.getConnection();
        try {
            Statement state = con.createStatement();
            ResultSet rs = state.executeQuery("SELECT * FROM pesanan");
            barangList = new ArrayList<>();
            while (rs.next()) {                
                ModelBarang brg = new ModelBarang();
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
    
    public int insert(ModelBarang brg) throws SQLException{
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
    
    
}
    
//    public int save(Mahasiswa mhs) throws SQLException{
//        Connection con = DatabaseUtilities.getConnection();
//        try {
//            PreparedStatement stat = con.prepareStatement("INSERT INTO pesanan values (?,?,?,?)");
//            stat.setString(1, mhs.getNamaBarang());
//            stat.setInt(2, mhs.getHarga());
//            stat.setInt(3, mhs.getQty());
//            stat.setInt(3, mhs.getJumlah());
//            
//            return stat.executeUpdate();
//        } finally{
//            if (con != null) {
//                con.close();
//            }
//        }
//    }
//    
//    public int delete(String nrp) throws SQLException{
//        Connection con = DatabaseUtilities.getConnection();
//        
//        try {
//            PreparedStatement stat = con.prepareStatement("DELETE FROM mahasiswa WHERE nrp = '" + nrp + "'");
//            stat.executeUpdate();
//            
//            return stat.executeUpdate();
//        } finally{
//            if (con != null) {
//                con.close();
//            }
//        }
//    }
//    
//    public int update(String nrp, String nama, Float ipk) throws SQLException{
//        Connection con = DatabaseUtilities.getConnection();
//        try {
//            PreparedStatement stat = con.prepareStatement("UPDATE mahasiswa set nama='"+nama+"', ipk='"+ipk+"' WHERE nrp='"+ nrp+"'");
//            return stat.executeUpdate();
//        } finally{
//            if (con != null) {
//                con.close();
//            }
//        }
//    }
//}
