package Data;

public class Articulos {
    private int coca = 1000;
    private int gingerel = 1000;
    private int papas_fritas =2000 ;
    private int pasta =5000;
    private int nachos =3500 ;
    private int ensalada= 1500;
    Bebidas_Naturales miBebidaN;
    Sabor_pizza miPizza;

//    public Articulos(int coca, int gingerel, int papas_fritas, int pasta, int nachos, int ensalada) {
//        this.coca = coca;
//        this.gingerel = gingerel;
//        this.papas_fritas = papas_fritas;
//        this.pasta = pasta;
//        this.nachos = nachos;
//        this.ensalada = ensalada;
//        this.miBebidaN = new Bebidas_Naturales();
//        this.miPizza = new Sabor_pizza();
//    }

    public Articulos() {
        this.miBebidaN=new Bebidas_Naturales();
        this.miPizza = new Sabor_pizza();
    }

    public int getCoca() {
        return coca;
    }

    public int getGingerel() {
        return gingerel;
    }

    public int getPapas_fritas() {
        return papas_fritas;
    }

    public int getPasta() {
        return pasta;
    }

    public int getNachos() {
        return nachos;
    }

    public int getEnsalada() {
        return ensalada;
    }

    public void setCoca(int coca) {
        this.coca = coca;
    }

    public void setGingerel(int gingerel) {
        this.gingerel = gingerel;
    }

    public void setPapas_fritas(int papas_fritas) {
        this.papas_fritas = papas_fritas;
    }

    public void setPasta(int pasta) {
        this.pasta = pasta;
    }

    public void setNachos(int nachos) {
        this.nachos = nachos;
    }

    public void setEnsalada(int ensalada) {
        this.ensalada = ensalada;
    }
}
