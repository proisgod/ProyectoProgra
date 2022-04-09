/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

/**
 *
 * @author 50683
 */
public class Articulos {
   private int coca ;
    private int gingerel ;
    private int papas_fritas ;
    private int pasta;
    private int nachos ;
    private int ensalada;
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
