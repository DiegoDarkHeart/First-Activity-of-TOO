
package projetohospital;

/**
 *
 * @author Diego
 */
public abstract class Pessoa {
    
    //variables
    private String nome;
    private String sobreNome;
    private String cpf;
    private String rg;
    
    //methods get and set
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getSobreNome(){
        return this.sobreNome;
    }
    public void setSobreNome(String sobreNome){
        this.sobreNome = sobreNome;
    }
    
    public String getCpf(){
        return this.cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    public String getRg(){
        return this.rg;
    }
    public void setRG(String rg){
        this.rg = rg;
    }
    
    //abstract method
    public abstract boolean logar(String senha);
}
