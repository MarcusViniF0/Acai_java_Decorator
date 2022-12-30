
public class Creme_De_Pupuacu extends Tipo_acai{
	Creme_De_Pupuacu(Tipo_acai outroTipo_acai) {
		super(outroTipo_acai);
	}
	Creme_De_Pupuacu(){
		
	}
	
	@Override
	protected double calculavalor(Acai acai) {
		
		return 1500+calcula(acai);
	}
	@Override
	protected String nome(Acai acai) {
		
		return "\nCreme de pupuaçu";
	}

}
