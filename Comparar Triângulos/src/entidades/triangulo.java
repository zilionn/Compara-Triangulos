package entidades;

import javax.swing.JOptionPane;

public class triangulo {
	public double a;
	public double b;
	public double c;



	public double calculaArea() {
	double p = (a + b + c) / 2;
	return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
	
	public void mostraEcompara(double areaA, double areaB) {
		if (areaA > areaB) {
			JOptionPane.showMessageDialog(null, "O valor dos dois triângulos é = " +areaA+ " e " + areaB + " e o maior é = " +areaA);
		} else {
			JOptionPane.showMessageDialog(null, "O valor dos dois triângulos é = " +areaA+ " e " + areaB + " e o maior é = " +areaB);
		}
		
	}
}