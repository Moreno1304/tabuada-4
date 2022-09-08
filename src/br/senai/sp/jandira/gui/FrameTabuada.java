package br.senai.sp.jandira.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import br.senai.sp.jandira.model.Tabuada;

public class FrameTabuada {

	public String titulo;
	public int altura;
	public int largura;
	public Color corDeFundoDaTela;
	public Font fonteDosLabels;
	public Color corDoTextoDoBotao;
	public Color corDoBotao;
	

	public void criarTela() {

		JFrame tela = new JFrame();
		tela.setTitle(titulo);
		tela.setSize(largura, altura);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);

		// Pegar o container para colocar componentes dentro dele
		Container painel = tela.getContentPane();
		painel.setBackground(corDeFundoDaTela);
		painel.setBackground(Color.RED);
		
		ImageIcon BILL = new ImageIcon(getClass().getResource("manchester-united.png"));
		JLabel icon = new JLabel(BILL);
		icon.setBounds(10, 8, 30, 20);
		

		// Criar os componentes que serão colocados no container(painel)
		JLabel labelTabuada = new JLabel();
		labelTabuada.setText("Bora Bill!!");
		labelTabuada.setBounds(50, 0, 210, 30);
		labelTabuada.setFont(new Font("Courier new", Font.BOLD, 32));
		labelTabuada.setForeground( Color.BLACK);
		
		JLabel labelTexto = new JLabel();
		labelTexto.setText("A solução chegou, resolva o que precisar!!! ");
		labelTexto.setBounds(20,30, 900, 30);
		labelTexto.setFont(new Font("Courier new", Font.BOLD, 15));
		labelTexto.setForeground(Color.BLACK);
		
		JButton buttonCalcular = new JButton();
		buttonCalcular.setText("Calcular");
		buttonCalcular.setBounds(188, 220, 120, 30);
		buttonCalcular.setForeground(corDoTextoDoBotao);
		buttonCalcular.setBackground(corDoBotao);
		buttonCalcular.setBackground(Color.GREEN);
		buttonCalcular.setForeground(Color.PINK);
		
		JButton buttonLimpar = new JButton();
		buttonLimpar.setText("Limpar");
		buttonLimpar.setBounds(310, 220, 100, 30);
		buttonLimpar.setForeground(corDoTextoDoBotao);
		buttonLimpar.setBackground(corDoBotao);
		buttonLimpar.setForeground(Color.BLACK);
		buttonLimpar.setBackground(Color.GREEN);

		JLabel labelMultiplicando = new JLabel();
		labelMultiplicando.setText("Multiplicando:");
		labelMultiplicando.setBounds(120, 80, 200, 30);
		labelMultiplicando.setFont(fonteDosLabels);

		JTextField textFieldMultiplicando = new JTextField();
		textFieldMultiplicando.setBounds(200, 80, 200, 30);

		JLabel labelMinimoMultiplicador = new JLabel();
		labelMinimoMultiplicador.setText("Mínimo Multiplicador:");
		labelMinimoMultiplicador.setBounds(80, 125, 200, 30);
		labelMinimoMultiplicador.setFont(fonteDosLabels);

		JTextField textFieldMinimoMultiplicador = new JTextField();
		textFieldMinimoMultiplicador.setBounds(200, 125, 200, 30);

		JLabel labelMaximoMultiplicador = new JLabel();
		labelMaximoMultiplicador.setText("Máximo Multiplicador:");
		labelMaximoMultiplicador.setBounds(80, 170, 200, 35);
		labelMaximoMultiplicador.setFont(fonteDosLabels);

		JTextField textFieldMaximoMultiplicador = new JTextField();
		textFieldMaximoMultiplicador.setBounds(200, 170, 200, 30);
		
		JLabel labelResultadoTabuada = new JLabel();
		labelResultadoTabuada.setText("Resultados:");
		labelResultadoTabuada.setBounds(29, 315, 200, 30);
		labelResultadoTabuada.setFont(fonteDosLabels);
		
		
		JList<String> lista = new JList<String>();
		JScrollPane scroll = new JScrollPane(lista);
		
	
		scroll.setBounds(29, 350, 350, 200);
		
		//Eventos de click
		buttonCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Tabuada tabuada = new Tabuada();
				
			tabuada.multiplicando = Integer.parseInt(textFieldMultiplicando.getText());
			tabuada.minimoMultiplicador = Integer.parseInt(textFieldMinimoMultiplicador.getText());
			tabuada.maximoMultiplicador = Integer.parseInt(textFieldMaximoMultiplicador.getText());
			
			
			String[] resultado = tabuada.getTabuada();
			lista.setListData(resultado);
			
			scroll.setVisible(true);	
				
			}
		});
		
		buttonLimpar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				scroll.setVisible(false);
				
			}
		});
		
		buttonLimpar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				scroll.setVisible(false);
				
				textFieldMultiplicando.setText("");
				textFieldMinimoMultiplicador.setText("");
				textFieldMaximoMultiplicador.setText("");
				
			}
		});
		
		
		
		
		

		// Colocar os componentes no container
		painel.add(labelTabuada);
		painel.add(labelTexto);
		painel.add(labelMultiplicando);
		painel.add(textFieldMultiplicando);
		painel.add(labelMinimoMultiplicador);
		painel.add(textFieldMinimoMultiplicador);
		painel.add(labelMaximoMultiplicador);
		painel.add(textFieldMaximoMultiplicador);
		painel.add(buttonCalcular);
		painel.add(buttonLimpar);
		painel.add(labelResultadoTabuada);
		painel.add(scroll);
		painel.add(icon);
		
	
	
		tela.setVisible(true);

	}

}
