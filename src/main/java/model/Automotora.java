package model;

import java.util.ArrayList;
import java.util.List;
import utils.*;

public class Automotora {

    private List<Vehiculo> vehiculos;
    private List<Cliente> clientes;
    private List<Sede> sedes;

    public Automotora(){
        this.clientes = new ArrayList<>();
        this.vehiculos = new ArrayList<>();
        this.sedes = new ArrayList<>();

    }

    public Cliente buscarCliente(String rut) {
        for (Cliente cliente : clientes) {
            if (cliente.getRut().equals(rut)) {
                return cliente;
            }
        }
        return null;
    }


    public boolean agregarCliente(String nombreCliente, String direccionCliente, String correoCliente, String rutCliente, String nTelefonico) {
        if (buscarCliente(rutCliente) == null && ValidadorRut.validarRut(rutCliente) && ValidadorCorreo.validarCorreo(correoCliente)){
            Cliente cliente = new Cliente(nombreCliente, direccionCliente, correoCliente, rutCliente, nTelefonico);
            this.clientes.add(cliente);
            return true;
        } else
            return false;

    }

    public void agregarSede(String nombre, String direccion){
        Sede sede = new Sede(nombre, direccion);
        this.sedes.add(sede);
    }

    public void agregarVehiculo(String nombre, ColorVehiculo color, MarcaVehiculo marca,  int anio, int precio, double kmRecorridos){
        Vehiculo vehiculo = new Vehiculo(nombre, marca, color, anio, precio, kmRecorridos);
        this.vehiculos.add(vehiculo);

    }

    public void eliminarVehiculo(){

    }

    public void eliminarCliente(){

    }

    public List<Vehiculo> buscarVehiculoMarca(MarcaVehiculo marca){
        List<Vehiculo> vehiculosMarca = new ArrayList<>();
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getMarca().equals(marca)) {
                vehiculosMarca.add(vehiculo);
            }
        }
        return vehiculosMarca;

    }

    public List<Vehiculo> buscarVehiculoNombre(String nombre){
        List<Vehiculo> vehiculosNombre = new ArrayList<>();
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getNombreVehiculo().equals(nombre)) {
                vehiculosNombre.add(vehiculo);
            }
        }
        return vehiculosNombre;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public List<Sede> getSedes() {
        return sedes;
    }

    public void setSedes(List<Sede> sedes) {
        this.sedes = sedes;
    }


}
