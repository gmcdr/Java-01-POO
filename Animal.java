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
public class Animal {
    private String nome;
    private Integer idade;
    private Boolean doente;
    
    public Animal(){    
    }

    public Animal(String nome, Integer idade, Boolean doente) {
        this.nome = nome;
        this.idade = idade;
        this.doente = doente;
    }
    
    

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the idade
     */
    public Integer getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    /**
     * @return the doente
     */
    public Boolean getDoente() {
        return doente;
    }

    /**
     * @param doente the doente to set
     */
    public void setDoente(Boolean doente) {
        this.doente = doente;
    }
    
    
   public String dorme(){
       return "Dormindo...";
   }
   
   public String fazBarulho(){
    return "Fazendo Barulho...";
   }
   
   public String procurarComida(){
       return "Procurando...";
   }
}


