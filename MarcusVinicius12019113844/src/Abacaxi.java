
public class Abacaxi extends Tipo_acai{
	Abacaxi(Tipo_acai outroTipo_acai) {
		super(outroTipo_acai);
	}
	Abacaxi(){
		
	}
	@Override
	protected double calculavalor(Acai acai) {
		
		return 1.30+calcula(acai);
	}
	@Override
	protected String nome(Acai acai) {
		
		return " \nAbacaxi ";
	}
}
