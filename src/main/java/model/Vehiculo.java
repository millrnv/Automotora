package model;

public class Vehiculo {

    private String nombre;
    private MarcaVehiculo marca;
    private ColorVehiculo color;
    private int anio;
    private double precio, kmRecorridos;

    public Vehiculo(String nombre, MarcaVehiculo marca, ColorVehiculo color, int anio, double precio, double kmRecorridos) {
        this.nombre = nombre;
        this.marca = marca;
        this.color = color;
        this.anio = anio;
        this.precio = precio;
        this.kmRecorridos = kmRecorridos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public MarcaVehiculo getMarca() {
        return marca;
    }

    public void setMarca(MarcaVehiculo marca) {
        this.marca = marca;
    }

    public ColorVehiculo getColor() {
        return color;
    }

    public void setColor(ColorVehiculo color) {
        this.color = color;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getKmRecorridos() {
        return kmRecorridos;
    }

    public void setKmRecorridos(double kmRecorridos) {
        this.kmRecorridos = kmRecorridos;
    }
}
