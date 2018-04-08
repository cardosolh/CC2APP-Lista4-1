
public class Teste {

	public static void main(String[] args) {
		//Questão 01
		Empresa empresaA = new Empresa("3214560001/1-00", "VaiTur", "31 0800 333 0505");
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
		
		
	}

}

