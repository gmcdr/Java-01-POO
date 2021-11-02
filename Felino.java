/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animal;

/**
 *
 * @author Meu Computador
 */
public class Felino  extends Animal{
    private String miar = "Miauuu";

    public Felino(String nome, Integer idade, Boolean doente) {
        super(nome, idade, doente);
    }

    public String getMiar() {
        return miar;
    }

    public void setMiar(String miar) {
        this.miar = miar;
    }
    
    public String miar(){
        return miar;
    }
    
}
