package utils;

public class ValidadorCorreo {

    //Método que valida el correo con caracter de @
    public static boolean validarCorreo(String correo) {
        boolean validacion = false;
        try {
            if (correo.contains("@")) {
                validacion = true;
            }
        } catch (Exception e) {
        }
        return validacion;
    }
}


