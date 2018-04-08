
public class Teste {

	public static void main(String[] args) {
		//Questão 01
		Empresa empresaA = new Empresa("3214560001/1-00", "VaiTur", "0800 333 0505");
		Onibus onibusA = new Onibus(empresaA, 001,"Donnie Darko");
		
		System.out.println(onibusA.getKmRodados());
		onibusA.setKmRodados(333);
		onibusA.addPessoas(77);
		onibusA.addPessoas(30);
		System.out.println("\n"+ onibusA.getQntdPessoas());
		onibusA.removePessoas();
		System.out.println("\n"+ onibusA.getQntdPessoas());
		System.out.println("\n"+ onibusA.getNomeMotorista());
		onibusA.setNomeMotorista("Palmirinha");
		System.out.println("\n"+ onibusA.getNomeMotorista());
		
		// Questão 02
		
		Empresa empresaB = new Empresa("3214560001/1-33", "Lojinha", "31 32156688");
		Funcionario func1 = new Funcionario(01,"Dirceu Lopes", 3000);
		Cliente consu1 = new Cliente("Xuxa", "31 998995566", "000222555-99", 800, empresaB);
		Produto item1 = new Produto(1,"copo",7);
		Produto item2 = new Produto(2,"prato",7);
		Produto item3 = new Produto(3,"shampoo",7);
		Produto item4 = new Produto(4,"caderno",7);
		Produto item5 = new Produto(5,"mouse",7);
		Produto item6 = new Produto(6,"lápis",7);
		Venda venda = new Venda(func1,consu1,01);
		venda.addProduto(item1);
		venda.addProduto(item2);
		venda.addProduto(item3);
		venda.addProduto(item4);
		System.out.println(venda.getValorTotal());
		venda.addProduto(item5);
		venda.addProduto(item6);
		System.out.println(venda.getValorTotal());
	}

}

