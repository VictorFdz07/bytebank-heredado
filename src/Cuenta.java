public abstract class Cuenta {
	
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular = new Cliente();
	
	private static int total = 0;
	
	public Cuenta(int agencia, int numero) {
		if (agencia <= 0) {
			System.out.println("No se permite 0");
			this.agencia = 1;
		}else {
			this.agencia = agencia;
			this.numero = numero;
		}
		total++;
		
		System.out.println("Se van creando: "+ total + " cuentas");
	}
	
	//No retorna valor
	public abstract void depositar(double valor);
	
	//Retorna valor
	public void retirar(double valor) throws SaldoInsuficienteException {
		if (this.saldo < valor){
			throw new SaldoInsuficienteException("No tienes saldo");
		}
		this.saldo -= valor;

	}
	
	public boolean transferir(double valor, Cuenta cuenta){
		if(this.saldo >= valor) {
			try {
				this.retirar(valor);
			} catch (SaldoInsuficienteException e) {
				e.printStackTrace();
			}
			cuenta.depositar(valor);
			return true;
		}
		return false;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public static int getTotal() {
		return total;
	}
}