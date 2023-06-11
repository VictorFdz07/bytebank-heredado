
public class Gerente extends Funcionario {
	
	private String clave;
	
	public void setClave(String clave) {
		this.clave = clave;
	}
	
	public String getClave() {
		return clave;
	}
	
	public boolean iniciarSesion(String clave) {
		return clave == "AluraCursosOnLine";
	}
	
	//Sibre-escritura de metodo
	public double getBonificacion() {
		return super.getSalario() + super.getBonificacion();
	}
}
