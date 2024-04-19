package model;

public enum ColorVehiculo {

    BLANCO("Blanco"),NEGRO("Negro"),ROJO("Rojo"),AMARILLO("Amarillo"),AZUL("Azul"),VERDE("Verde");

    private final String color;

    ColorVehiculo(String color){

        this.color = color;

    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "ColorVehiculo{" +
                "color='" + color + '\'' +
                '}';
    }
}
