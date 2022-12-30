
public class Morango extends Tipo_acai{
    Morango(Tipo_acai outroTipo_acai) {
		super(outroTipo_acai);
	}
    Morango(){
    	
    }
	@Override
	protected double calculavalor(Acai acai) {
		
		return 2.50+calcula(acai);
	}

	@Override
	protected String nome(Acai acai) {
		
		return " \nMorango ";
	}

}
