
public class Creme_de_ninho extends Tipo_acai{
	public Creme_de_ninho() {
		
	}
	public Creme_de_ninho(Tipo_acai outroTipo_acai) {
		super(outroTipo_acai);
	}
	@Override
	protected double calculavalor(Acai acai) {
		
		return 0;
	}
	@Override
	protected String nome(Acai acai) {
		
		return " \nCreme de ninho ";
	}
	
	
}
