package Questao09;

public class Agua extends SubstanciaPura {

	@Override
	void entrarPontoDeFusao() {
		this.pontoFusao = 0;

	}

	@Override
	void entrarPontoDeEbulicao() {
		this.pontoEbulicao = 100;

	}

}
