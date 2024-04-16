package BUS;

import DAO.Database;
import DTO.PhongDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PhongBUS {
    private final Database db;
    

    public PhongBUS() {
        db = new Database();
    }

    public ResultSet getListPhong() {
        String query = "select * from PHONG where XuLy = 0";
        return db.getList(query);
    }

    public List<PhongDTO> getListPhong_DTO() {
        String query = "select * from PHONG where xuLY = 0";
        return db.getListPhongDTO(query);
    }

    public int getCountPhong() {
        String query = "select COUNT(MaP) from PHONG";
        return db.executeNonQueryGetInteger(query);
    }

    public void ThemPhong(String maP, String tenP, String loaiP, String giaP, String chiTietLoaiP, String tinhTrang, String hienTrang) {
        String query = String.format("insert into PHONG values ('%s',N'%s',%s,%s,%s,%s,%s,%s)", maP, tenP, loaiP, giaP, chiTietLoaiP, tinhTrang, hienTrang, 0);
        db.executeNonQuery(query);
    }

    public void SuaPhong(String maP, String tenP, String loaiP, String giaP, String chiTietLoaiP, String hienTrang) {
        String query = String.format("UPDATE PHONG SET tenP = N'%s', loaiP = '%s', giaP = '%s', chiTietLoaiP = '%s', hienTrang = '%s' WHERE maP = '%s'", tenP, loaiP, giaP, chiTietLoaiP, hienTrang, maP);
        db.executeNonQuery(query);
    }
    

    public void XoaPhong(String maP) {
        String query = "Update PHONG set xuLy = 1 where maP = '" + maP + "'";
        db.executeNonQuery(query);
    }

    public void SuaTinhTrang(String maP, String tinhTrang) {
        String query = String.format("Update PHONG set tinhTrang = %s where maP = '%s'", tinhTrang, maP);
        db.executeNonQuery(query);
    }
    public void FindPhong(String maP, String tenP, String loaiP, String chitietloaiP, int giaPhongMin, int giaPhongMax, int tinhtrang, int hientrang)
    {
    	ArrayList<Object> notNullObj = new ArrayList<>();
    	
    }
}
