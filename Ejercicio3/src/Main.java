import java.util.Scanner;
public class Main {
    void main(){
        Scanner sc= new Scanner(System.in);
        System.out.println("====SISTEMA EMPRESARIAL===");
        System.out.println("1.Cajero");
        System.out.println("2.Administrador");
        System.out.println("3.Supervisor");
        System.out.println("Seleccione un rol: ");
        int opcion=sc.nextInt();
        sc.nextLine();
        System.out.print("Ingrese usuario");
        String usuario=sc.nextLine();
        System.out.println("Ingrese la clave");
        String clave=sc.nextLine();
        if(opcion==1){
            Cajero c= new Cajero();
            if (c.iniciarSesion(usuario,clave)){
                System.out.println("Inicio de sesion correcto");
                c.gestionarDatos();
            }else {
                System.out.println("Usuario o clave incorrectos");
            }
        }else if(opcion==2){
            Administrador a=new Administrador();
            if (a.iniciarSesion(usuario,clave)){
                System.out.println("Inicio de sesion correcto");
                a.gestionarDatos();
                a.generarReporte();
            }else{
                System.out.println("usuario o clave incorrectos");
            }
        }else if(opcion==3){
            Supervisor s= new Supervisor();
            if (s.iniciarSesion(usuario,clave)){
                System.out.println("Inicio de sesion correcto");
                s.generarReporte();
            }else{
                System.out.println("Usuario o clave incorrecta");
            }
        }else{
            System.out.println("Opcion invalida");
        }
        sc.close();
    }
}

