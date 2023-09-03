/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algo346;
import javax.swing.JOptionPane;

/**
 *
 * @author acarl
 */
public class Algo346 {

   
    public static void main(String[] args) {
        String frase = JOptionPane.showInputDialog("Digite uma frase:");
        int opcao = 0;

        while (opcao != 4) {
            String menu = "MENU\n";
            menu += "1 - Imprime o comprimento da frase\n";
            menu += "2 - Imprime os dois primeiros e os dois últimos caracteres da frase\n";
            menu += "3 - Imprime a frase espelhada\n";
            menu += "4 - Termina o algoritmo\n";
            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcao) {
                case 1 -> JOptionPane.showMessageDialog(null, "O comprimento da frase é " + frase.length());
                case 2 -> JOptionPane.showMessageDialog(null, "Os dois primeiros caracteres da frase são " + frase.substring(0, 2) + " e os dois últimos são " + frase.substring(frase.length() - 2));
                case 3 -> JOptionPane.showMessageDialog(null, "A frase espelhada é " + new StringBuilder(frase).reverse().toString());
                case 4 -> JOptionPane.showMessageDialog(null, "O programa foi encerrado.");
                default -> JOptionPane.showMessageDialog(null, "Opção inválida.");
            }
        }
    }
}
 
    

