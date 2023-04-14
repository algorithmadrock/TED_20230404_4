/*
 RESUMO		  : Tela de execucção da simulação básica da calculadora
 PROGRAMADORA : Luiza Felix
 DATA		  : 14/04/2023
 */

package view;

import javax.swing.JOptionPane;

import controller.Controller;

public class Principal {
	
	public static void main(String[] args) throws Exception {	
		Object menu;
		do {
			menu = JOptionPane.showInputDialog("a : Insere um valor na pilha\nç : Faz a operação matemática\ny : Encerra a aplicação");
//			adiciionando valor
			if (menu.equals("a")) {
				menu = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor na pilha:"));
				Controller.empilhar((int) menu);
				Controller.mostrar();
			}
//			controlando operadores
			if(menu.equals("ç")) {
				menu = JOptionPane.showInputDialog("Insira um operador matemático (+ - * /)");
				Controller.npr((String)menu);
			}
		}while(!menu.equals("y"));
	}
}
