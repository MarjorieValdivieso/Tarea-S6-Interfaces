public class Main {
    void main(){
        PagoTarjeta pt= new PagoTarjeta();
        PagoEfectivo pe=new PagoEfectivo();
        Transferencia t = new Transferencia();
        pt.procesarPago(100);
        pe.procesarPago(500);
        t.procesarPago(450);
    }
}
