
public class Certificado implements Imprimible {

    private String numeroDocumento;

    public Certificado(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimiendo certificado académico.");
        System.out.println("Número de documento: " + numeroDocumento);
    }
}