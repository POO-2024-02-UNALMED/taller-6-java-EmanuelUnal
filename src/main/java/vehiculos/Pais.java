package vehiculos;
import java.util.ArrayList;

public class Pais {
    private String nombre;
    private  static ArrayList<Pais> paises = new ArrayList<>(); // paises vendidos
    public int vehiculosVendidos; // paises vendidos

    public Pais(){
        paises.add(this);
    }
    public Pais(String nombre){
        this.nombre = nombre;
        paises.add(this);
    }

    public static Pais paisMasVendedor(){
        int valMax = 0;
        Pais paisMax = null;
        for(Pais pais : paises){
            if(pais.getVehiculosVendidos() > valMax){
                valMax = pais.getVehiculosVendidos();
                paisMax = pais;
            }
        }
        return paisMax; // país vendidos
    }

    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public int getVehiculosVendidos(){
        return this.vehiculosVendidos;
    }
    public void setVehiculosVendidos(int vehiculosVendidos){
        this.vehiculosVendidos = vehiculosVendidos;
    }
}
