package Questao1;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class TabelaFipe {

	public static void main(String[] args) {
		ArrayList<String>ArrayTabelaFipe = new ArrayList<>();
		ArrayTabelaFipe.add("");
		String marca,modelo;
		float valor,media = 0;
		int ano,op = 0, qtde = 0, anos =0;
		
		while(op != 4) {
			
		op = Integer.parseInt(JOptionPane.showInputDialog("Digite a Opção desejada:\n<1>Cadastrar Carro;\n<2>Listagem Geral;\n<3>Mostrar Resultados;\n<4>Sair;"));
		
		switch(op) {		
		case 1:
			marca = JOptionPane.showInputDialog("Digite a Marca do Veículo:");
			modelo = JOptionPane.showInputDialog("Digite o Modelo do Veículo:");
			valor = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do Veículo:"));
			ano = Integer.parseInt(JOptionPane.showInputDialog("Digite ano do Veículo:"));
			ArrayTabelaFipe.add(marca + " - " +  modelo + " - "+  ano +" - R$" + valor + "\n");
			anos += ano;
			if(valor>50000) {
				qtde++;
			}
			break;
			
		case 2: 
				String dados = null;
				for(int i = 0; i < ArrayTabelaFipe.size()-1; i++) {					
					dados = ArrayTabelaFipe.get(i) + ArrayTabelaFipe.get(i + 1);
				}
				JOptionPane.showMessageDialog(null, dados);			
			break;
			
		case 3:
			media = anos/(ArrayTabelaFipe.size()-1);
			JOptionPane.showMessageDialog(null, "A quantidade de Veiculos acima de 50.000 e : " + qtde + "\nA media dos anos e: " + media);
			
			break;
			
		default:
			
			op = Integer.parseInt(JOptionPane.showInputDialog("OPÇÃO INVÁLIDA!\n Digite uma opção válida:\n<1>Cadastrar Carro;\n<2>Listagem Geral;\n<3>Mostrar Resultados;\n<4>Sair;"));				
			
		}
		
		}

	}

}
