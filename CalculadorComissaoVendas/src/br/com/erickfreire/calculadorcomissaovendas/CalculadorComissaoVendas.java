package br.com.erickfreire.calculadorcomissaovendas;

import java.util.Scanner;

/**
 * Programa em Java que calcula a comissão de vendas
 * @author Erick Freire
 * @version 1 - Criado em 08-04-2021 as 22:19
 */

public class CalculadorComissaoVendas {
	private int item;
	private double valor;
	private int total = 1;
	private double montante = 0;
	private double resultfinal;
	
	
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getItem() {
		return item;
	}
	public void setItem(int item) {
		this.item = item;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public void calculaCom() {
		System.out.println("Calculadora de Comissão ");
		
		Scanner entrada = new Scanner(System.in);
		int contador;
		
		System.out.print("Digite 1 para inserir um valor ou -1 para encerrar o programa:");
		contador = entrada.nextInt();
		
		if(contador == -1) {
			System.out.println("Nenhum funcionadio foi adicionado");
		}
		
		while(contador != -1) {
			System.out.print("Informe o código do item: ");
			item = entrada.nextInt();
			
			System.out.print("Informe o valor do item: ");
			valor = entrada.nextDouble();
			
			System.out.printf("O Item %d foi adicionado as vendas", item);
						
			montante += valor;
			total++;
			
			System.out.print("Digite 1 para inserir um valor ou -1 para encerrar o programa:");
			contador = entrada.nextInt();
		}
		
		if(total > 1) {
		   resultfinal = (200.00 +((montante * 0.09) + montante));
		
		   System.out.printf("Total de itens vendidos: %d%n"
				        + "Total dos produtos vendidos: %.2f%n"
				        + "Comissão do mês com salario: %.2f%n", total, montante, resultfinal);
		}
	}
	

}
