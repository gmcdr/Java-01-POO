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
public class Canino extends Animal {
    private String latir = "Auauauau";

   public Canino(String nome, Integer idade, Boolean doente) {
        super(nome, idade, doente);
    }
    
    public String latir(){
        return latir;
    }

    public String getLatir() {
        return latir;
    }

    public void setLatir(String latir) {
        this.latir = latir;
    }
}
