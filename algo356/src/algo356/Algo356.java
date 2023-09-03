/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algo356;
import javax.swing.JOptionPane; 

public class Algo356 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String[] nomes = new String[15];
        double[][] notas = new double[15][2];
        double[] medias = new double[15];
        String[] situacoes = new String[15];

        for (int i = 0; i < 15; i++) {
            nomes[i] = JOptionPane.showInputDialog("Digite o nome do aluno " + (i+1) + ":");
            notas[i][0] = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da PR1 do aluno " + (i+1) + ":"));
            notas[i][1] = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da PR2 do aluno " + (i+1) + ":"));
            medias[i] = Math.round((notas[i][0] + notas[i][1]) / 2);
            situacoes[i] = (medias[i] >= 6) ? "AP" : "RP";
        }

        String output = "Nome\tPR1\tPR2\tMédia\tSituação\n";
        for (int i = 0; i < 15; i++) {
            output += nomes[i] + "\t" + notas[i][0] + "\t" + notas[i][1] + "\t" + medias[i] + "\t" + situacoes[i] + "\n";
        }

        JOptionPane.showMessageDialog(null, output);
  

    }
    
}
