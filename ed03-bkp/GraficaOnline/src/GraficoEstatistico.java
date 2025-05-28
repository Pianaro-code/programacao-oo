public class GraficoEstatistico implements Imprimivel{
    private String titulo;
    private String tipoGrafico;

    public GraficoEstatistico(String titulo, String tipoGrafico){
        this.titulo = titulo;
        this.tipoGrafico = tipoGrafico;
    }
    @Override
    public void imprimir(){
        System.out.println("Tipo de Gráfico: "+ tipoGrafico.toUpperCase());
        System.out.println("Título: "+ titulo.toUpperCase());
        System.out.println();
    }
}
