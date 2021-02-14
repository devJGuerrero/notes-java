
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jose Guerrero
 */
public class Student {

    public static void main(String[] args) {
        int number;
        String message;
        String input = JOptionPane.showInputDialog(null, "Número: ");
        try {
            number = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor digite un número");
            Student.main(args);
            return;
        }
        message = "Binario " + number + " \t= " + Integer.toBinaryString(number);
        message += System.lineSeparator() + "Octal " + number + " \t= " + Integer.toOctalString(number);
        message += System.lineSeparator() + "Hex " + number + " \t= " + Integer.toHexString(number);
        JOptionPane.showMessageDialog(null, message);
        System.out.println(message);
    }
}
