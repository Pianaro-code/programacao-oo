public class ProgramaImpressao {
    public static void main(String[] args) {

        DocumentoTexto doc = new DocumentoTexto("Documento de Apresentação","Este e o conteudo do documeto.");
        ImagemDigital img = new ImagemDigital("paisagem.png", "1920x1000");
        GraficoEstatistico graf = new GraficoEstatistico("Distribuição de Vendas", "barra");
        RelatorioPDF rel = new RelatorioPDF("João Silva", 12);

        doc.imprimir();
        img.imprimir();
        graf.imprimir();
        rel.imprimir();
    }
}