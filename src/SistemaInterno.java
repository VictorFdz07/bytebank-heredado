public class SistemaInterno {

    private String clave = "AluraCursosOnLine";

    public boolean autenticar(Autenticable funcionario){
        boolean puedeIniciarSesion = funcionario.iniciarSesion(clave);
        if (puedeIniciarSesion) {
            System.out.println("Login exitoso");
            return true;
        } else {
            System.out.println("Error en login");
            return false;
        }
    }
}
