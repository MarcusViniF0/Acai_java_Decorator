
public class Teste {

	public static void main(String[] args) {
		Acai acai=new Acai(35000);
		
		//sabores
		Tipo_acai acai1=new Acai_especial(); 
		Tipo_acai acai2=new Creme_de_ninho();
		Tipo_acai acai3=new Creme_De_Pupuacu();
		
		//nome sabores
		String nome1 = acai1.nome(acai);
		String nome2 = acai2.nome(acai);
		String nome3 = acai3.nome(acai);
		
		//nome dos adicionais
		Tipo_acai addNone1=new Maca();
		Tipo_acai addNone2=new Mirtilo();
		Tipo_acai addNone3=new Manga();
		Tipo_acai addNone4=new Morango();
		Tipo_acai addNone5=new Abacaxi();
		Tipo_acai completo=new Maca(new Mirtilo(new Manga(new Morango(new Abacaxi()))));
		
		//nome adicionais
		String nomeADD1 = addNone1.nome(acai);
		String nomeADD2= addNone2.nome(acai);
		String nomeADD3= addNone3.nome(acai);
		String nomeADD4= addNone4.nome(acai);
		String nomeADD5= addNone5.nome(acai);
		double nomeADD6= completo.calcula(acai);
		
		//adicionais
		Tipo_acai add1=new Maca();
		Tipo_acai add2=new Mirtilo();
		Tipo_acai add3=new Manga();
		Tipo_acai add4=new Morango();
		Tipo_acai add5=new Abacaxi();
		
		
		//precos adicionais
		double valor1 = add1.calculavalor(acai);
		double valor2 = add2.calculavalor(acai);
		double valor3 = add3.calculavalor(acai);
		double valor4 = add4.calculavalor(acai);
		double valor5 = add5.calculavalor(acai);
		double valor6= completo.calculavalor(acai);
		
		
		//exibindo sabores
		System.out.println("=====================================");
		System.out.println(nome1);
		System.out.println(nome2);
		System.out.println(nome3);
		System.out.println("=====================================");
		
		//exibindo valores de adicionais
		System.out.println("adicionar:"+addNone1+"\npreço:"+valor1);
		System.out.println("adicionar:"+addNone2+"\npreço:"+valor2);
		System.out.println("adicionar:"+addNone3+"\npreço:"+valor3);
		System.out.println("adicionar:"+addNone4+"\npreço:"+valor4);
		System.out.println("adicionar:"+addNone5+"\npreço:"+valor5);
		System.out.println("=====================================");
		System.out.println("todos os adicionais:\npreço:"+valor6);
		
		
	}

}
