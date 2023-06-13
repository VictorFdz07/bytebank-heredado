public class TestCuentaExceptionSaldo {
    public static void main(String[] args) {
        Cuenta cuenta = new CuentaAhorros(235,453);

        cuenta.depositar(210);
        try {
            cuenta.retirar(210);
        } catch (SaldoInsuficienteException e) {
            e.printStackTrace();
        }
    }
}
