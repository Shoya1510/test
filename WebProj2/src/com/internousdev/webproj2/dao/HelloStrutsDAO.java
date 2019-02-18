package com.internousdev.webproj2.dao;

import com.internousdev.webproj2.util.DBConnector;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class HelloStrutsDAO {

  public boolean select() {
     boolean ret=false;
     DBConnector db = new DBConnector();
     Connection con = db.getConnection();
     String sql = "select * from users";
     try {
       PreparedStatement ps = con.prepareStatement(sql);
       ResultSet rs = ps.executeQuery();
       if (rs.next()) {
          ret=true;
     }
     } catch (SQLException e) {
        e.printStackTrace();
     }
     try {
        con.close();
    } catch (SQLException e) {
     e.printStackTrace();
     }
     return ret;
       }
}