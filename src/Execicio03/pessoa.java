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
    double quantidade = 0;
    double altura = 0;
    double alturaMaior = 0;
    double nomeMaiorAltura = 0;
    double media = 0;
    double mediaAltura =0;
    
       
    //Laço
    public void laco() {
        
        do{
        	obterDados();
        	 nomeIdadeMaior();
        	 nomePesoMaior();
        	 nomeAlturaMaior();
        	 Obtermedia();
        	 
       
         
        
    

} while(!nome.equals("SAIR"));{
    quantidade++;
}
    }
      //Obter Dados
        public void obterDados () {
        
        		//variavel para validar dados
        		boolean valida;
        		//perguntar nome 
                nome = JOptionPane.showInputDialog("Informe seu nome ou SAIR para finalizar");
        	} 		
        		
        		//Obter idade 
        		public void nomeIdadeMaior() {
                idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade." ));
                     if(idade > idadeMaior){
                     idadeMaior = idade;
                     nomeIdadeMaior = nome;
                     }
                     }
               //Obter peso
                     public void nomePesoMaior() {
                peso = Double.parseDouble(JOptionPane.showInputDialog("Informe o seu peso."));
                     if(peso > pesoMaior){
                     pesoMaior = peso; 
                     nomePesoMaior = nome;
                     }
                     }
                   //Obter maior altura
                     public void  nomeAlturaMaior() { 
                   altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a sua altura."));
                   if(altura > alturaMaior){
                	   alturaMaior = altura;
                	    nomeMaior = nome;
                   }
                     }  
                	  //Obter média das alturas
                        public void Obtermedia(){
                    double media = (altura + mediaAltura)/quantidade;

                        

                	
                 //perguntar nome 
                   nome = JOptionPane.showInputDialog("Informe seu nome ou SAIR para finalizar");
        
            
            JOptionPane.showMessageDialog(null,"O Nome do jogador maios alto é: "+nomeMaior+" e sua altura é de "+alturaMaior+" ");
        JOptionPane.showMessageDialog(null,"O nome do jogador mais velho é: "+nomeIdadeMaior+" e sua idade é de  "+idadeMaior+" ");
        JOptionPane.showMessageDialog(null,"O nome do jogador mais pesado é: "+nomePesoMaior+" e sua peso é de   "+pesoMaior+" ");
        

    }
        
}


            
    

                 



