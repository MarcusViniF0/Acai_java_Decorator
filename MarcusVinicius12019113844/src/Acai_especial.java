
public class Acai_especial extends Tipo_acai{
	
	public Acai_especial() {
		
	}
	
	public Acai_especial(Tipo_acai outroTipo_acai) {
		super(outroTipo_acai);
		
	}
	@Override
	protected double calculavalor(Acai acai) {
		System.out.println("valor dos adicionais do Açai:");
		return 0;
	}

	@Override
	protected String nome(Acai acai) {
		
		return "\nAcai especial";
	}
	

}
