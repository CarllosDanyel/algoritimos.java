/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algo348a;
import javax.swing.JOptionPane;

public class Algo348a {

    public static void main(String[] args) {
       String[] names = new String[5];
        double[][] grades = new double[5][2];
        double[] averages = new double[5];

        for (int i = 0; i < 5; i++) {
            names[i] = JOptionPane.showInputDialog("Enter the name of student " + (i+1) + ":");
            grades[i][0] = Double.parseDouble(JOptionPane.showInputDialog("Enter the first grade of student " + (i+1) + ":"));
            grades[i][1] = Double.parseDouble(JOptionPane.showInputDialog("Enter the second grade of student " + (i+1) + ":"));
            averages[i] = (grades[i][0] + grades[i][1]) / 2;
        }

        String output = "Name\tGrade 1\tGrade 2\tAverage\n";
        for (int i = 0; i < 5; i++) {
            output += names[i] + "\t" + grades[i][0] + "\t" + grades[i][1] + "\t" + averages[i] + "\n";
        }

        JOptionPane.showMessageDialog(null, output);
    }
}
    
    

