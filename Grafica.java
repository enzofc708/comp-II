public class Grafica {
    private final float precoPorPagina;
    private final Impressora impressora;

    public Grafica(Impressora impressora, float precoPorPagina) {
        this.precoPorPagina = precoPorPagina;
        this.impressora = impressora;
    }

    public float orcarImpressao(Documento doc){
        return(doc.getNumeroDePaginas()*this.precoPorPagina);
    }

    public String imprimirDocumento(Documento doc){
        impressora.imprimirDocumento(doc);
        return ("Valor da Impressão: " + this.orcarImpressao(doc));

    }

}
