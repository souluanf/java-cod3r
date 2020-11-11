package oo.heranca;

public class Heroi extends Jogador {
	
	public Heroi(int x, int y) {
		super(x, y);
	}

	@Override
	public boolean atacar(Jogador oponente) {
		boolean atq1 = super.atacar(oponente);
		boolean atq2 = super.atacar(oponente);
		boolean atq3 = super.atacar(oponente);
		return atq1 || atq2 || atq3;
	}
	
	// Quando há sobreescrita, deve-se manter ou aumentar a visibilidade.
	@Override
	public boolean andar(Direcao direcao) {
		return super.andar(direcao);
	}
}
