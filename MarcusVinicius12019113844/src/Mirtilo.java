
public class Mirtilo extends Tipo_acai{
	public Mirtilo(Tipo_acai outroTipo_acai) {
		super(outroTipo_acai);
	}
	public Mirtilo() {
		
	}
	@Override
	protected double calculavalor(Acai acai) {
		
		return 2.50+calcula(acai);
	}

	@Override
	protected String nome(Acai acai) {
		
		return " \nMirtilo ";
	}

}
