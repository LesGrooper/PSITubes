package controller;

import java.sql.SQLException;
import java.util.List;
import model.data.PesananModelDAO;
import model.pojo.ModelBarangDAO;
import view.SideBarMenu;

public class ProdukController {

    SideBarMenu sideBarMenu;

    public ProdukController() {
        sideBarMenu = new SideBarMenu();
    }

    public int tambahProduk() {
        return tambahProduk();

    }
    
    public List<ModelBarangDAO> tampilModelTabel() throws SQLException{
        PesananModelDAO model = new PesananModelDAO();
        return model.tampilTabel();
    }
}
