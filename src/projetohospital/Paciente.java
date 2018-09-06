
package projetohospital;


public class Paciente {

    //variables
    private Integer codPaciente;
    private String senhaPaciente;

    //abstract method
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
    public void setSenhaPaciente(String senhaPaciente){
        this.senhaPaciente = senhaPaciente;
    }
}
