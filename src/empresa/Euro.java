package empresa;

public class Euro extends Moeda{
	

	public Euro(double valor) {
		super(valor);
		// TODO Auto-generated constructor stub
	}
	
	// Método responsável pela conversão para Real
	@Override
	public double converter() {
		double cotacao = 6.21;
		return valor * cotacao;
		
	}

	@Override
	public String toString() {
		return "Euro [valor: €" + valor + "]";
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
