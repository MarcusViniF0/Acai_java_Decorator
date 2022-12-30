
public abstract class Tipo_acai {
	
	protected Tipo_acai outroTipo_acai;
	
	public Tipo_acai(Tipo_acai OutroTipo_acai) {
		outroTipo_acai=OutroTipo_acai;
		
	}
	
	public Tipo_acai() {
		
	}
	
	protected abstract double calculavalor(Acai acai);
	protected abstract String nome(Acai acai);
	protected double calcula(Acai acai) {
		if(outroTipo_acai==null)
			return 0;
		else
			return outroTipo_acai.calculavalor(acai);
	}
	
}
