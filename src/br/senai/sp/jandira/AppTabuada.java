package br.senai.sp.jandira;

import br.senai.sp.jandira.gui.FrameTabuada;
import br.senai.sp.jandira.model.Tabuada;

public class AppTabuada {

	public static void main(String[] args) {
		
		
		FrameTabuada frame = new FrameTabuada();
		frame.altura = 750;
		frame.largura = 450;
		frame.titulo = "Teste tabuada";
		frame.criarTela();
		
		
		// TODO Auto-generated method stub

		Tabuada tabuada = new Tabuada();
		tabuada.multiplicando = 2;
		tabuada.minimoMultiplicador = 8;
		tabuada.maximoMultiplicador = 14;
		
		
		String[] resultado = tabuada.getTabuada();
		int contador=0;
		while (contador < resultado.length) {
			System.out.println(resultado[contador]);
			contador++;
			
		}
	}

	

}
