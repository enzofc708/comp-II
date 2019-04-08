public class ImpressoraLaser extends Impressora {

    private final int autonomiaNominal = 10000;

    @Override
    protected void efetuarImpressao(String string){
        System.out.println("Imprimindo com Laser");
    }

    @Override
    public int getAutonomiaNominal(){
        return this.autonomiaNominal;
    }
}
