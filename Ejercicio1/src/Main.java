
public class Main {

    public static void main(String[] args) {

        Certificado c1 = new Certificado("DOC-001");
        ActaNotas a1 = new ActaNotas("Ingeniería en Software");
        HorarioAcademico h1 = new HorarioAcademico("2026-A");

        c1.imprimir();
        System.out.println();

        a1.imprimir();
        System.out.println();

        h1.imprimir();
    }
}
