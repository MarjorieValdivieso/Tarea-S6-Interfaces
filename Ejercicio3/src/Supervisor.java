public class Supervisor implements Autenticable, Reportable {

    @Override
    public boolean iniciarSesion(String usuario, String clave) {

        return usuario.equals("supervisor") && clave.equals("456");
    }

    @Override
    public void generarReporte() {

        System.out.println("El supervisor generó un reporte.");
    }
}