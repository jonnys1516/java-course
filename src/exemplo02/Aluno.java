package exemplo02;

import javax.swing.JOptionPane;

public class Aluno {
	
	//Atributos
	String nome;
	double nota1 ,nota2, nota3;
	
	//Obter os dados do aluno
	public void ObterDados() {
		
		nome = JOptionPane.showInputDialog( "Bom dia!\nQual é o seu nome?");
		
		nota1 = Double.parseDouble(JOptionPane.showInputDialog("informe a 1° nota"));
		nota1 = Double.parseDouble(JOptionPane.showInputDialog("informe a 2° nota"));
		nota1 = Double.parseDouble(JOptionPane.showInputDialog("informe a 3 nota"));
	}
		//Realizar média 
		public double calcularMedia() {
			
			double media= (nota1+nota2+nota3)/3;
			
			return media;
		}
		
		//Onter a condição
		public String condicao() {
			String condicao = calcularMedia() >= 7 ? "Aprovado" : "Reprovado";
			
			return condicao;
		}
        //Exibir informações do aluno
		public void informacoes()  {
		
		JOptionPane.showMessageDialog(null, "O aluno "+nome+" obteve média:" +calcularMedia()+"e sua condição é:"+condicao());
}
       //Metodo de repeticao
		public void laco() {
			
			//Continuar
			int continuar = 0;
			
			//Laço
			do {
				ObterDados();
				informacoes();
				
				continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?","",0);
				
			}while(continuar == 0);
			}
		}
	
