public class PagoTarjeta implements Pagable{
    @Override
    public void procesarPago(double monto){
        if(monto>0){
            double comision= monto*0.05;
            double total= monto+comision;
            System.out.println("Monto"+monto);
            System.out.println("Comision"+comision);
            System.out.println("Total: "+total);

        }else{
            System.out.println("El monto debe ser mayor a cero");
        }
    }
}
