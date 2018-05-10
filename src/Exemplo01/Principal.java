package Exemplo01;

public class Principal {

	public static void main(String[] args) {
		//Instanciar objeto (Criar)
		Pessoa p1 = new Pessoa();
        p1.altura = 1.70;
        p1.idade = 20;
        p1.nome = "Andressa";
        p1.peso = 56;
        
        Pessoa p2 = new Pessoa();
        p2.altura = 1.81;
        p2.idade = 27;
        p2.nome = "Ricardo";
        p2.peso = 79;
        
        //Chamar metodos
        p1.apresentacao();
        p1.verificarIdade();
        p1.calculoIMC();
	}

}
