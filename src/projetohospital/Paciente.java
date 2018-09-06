
package projetohospital;


public class Paciente extends Pessoa{

    //variables
    private Integer codPaciente;
    private String senhaPaciente;

    //abstract method
    @Override
    public boolean logar(String senha) {
        boolean op;
        
        if (senha.equals(this.senhaPaciente)){
            op = true;
        }else{
            op = false;
        }
        
        return op;
    }
    
    //methods get and set
    public Integer getCodPaciente(){
        return this.codPaciente;
    }
    public void setCodPaciente(Integer codPaciente){
        this.codPaciente = codPaciente;
    }
    
    public String getSenhaPaciente(){
        return this.senhaPaciente;
    }
    //in astah diagram says setSenha"Funcionario" 
    //but its senha"Paciente" 1 more poits
    public void setSenhaPaciente(String senhaPaciente){
        this.senhaPaciente = senhaPaciente;
    }
}
