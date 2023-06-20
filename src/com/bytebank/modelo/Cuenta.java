package com.bytebank.modelo;

/**
 * Cuenta va a crear nuevas intancias de CuentaCorriente
 *
 * @version 1.0
 * @author victorfernandez
 */
public abstract class Cuenta implements Comparable<Cuenta>{
	
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular = new Cliente();
	
	private static int total = 0;

	/**
	 * Instancia una nueva cuenta sin parametros
	 */
	public Cuenta (){

	}

	/**
	 * Instancia una cuenta usando agencia y numero
	 * @param agencia
	 * @param numero
	 */
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

	/**
	 * Este metodo retira dinero de la cuenta y si ocurre un error
	 * devuelve una exception
	 * @param valor
	 * @throws SaldoInsuficienteException
	 */
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

	@Override
	public String toString() {
		return  "saldo=" + this.saldo +
				", agencia=" + this.agencia +
				", numero=" + this.numero +
				", titular="+ this.titular.getNombre();
	}

	@Override
	public boolean equals(Object obj) {
		//Basada en valores
		Cuenta cuenta = (Cuenta) obj;
		return this.agencia == cuenta.getAgencia() &&
				this.numero == cuenta.getNumero();
	}

	@Override
	public int compareTo(Cuenta o) {
		//Orden natural: Numero Agencia
		//return Integer.compare(this.agencia, o.getAgencia());
		//Orden natural: Saldo
		return Double.compare(this.getSaldo(), o.getSaldo());
	}
}