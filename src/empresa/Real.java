package empresa;

public class Real extends Moeda {

	public Real(double valor) {
		super(valor);
		// TODO Auto-generated constructor stub
	}

	// A moeda já está em real, retorna o valor em real.
	@Override
	public double converter() {
		return valor;				
	}

	@Override
	public String toString() {
		return "Real [valor: R$" + valor + "]";
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}	

}
