package dbkoneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbkoneksi {

    // Konstanta koneksi
    private static final String URL = "jdbc:mysql://localhost:3306/toko_roti_db"; // Ganti dengan nama database kamu
    private static final String USER = "root";    // Ganti dengan username MySQL kamu
    private static final String PASSWORD = "";    // Ganti dengan password MySQL kamu

    // Method untuk mendapatkan koneksi
    public static Connection getConnection() throws SQLException {
        try {
            // Load driver JDBC MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Buat koneksi
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new SQLException("Driver JDBC tidak ditemukan.", e);
        }
    }
}