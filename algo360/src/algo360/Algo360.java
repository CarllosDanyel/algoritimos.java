/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algo360;
import javax.swing.JOptionPane;

/**
 *
 * @author acarl
 */
public class Algo360 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int data = 0;

        while (data != 9999) {
            data = Integer.parseInt(JOptionPane.showInputDialog("Digite a data de nascimento (ddmm) ou 9999 para sair:"));

            switch (data / 100) {
                case 1:
                    if (data % 100 <= 20) {
                        JOptionPane.showMessageDialog(null, "Aquário: horóscopo de Aquário.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Peixes: horóscopo de Peixes.");
                    }
                    break;
                case 2:
                    if (data % 100 <= 19) {
                        JOptionPane.showMessageDialog(null, "Peixes: horóscopo de Peixes.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Áries: horóscopo de Áries.");
                    }
                    break;
                case 3:
                    if (data % 100 <= 20) {
                        JOptionPane.showMessageDialog(null, "Áries: horóscopo de Áries.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Touro: horóscopo de Touro.");
                    }
                    break;
                case 4:
                    if (data % 100 <= 20) {
                        JOptionPane.showMessageDialog(null, "Touro: horóscopo de Touro.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Gêmeos: horóscopo de Gêmeos.");
                    }
                    break;
                case 5:
                    if (data % 100 <= 20) {
                        JOptionPane.showMessageDialog(null, "Gêmeos: horóscopo de Gêmeos.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Câncer: horóscopo de Câncer.");
                    }
                    break;
                case 6:
                    if (data % 100 <= 21) {
                        JOptionPane.showMessageDialog(null, "Câncer: horóscopo de Câncer.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Leão: horóscopo de Leão.");
                    }
                    break;
                case 7:
                    if (data % 100 <= 22) {
                        JOptionPane.showMessageDialog(null, "Leão: horóscopo de Leão.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Virgem: horóscopo de Virgem.");
                    }
                    break;
                case 8:
                    if (data % 100 <= 22) {
                        JOptionPane.showMessageDialog(null, "Virgem: horóscopo de Virgem.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Libra: horóscopo de Libra.");
                    }
                    break;
                case 9:
                    if (data % 100 <= 22) {
                        JOptionPane.showMessageDialog(null, "Libra: horóscopo de Libra.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Escorpião: horóscopo de Escorpião.");
                    }
                    break;
                case 10:
                    if (data % 100 <= 22) {
                        JOptionPane.showMessageDialog(null, "Escorpião: horóscopo de Escorpião.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Sagitário: horóscopo de Sagitário.");
                    }
                    break;
                case 11:
                    if (data % 100 <= 21) {
                        JOptionPane.showMessageDialog(null, "Sagitário: horóscopo de Sagitário.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Capricórnio: horóscopo de Capricórnio.");
                    }
                    break;
                case 12:
                    if (data % 100 <= 21) {
                        JOptionPane.showMessageDialog(null, "Capricórnio: horóscopo de Capricórnio.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Aquário: horóscopo de Aquário.");
                    }
                    break;
                case 99:
                    JOptionPane.showMessageDialog(null, "Programa encerrado.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Data inválida.");
                    break;
            }
        }
    }
    
}
