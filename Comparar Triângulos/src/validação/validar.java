package validação;

import javax.swing.JOptionPane;

public class validar {
	public double verificanumero(String inputs) {
		double X = 0;
		while (true) {
            try {
                if (inputs == null) {
                    JOptionPane.showMessageDialog(null, "Encerrando...");
                    System.exit(0); 
                }
                X = Double.parseDouble(inputs);
                if (X <= 0) {
                    JOptionPane.showMessageDialog(null, "Número inválido, tente novamente: ");
                    inputs = JOptionPane.showInputDialog("Digite novamente: ");
                } else {
                    break; 
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Número inválido, tente novamente: ");
                inputs = JOptionPane.showInputDialog("Digite novamente: ");
            }
        }
        return X;
	}

}
