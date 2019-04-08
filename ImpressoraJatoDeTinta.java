public class ImpressoraJatoDeTinta extends Impressora {

    private final int autonomiaNominal;

    public ImpressoraJatoDeTinta(int autonomiaNominal){
        this.autonomiaNominal = autonomiaNominal;
    }

    @Override
    protected void efetuarImpressao(String string){
        System.out.println("Imprimindo com Jato de Tinta");
    }

    @Override
    public int getAutonomiaNominal(){
        return this.autonomiaNominal;
    }
}
