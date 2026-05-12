import javax.swing.plaf.PanelUI;

public class HorarioAcademico implements Imprimible{
   private String periodoAcademico;
   public HorarioAcademico(String periodoAcademico){
       this.periodoAcademico=periodoAcademico;
   }
   @Override
    public void imprimir(){
       System.out.println("Imprimiendo horario academico");
       System.out.println("Periodo academico: "+periodoAcademico);
   }
}
