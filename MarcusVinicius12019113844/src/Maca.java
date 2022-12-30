
public class Maca extends Tipo_acai{
	Maca(Tipo_acai outroTipo_acai){
		super(outroTipo_acai);
	}
	Maca(){
		
	}
	@Override
	protected double calculavalor(Acai acai) {
		
		return 1.30+calcula(acai);
	}
	@Override
	protected String nome(Acai acai) {
		
		return " \nMaça";
	}
}
