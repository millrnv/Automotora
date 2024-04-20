package controller;

import model.Automotora;
import ventanas.VentanaMenuBienvenida;

public class Main {
    public static void main(String[] args) {

        inicializar();


    }

    public static void inicializar(){

        Automotora automotora = new Automotora();
        VentanaMenuBienvenida ventanaMenuBienvenida = new VentanaMenuBienvenida(automotora);
        ventanaMenuBienvenida.setVisible(true);

    }

}