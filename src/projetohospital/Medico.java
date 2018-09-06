
package projetohospital;


public class Medico extends Pessoa{
    //variables
    private String especialidades;
    private Integer crm;
    private String senhaMedico;
    private Double salario;
    
    //abstract method
    @Override
    public boolean logar(String senha){
        boolean op;
        
        if (senha.equals(this.senhaMedico)){
            op = true;
        }else{
            op = false;
        }
        
        return op;
    }
    
    //methods get and set
    public String getEspecialidades(){
        return this.especialidades;
    }
    public void setEspecialidades(String especialidades){
        this.especialidades = especialidades;
    }
    
    //in astah this method means "String" but its "Integer" method
    public String getCrm(){
        return this.crm;
    }
    
}
