package principal;

import javax.swing.JOptionPane;

import entidades.triangulo;
import validação.validar;

public class Principal {

	public static void main(String[] args) {
		triangulo tri = new triangulo();
		validar valida = new validar();
		triangulo x, y;	
		x = new triangulo();
		y = new triangulo();
		
		String input1 = JOptionPane.showInputDialog("Digite o 1º lado do triângulo A: ");
		x.a = valida.verificanumero(input1);
		String input2 = JOptionPane.showInputDialog("Digite o 2º lado do triângulo A: ");
		x.b = valida.verificanumero(input2);
		String input3 = JOptionPane.showInputDialog("Digite o 3º lado do triângulo A: ");
		x.c = valida.verificanumero(input3);
		String input4 = JOptionPane.showInputDialog("Digite o 1º lado do triângulo B: ");
		y.a = valida.verificanumero(input4);
		String input5 = JOptionPane.showInputDialog("Digite o 2º lado do triângulo B: ");
		y.b = valida.verificanumero(input5);
		String input6 = JOptionPane.showInputDialog("Digite o 3º lado do triângulo B: ");
		y.c = valida.verificanumero(input6);
		 
		double areaX = x.calculaArea();
		double areaY = y.calculaArea();
		
		tri.mostraEcompara(areaX, areaY);
	}
}