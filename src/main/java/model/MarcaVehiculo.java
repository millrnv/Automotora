package model;

public enum MarcaVehiculo {
    NISSAN("Nissan"),CHEVROLET("Chevrolet"),SUZUKI("Suzuki"),PEUGEOT("Peugeot"),HYUNDAI("Hyundai");

    private final String marca;

    MarcaVehiculo(String marca){
        this.marca = marca;
    }

    public String getMarca(){
        return marca;
    }

    @Override
    public String toString() {
        return "MarcaVehiculo{" +
                "marca='" + marca + '\'' +
                '}';
    }
}
