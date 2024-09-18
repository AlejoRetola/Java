package ejercicio4.ej4;


public abstract class ClasePadre {
    protected int cantidadDeProductos;
    protected double pesoTotal;
    protected double precioTotal;

    public ClasePadre(int cantidad, double peso, double precio) {
        this.cantidadDeProductos = cantidad;
        this.pesoTotal = peso;
        this.precioTotal = precio;
    }

    public int getCantidadDeProductos() {
        return this.cantidadDeProductos;
    }

    public double getPesoTotal() {
        return this.pesoTotal;
    }

    public double getPrecioTotal() {
        return this.precioTotal;
    }
}
