public class Impressora {

    private int totalPaginasImpressas = 0;
    private int autonomiaNominal;

    public void imprimirDocumento(Documento documento){
        if (this.getAutonomiaNominal() < documento.getNumeroDePaginas()){
            System.out.println("Erro! Não há tinta suficiente!");
        }
        else {
            this.totalPaginasImpressas += documento.getNumeroDePaginas();
        }
    }

    public int getTotalPaginasImpressas(){
        return this.totalPaginasImpressas;
    }

    public int getAutonomiaRestante(){
        return (this.getAutonomiaNominal()-this.getTotalPaginasImpressas());
    }

    public int getAutonomiaNominal(){
        return this.autonomiaNominal;
    }

    protected void efetuarImpressao(String string){

    }
}
