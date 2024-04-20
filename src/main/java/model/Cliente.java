package model;

public class Cliente {

    private String nombreCliente, direccion, correo, rut, nTelefonico;

    public Cliente(String nombreCliente, String direccion, String correo, String rut, String nTelefonico) {
        this.nombreCliente = nombreCliente;
        this.direccion = direccion;
        this.correo = correo;
        this.rut = rut;
        this.nTelefonico = nTelefonico;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getnTelefonico() {
        return nTelefonico;
    }

    public void setnTelefonico(String nTelefonico) {
        this.nTelefonico = nTelefonico;
    }

}
