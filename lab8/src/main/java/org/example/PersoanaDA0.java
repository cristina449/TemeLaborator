import java.sql.*;

public class PersoanaDAO {
    public static void adaugaPersoana(Persoana persoana) {
        String query = "INSERT INTO persoane (nume, varsta) VALUES (?, ?)";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, persoana.getNume());
            stmt.setInt(2, persoana.getVarsta());
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static boolean existaPersoana(String nume) {
        String query = "SELECT id FROM persoane WHERE nume = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, nume);
            ResultSet rs = stmt.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static void afiseazaPersoane() {
        String query = "SELECT * FROM persoane";
        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") + ", Nume: " + rs.getString("nume") + ", Varsta: " + rs.getInt("varsta"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
