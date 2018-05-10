package Execicio03;

import javax.swing.JOptionPane;

public class pessoa {
	

	
	//Atributos
	String nome;
    String nomeMaior = "";
    String nomePesoMaior = "";
    int idade;
    int idadeMaior = 0;
    String nomeIdadeMaior = "";
    double peso;
    double pesoMaior = 0;
    int quantidade = 0;
    double altura = 0;
    double alturaMaior = 0;
    double nomeMaiorAltura = 0;
    double media = 0;
    double mediaAltura = 0;
  
    
    
    //perguntar nome
    public void laco() {
        nome = JOptionPane.showInputDialog("Qual o seu nome?");
    
       while(!nome.equals("SAIR")){
        quantidade++;
       }		
    
    }
    	
    		//Obter Dados
    	public void obterDados () {
    
    		//variável para validar
    		boolean valida;
    	  		
    		
    		//Obter idade 
            idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade." ));
                 if(idade > idadeMaior){
                 idadeMaior = idade;
                 nomeIdadeMaior = nome;

                 }
            peso = Double.parseDouble(JOptionPane.showInputDialog("Informe o seu peso."));
                 if(peso > pesoMaior){
                 pesoMaior = peso; 
                 nomePesoMaior = nome;
                 }   
               altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a sua altura."));
                 //Obter maior altura
                 if(altura > alturaMaior){
                 alturaMaior = altura; 
                 nomeMaior = nome; 
               //Obter média das alturas
                 if(media > mediaAltura){
                	 mediaAltura = media;
                	 
                 }
               
                 }               
            //perguntar nome 
            nome = JOptionPane.showInputDialog("Informe seu nome ou SAIR para finalizar");
               
    	
    	
        //Mostrar nome
        JOptionPane.showMessageDialog(null,"O Nome do jogador maios alto "+nomeMaior+" e  "+alturaMaior+" é de");
        JOptionPane.showMessageDialog(null,"O nome do jogador mais velho "+nomeIdadeMaior+" e  "+idadeMaior+" é de");
        JOptionPane.showMessageDialog(null,"O nome do jogador mais pesado "+nomePesoMaior+" e   "+pesoMaior+" é de");
    

    }
        
}
    


    





