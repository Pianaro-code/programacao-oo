public class ImagemDigital implements Imprimivel{
    private String nomeArquivo;
    private String resolucao;

    public ImagemDigital(String nomeArquivo,String resolcao){
        this.nomeArquivo = nomeArquivo;
        this.resolucao = resolcao;
    }

    @Override
    public void imprimir(){
        System.out.println("Arquivo: "+ nomeArquivo);
        System.out.println("Resolcao: "+ resolucao);
        System.out.println();
    }
}
