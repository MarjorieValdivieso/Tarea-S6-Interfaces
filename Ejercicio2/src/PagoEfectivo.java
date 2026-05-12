public class PagoEfectivo implements Pagable{
    @Override
    public void procesarEfectivo(double monto){
        if (monto>0){
            System.out.println("Pago efectivo realizado");
            System.out.println("Monto $"+monto);

        }else{
            System.out.println("El monto debe ser mayor a cero");
        }
    }
}
