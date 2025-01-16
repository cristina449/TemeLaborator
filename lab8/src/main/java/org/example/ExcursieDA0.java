import java.sql.*;

public class ExcursieDAO {
    public static void adaugaExcursie(Excursie excursie) {
        String query = "INSERT INTO excursii (id_persoana, destinatia, anul) VALUES (?, ?, ?)";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, excursie.getIdPersoana());
            stmt.setString(2, excursie.getDestinatie());
            stmt.setInt(3, excursie.getAnul());
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void afiseazaExcursii() {
        String query = "SELECT e.id_excursie, e.destinatia, e.anul, p.nume FROM excursii e JOIN persoane p ON e.id_persoana = p.id";

        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                System.out.println("Excursie ID: " + rs.getInt("id_excursie") + ", Destinatie: " + rs.getString("destinatia") + ", Anul: " + rs.getInt("anul") + ", Persoana: " + rs.getString("nume"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void afiseazaExcursiiPersoana(String nume) {
        String query = "SELECT e.destinatia, e.anul FROM excursii e JOIN persoane p ON e.id_persoana = p.id WHERE p.nume = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, nume);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                System.out.println("Destinatie: " + rs.getString("destinatia") + ", Anul: " + rs.getInt("anul"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void afiseazaPersoaneDestinatie(String destinatie) {
        String query = "SELECT p.nume FROM excursii e JOIN persoane p ON e.id_persoana = p.id WHERE e.destinatia = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, destinatie);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                System.out.println("Persoana: " + rs.getString("nume"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void afiseazaPersoaneAnul(int anul) {
        String query = "SELECT p.nume FROM excursii e JOIN persoane p ON e.id_persoana = p.id WHERE e.anul = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, anul);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                System.out.println("Persoana: " + rs.getString("nume"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void stergeExcursie(int idExcursie) {
        String query = "DELETE FROM excursii WHERE id_excursie = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, idExcursie);
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void stergePersoana(int idPersoana) {
        String query = "DELETE FROM excursii WHERE id_persoana = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, idPersoana);
            stmt.executeUpdate();

            query = "DELETE FROM persoane WHERE id = ?";
            try (PreparedStatement stmt2 = conn.prepareStatement(query)) {
                stmt2.setInt(1, idPersoana);
                stmt2.executeUpdate();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
