package vehiculos;
import java.util.ArrayList;

public class Fabricante {
    private String nombre;
    private Pais pais;
    private  static ArrayList<Fabricante> paises = new ArrayList<>(); // paises vendidos
    public int vehiculosVendidos; // paises vendidos

    public Fabricante(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    public static Fabricante fabricaMayorVentas(){
        int valMax = 0;
        Fabricante fabricaMax = null;
        for(Pais pais : paises){
            if(pais.getVehiculosVendidos() > valMax){
                valMax = pais.getVehiculosVendidos();
                fabricaMax = pais;
            }
        }
        return fabricaMax; // país vendidos
    }

    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public Pais getPais(){
        return this.pais;
    }
    public void setPais(Pais pais){
        this.pais = pais;
    }
}
