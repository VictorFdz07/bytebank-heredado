
public class Gerente extends  Funcionario implements Autenticable {
	//Sibre-escritura de metodo
	private AutenticacionUtil util;

	public Gerente (){
		this.util = new AutenticacionUtil();
	}
	public double getBonificacion() {
		return super.getSalario() + this.getSalario()*0.05;
	}

	@Override
	public void setClave(String clave) {
		this.util.setClave(clave);
	}

	@Override
	public boolean iniciarSesion(String clave) {
		return this.util.iniciarSesion(clave);
	}
}
