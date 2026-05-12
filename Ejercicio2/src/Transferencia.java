public class Transferencia implements Pagable {
    @Override
    public void procesarPago(double monto){
        if(monto>0){
            double comision= monto*0.01;
            double total=comision+monto;
            System.out.println("monto"+monto);
            System.out.println("Comision"+comision);
            System.out.println("Total: "+total);
        }else{
            System.out.println("El monto debe de ser mayor a cero");
        }
    }

}
