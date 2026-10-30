public class Trapecio extends Figura {
    private int baseMayor, baseMenor;
    public Trapecio(String tipo, int baseMayor, int baseMenor){
        super(tipo);
        this.setbaseMayor(baseMayor);
        this.setbaseMenor(baseMenor);
    }
    public void setbaseMayor(int baseMayor){
        this.baseMayor = baseMayor;
    }

}
