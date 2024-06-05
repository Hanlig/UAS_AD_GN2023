package com.rplbo.parkirjdbc;

import java.sql.*;

public class ParkirApp {

    private Connection connect() {
        // SQLite connection string
        String url = "jdbc:sqlite:Path_to_your_sqlite_file.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public void tambahData(String noPlat, int lamaDetik) {
        String sql = "INSERT INTO parkir(no_plat,lama,harga) VALUES(?,?,?)";
        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, noPlat);
            pstmt.setInt(2, lamaDetik);
            // Hitung harga
            int harga = ((lamaDetik + 3599) / 3600) * 2000;
            pstmt.setInt(3, harga);

            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void tampilData() {
        String sql = "SELECT id, no_plat, lama, harga FROM parkir";

        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){

            while (rs.next()) {
                System.out.println(rs.getInt("id") +  "\t" +
                        rs.getString("no_plat") + "\t" +
                        rs.getInt("lama") + "\t" +
                        rs.getInt("harga"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void totalPemasukan() {
        String sql = "SELECT SUM(harga) AS Total FROM parkir";

        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)) {

            // only expecting a single result
            if (rs.next()) {
                System.out.println("Total pendapatan : " + rs.getInt("Total"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}