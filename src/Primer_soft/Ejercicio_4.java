package Primer_soft;

import javax.swing.JOptionPane;

public class Ejercicio_4 {
    public void equit() {
        float grados, f;
        grados = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la temperatura en grados Celsius: "));
        f = 32 + (9 * grados / 5);
        JOptionPane.showMessageDialog(null, "La conversión a Fahrenheit es: " + f);
    }
}