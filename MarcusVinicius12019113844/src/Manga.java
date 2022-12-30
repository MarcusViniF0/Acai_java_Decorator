
public class Manga extends Tipo_acai{
	
	Manga(Tipo_acai outroTipo_acai) {
		super(outroTipo_acai);
	}
	Manga() {
		
	}
	@Override
	protected double calculavalor(Acai acai) {
		
		return 1.80+calcula(acai);
	}

	@Override
	protected String nome(Acai acai) {
		
		return "\nManga";
	}
	
}
