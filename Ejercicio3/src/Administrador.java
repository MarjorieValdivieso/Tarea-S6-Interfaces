public class Administrador implements Autenticable, Reportable, Gestionable {

    @Override
    public boolean iniciarSesion(String usuario, String clave) {

        return usuario.equals("admin") && clave.equals("admin123");
    }

    @Override
    public void generarReporte() {

        System.out.println("El administrador generó un reporte.");
    }

    @Override
    public void gestionarDatos() {

        System.out.println("El administrador está gestionando datos.");
    }
}
