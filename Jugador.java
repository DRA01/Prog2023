package clases;
import java.sql.Connection; //Permite conectar
import java.sql.DriverManager; //Maneja el controlador
import java.sql.ResultSet; //Crea la estructura de datos
import java.sql.SQLException; //Devuelve excepcion sql
import java.sql.Statement; //Crea la sintaxis

public class Jugador  {
    public static void main(String[] args) {
        String bddUrl = "jdbc:mysql://localhost:3306/plantel";
        String bddUsr = "root";
        String bddPwd = "";
        String bddDriver = "com.mysql.cj.jdbc.Driver";
        String bddQuery = "SELECT * FROM jugadores";
        try (Connection con =  DriverManager.getConnection(bddUrl, bddUsr, bddPwd)){
            Class.forName(bddDriver);
            Statement consulta = con.createStatement();
            ResultSet rs = consulta.executeQuery(bddQuery);
            while(rs.next()){
                System.out.println(rs.getString("nombre"));
            }


        }catch(ClassNotFoundException e){
            System.out.println("Driver no encontrado");
        }catch(SQLException e){
            System.out.println("Error en la consulta" +  bddQuery);
        }
    }




    /*
    implements InterfazJugador
    private String nombre;
    private double altura;
    private double fuerza;
    private double velocidad;
    private int sueldo;

    public Jugador(){

    }

    @Override
    public void patea() {
       
    }

    @Override
    public void pateaPenal() {
        
    }

    @Override
    public void pase() {

    }

    @Override
    public void falta() {

    }
    
 */    
}
