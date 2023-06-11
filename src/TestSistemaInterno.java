public class TestSistemaInterno {
    public static void main(String[] args) {
        SistemaInterno sistema = new SistemaInterno();
        Gerente gerente = new Gerente();
        Administrador administrador = new Administrador();

        gerente.setClave("AluraCursosOnLine");
        administrador.setClave("AluraCursosOnLine");

        sistema.autenticar(gerente);
        sistema.autenticar(administrador);
    }
}
