package exemplo02;

import javax.swing.JOptionPane;

public class Aluno {
	
	//Atributos
	String nome;
	double nota1 ,nota2, nota3;
	
	//Obter os dados do aluno
	public void ObterDados() {
		
		nome = JOptionPane.showInputDialog( "Bom dia!\nQual � o seu nome?");
		
		nota1 = Double.parseDouble(JOptionPane.showInputDialog("informe a 1� nota"));
		nota1 = Double.parseDouble(JOptionPane.showInputDialog("informe a 2� nota"));
		nota1 = Double.parseDouble(JOptionPane.showInputDialog("informe a 3 nota"));
	}
		//Realizar m�dia 
		public double calcularMedia() {
			
			double media= (nota1+nota2+nota3)/3;
			
			return media;
		}
		
		//Onter a condi��o
		public String condicao() {
			String condicao = calcularMedia() >= 7 ? "Aprovado" : "Reprovado";
			
			return condicao;
		}
        //Exibir informa��es do aluno
		public void informacoes()  {
		
		JOptionPane.showMessageDialog(null, "O aluno "+nome+" obteve m�dia:" +calcularMedia()+"e sua condi��o �:"+condicao());
}
       //Metodo de repeticao
		public void laco() {
			
			//Continuar
			int continuar = 0;
			
			//La�o
			do {
				ObterDados();
				informacoes();
				
				continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?","",0);
				
			}while(continuar == 0);
			}
		}
	
