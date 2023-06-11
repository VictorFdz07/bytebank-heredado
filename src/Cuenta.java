class Cuenta {
	
	private double saldo;
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
	public void depositar(double valor){
		this.saldo += valor;
	}
	
	//Retorna valor
	public boolean retirar(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}
	
	public boolean transferir(double valor, Cuenta cuenta){
		if(retirar(valor)) {
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