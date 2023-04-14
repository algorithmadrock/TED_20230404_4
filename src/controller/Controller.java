/*
 RESUMO		  : "Configurações" do modo NPR de uma calculadora
 PROGRAMADORA : Luiza Felix
 DATA		  : 14/04/2023
 */

package controller;

import br.edu.fateczl.pilhas.IntPilha;

public class Controller {
	private static IntPilha pilha = new IntPilha();

	public static void empilhar(int valor) throws Exception {
		pilha.push(valor);
	}
	public static void mostrar() {
		System.out.println("PILHA: " + pilha.toString());
	}

	public static int npr(String operador) throws Exception {
		if (pilha.size() >= 2) {
			int resultado = 0, a = pilha.pop(), b = pilha.pop();

			switch (operador) {
			case "+":
				resultado = b + a;
				pilha.push(resultado);
				break;
			case "-":
				resultado = b - a;
				pilha.push(resultado);
				break;
			case "*":
				resultado = b * a;
				pilha.push(resultado);
				break;
			case "/":
				resultado = b / a;
				pilha.push(resultado);
				break;
			}
			mostrar();
			return resultado;
		} else {
			throw new Exception("Não há elementos o suficiente na pilha!");
		}

	}
}
