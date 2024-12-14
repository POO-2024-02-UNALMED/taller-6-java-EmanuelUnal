package vehiculos;

public class Camion extends Vehiculo{
    private int ejes;
    private static int totalCamiones;

    public Camion(String placa, int puertas, String nombre, int precio, int peso, Fabricante fabricante,int ejes){
        super(placa, 2, 80, nombre, precio, peso, "4X2", fabricante);
        this.ejes = ejes;
        Camion.totalCamiones++;
    }


    public int getEjes() {
        return this.ejes;
    }

    public void setEjes(int ejes) {
        this.ejes = ejes;
    }

    public static int getTotalCamiones() {
        return totalCamiones;
    }

}