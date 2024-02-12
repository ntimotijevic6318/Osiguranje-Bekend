package rs.raf.demo.repositories.osiguranik;
import rs.raf.demo.entities.Osiguranik;
import rs.raf.demo.entities.PomocniOsiguranik;
import rs.raf.demo.repositories.MySqlAbstractRepository;

import javax.ws.rs.core.Response;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySqlOsiguranikRepo extends MySqlAbstractRepository implements OsiguranikRepo {

    @Override
    public Osiguranik dodajOsiguranika(Osiguranik osiguranik) {

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = this.newConnection();

            String[] generatedColumns = {"id"};

            preparedStatement = connection.prepareStatement("INSERT INTO osiguranici  (imeOsiguranika, prezimeOsiguranika, datumRodjenjaOsiguranika, brojPasosaOsiguranika , telefonOsiguranika , imejlOsiguranika , datumPutovanjaOsiguranikaOd , datumPutovanjaOsiguranikaDo , nacinPutovanjaOsiguranika , razlikaUDanima) VALUES(?, ? , ?, ?, ? , ? , ? , ? , ?, ?)", generatedColumns);

            preparedStatement.setString(1, osiguranik.getImeOsiguranika());
            preparedStatement.setString(2, osiguranik.getPrezimeOsiguranika());
            preparedStatement.setDate(3,  osiguranik.getDatumRodjenjaOsiguranika());
            preparedStatement.setString(4 , osiguranik.getBrojPasosaOsiguranika());
            preparedStatement.setString(5 , osiguranik.getTelefonOsiguranika());
            preparedStatement.setString(6, osiguranik.getImejlOsiguranika());
            preparedStatement.setDate(7,  osiguranik.getDatumPutovanjaOsiguranikaOd());
            preparedStatement.setDate(8,  osiguranik.getDatumPutovanjaOsiguranikaDo());
            preparedStatement.setString(9 , osiguranik.getNacinPutovanjaOsiguranika());
            preparedStatement.setString(10 , osiguranik.getRazlikaUDanima());

            preparedStatement.executeUpdate();

            resultSet = preparedStatement.getGeneratedKeys();

            if (resultSet.next()) {
                osiguranik.setId(resultSet.getInt(1));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
           // this.closeStatement(preparedStatement);
            //this.closeResultSet(resultSet);
           // this.closeConnection(connection);
        }

        return osiguranik;
    }

    @Override
    public List<Osiguranik> sviOsiguranici() {
        List<Osiguranik> osiguranici  = new ArrayList<>();

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            connection = this.newConnection();

            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from osiguranici");
            while (resultSet.next()) {
                osiguranici.add(new Osiguranik(resultSet.getInt("id"),  resultSet.getString("imeOsiguranika") , resultSet.getString("prezimeOsiguranika") , resultSet.getDate("datumRodjenjaOsiguranika"), resultSet.getString("brojPasosaOsiguranika") , resultSet.getString("telefonOsiguranika"), resultSet.getString("imejlOsiguranika"), resultSet.getDate("datumPutovanjaOsiguranikaOd") , resultSet.getDate("datumPutovanjaOsiguranikaDo") , resultSet.getString("nacinPutovanjaOsiguranika") ,resultSet.getString("razlikaUDanima") ,resultSet.getDate("datumUnosaPolise")));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           // this.closeStatement(statement);
            //this.closeResultSet(resultSet);
            //this.closeConnection(connection);
        }

        return osiguranici;
    }

    @Override
    public PomocniOsiguranik dodajPomocnogOsiguranika(PomocniOsiguranik pomocniOsiguranik) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = this.newConnection();

            String[] generatedColumns = {"id"};

            preparedStatement = connection.prepareStatement("INSERT INTO pomocniosiguranici  (imePomocnogOsiguranika , prezimePomocnogOsiguranika , datumRodjenjaPomocnogOsiguranika , idNosiocaOsiguranja , brojPasosaPomocnogOsiguranika) VALUES(?, ? , ?, ? , ?)", generatedColumns);

            preparedStatement.setString(1, pomocniOsiguranik.getImePomocnogOsiguranika());
            preparedStatement.setString(2, pomocniOsiguranik.getPrezimePomocnogOsiguranika());
            preparedStatement.setDate(3,  pomocniOsiguranik.getDatumRodjenjaPomocnogOsiguranika());
            preparedStatement.setInt(4 , pomocniOsiguranik.getIdNosiocaOsiguranja());
            preparedStatement.setString(5 , pomocniOsiguranik.getBrojPasosaPomocnogOsiguranika());

            preparedStatement.executeUpdate();

            resultSet = preparedStatement.getGeneratedKeys();

            if (resultSet.next()) {
                pomocniOsiguranik.setId(resultSet.getInt(1));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // this.closeStatement(preparedStatement);
            //this.closeResultSet(resultSet);
            // this.closeConnection(connection);
        }

        return pomocniOsiguranik;
    }

    @Override
    public Osiguranik pronadjiOsiguranika(Integer id) {
        Osiguranik osiguranik = null;

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = this.newConnection();

            preparedStatement = connection.prepareStatement("SELECT * FROM osiguranici where id = ?");
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();

            if(resultSet.next()) {
                Integer idOsiguranika = resultSet.getInt("id");
                String imeOsiguranika = resultSet.getString("imeOsiguranika");
                String prezimeOsiguranika = resultSet.getString("prezimeOsiguranika");
                Date datumRodjenjaOsiguranika = resultSet.getDate("datumRodjenjaOsiguranika");
                String brojPasosaOsiguranika = resultSet.getString("brojPasosaOsiguranika");
                String telefonOsiguranika = resultSet.getString("telefonOsiguranika");
                String imejlOsiguranika = resultSet.getString("imejlOsiguranika");
                Date datumPutovanjaOsiguranikaOd = resultSet.getDate("datumPutovanjaOsiguranikaOd");
                Date datumPutovanjaOsiguranikaDo = resultSet.getDate("datumPutovanjaOsiguranikaDo");
                String nacinPutovanjaOsiguranika = resultSet.getString("nacinPutovanjaOsiguranika");
                String razlikaUDanima = resultSet.getString("razlikaUDanima");
                Date datumuUnosaPolise = resultSet.getDate("datumUnosaPolise");

                osiguranik = new Osiguranik(idOsiguranika , imeOsiguranika, prezimeOsiguranika , datumRodjenjaOsiguranika , brojPasosaOsiguranika , telefonOsiguranika , imejlOsiguranika , datumPutovanjaOsiguranikaOd , datumPutovanjaOsiguranikaDo , nacinPutovanjaOsiguranika, razlikaUDanima, datumuUnosaPolise);
            }

            resultSet.close();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            this.closeStatement(preparedStatement);
            this.closeResultSet(resultSet);
            this.closeConnection(connection);
        }

        return osiguranik;
    }

    @Override
    public List<PomocniOsiguranik> sviPomocniOsiguranici(Integer id) {
        List<PomocniOsiguranik> pomocniOsiguranici  = new ArrayList<>();

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = this.newConnection();


            preparedStatement = connection.prepareStatement("SELECT * FROM pomocniosiguranici where idNosiocaOsiguranja = ?");
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                pomocniOsiguranici.add(new PomocniOsiguranik(resultSet.getInt("id"),  resultSet.getString("imePomocnogOsiguranika") , resultSet.getString("prezimePomocnogOsiguranika") , resultSet.getDate("datumRodjenjaPomocnogOsiguranika") , resultSet.getString("brojPasosaPomocnogOsiguranika")));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // this.closeStatement(statement);
            //this.closeResultSet(resultSet);
            //this.closeConnection(connection);
        }

        return pomocniOsiguranici;
    }


}
