package ejercicio4;

import javax.swing.JOptionPane;

/**
 *
 * @author oquintansocampo
 */
public class Condicional {

    private double peso1;
    private double peso2;
    private String nombre1;
    private String nombre2;

    public Condicional() {

    }

    public double peso() {
        String respuesta = JOptionPane.showInputDialog("Introduce Peso: ");
        double valor = Double.parseDouble(respuesta);
        return valor;
    }

    public String nombre() {
        String respuesta = JOptionPane.showInputDialog("Introducir Nombre: ");
        return respuesta;
    }

    public void comparar(double p1, double p2, String n1, String n2) {
        nombre1 = n1;
        nombre2 = n2;
        peso1 = p1;
        peso2 = p2;
        Condicional par1 = new Condicional();
        if (p1 > p2) {
            JOptionPane.showMessageDialog(null, "Nombre: " + n1 + " Peso: " + p1 + " Diferencia: " + (p1 - p2));
        } else {
            JOptionPane.showMessageDialog(null, "Nombre: " + n2 + " Peso: " + p2 + " Diferencia: " + (p2 - p1));
        }
    }

}
