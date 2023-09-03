/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algo358;
import javax.swing.JOptionPane;   
public class Algo358 {

    
    public static void main(String[] args) {
        int lucroMenor10 = 0;
        int lucroEntre10e20 = 0;
        int lucroMaior20 = 0;

        for (int i = 0; i < 100; i++) {
            double precoCompra = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço de compra da mercadoria " + (i+1) + ":"));
            double precoVenda = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço de venda da mercadoria " + (i+1) + ":"));
            double lucro = (precoVenda - precoCompra) / precoCompra * 100;

            if (lucro < 10) {
                lucroMenor10++;
            } else if (lucro <= 20) {
                lucroEntre10e20++;
            } else {
                lucroMaior20++;
            }
        }

        String output = "Quantidade de mercadorias com lucro < 10%: " + lucroMenor10 + "\n";
        output += "Quantidade de mercadorias com 10% <= lucro <= 20%: " + lucroEntre10e20 + "\n";
        output += "Quantidade de mercadorias com lucro > 20%: " + lucroMaior20 + "\n";
        JOptionPane.showMessageDialog(null, output);
    }
}
    
    

