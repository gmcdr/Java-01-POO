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
public class App {
    public static void main(String[] args) {
        
        Cachorro cachorro = new Cachorro("Mauricio",38,false);
        
        System.out.println(cachorro.getNome());
        System.out.println(cachorro.getIdade());
        System.out.println(cachorro.getDoente());
        
    }
}
