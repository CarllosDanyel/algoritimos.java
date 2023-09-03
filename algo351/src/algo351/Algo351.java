/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algo351;
import javax.swing.JOptionPane;

public class Algo351 {

   
    public static void main(String[] args) {
      String[] nomes = new String[5];

        for (int i = 0; i < 5; i++) {
            nomes[i] = JOptionPane.showInputDialog("Digite o nome da pessoa " + (i+1) + ":");
        }

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número de 1 a 5 correspondente a uma pessoa:"));
        JOptionPane.showMessageDialog(null, "O nome da pessoa " + numero + " é " + nomes[numero-1]);
    }
}
    
    

