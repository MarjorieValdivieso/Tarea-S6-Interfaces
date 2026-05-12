public class Cajero implements  Autenticable,Gestionable{
    @Override
    public boolean iniciarSesion(String usuario, String clave){
        return usuario.equals("cajero")&& clave.equals("12345");
    }
    @Override
    public void gestionarDatos(){
        System.out.println("El cajero esta gestionando pagos");
    }
}
