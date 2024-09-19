import javax.swing.JOptionPane;

public class SomaInteiros {
    
    public static void main(String[] args) {
        String valor1String = 
        JOptionPane.showInputDialog("Digite o primeiro valor: ");
        double valor1 = Double.parseDouble(valor1String);
        String valor2String =
        JOptionPane.showInputDialog("Digite o segundo valor: ");
        double valor2 = Double.parseDouble(valor2String);

        JOptionPane.showMessageDialog(null, "A soma de " + valor1 + " com " + valor2 + " eh igual a " +(valor1 + valor2));
    }

}
