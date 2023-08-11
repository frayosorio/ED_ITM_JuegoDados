package juegodados;

import java.util.*;
import javax.swing.*;

public class Dado {

    private int numero;

    //método constructor
    public Dado() {
        //iniciar el dado en una cara predeterminada
        numero = 1;
    }

    public void lanzar(Random r) {
        //generar un número al azar entre 1 y 6
        numero = r.nextInt(6) + 1;
    }

    public void mostrar(JLabel lbl) {
        //obtener el nombre del archivo de la carta
        String nombreImagen = "/imagenes/" + String.valueOf(numero) + ".jpg";

        //cargar la imagen
        ImageIcon imagen = new ImageIcon(getClass().getResource(nombreImagen));

        //asignar la imagen al JLabel
        lbl.setIcon(imagen);

    }
    
    public int getNumero(){
        return numero;
    }

}
