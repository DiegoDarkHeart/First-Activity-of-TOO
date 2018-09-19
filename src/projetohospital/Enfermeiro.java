
package projetohospital;


public class Enfermeiro extends Pessoa{
    Integer corem;
    double salario;
    String senhaEnfermeiro;
    
    @Override
    public boolean logar(String senha){
        boolean op;
        
        if(this.senhaEnfermeiro != ""){
            if(this.senhaEnfermeiro.equals(senha)){
                op = true;
            }else{
                op = false;
            }
        }else{
            op = false;
        }
        return op;
    }

    public Integer getCorem() {
        return corem;
    }

    public void setCorem(Integer corem) {
        this.corem = corem;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getSenhaEnfermeiro() {
        return senhaEnfermeiro;
    }

    public void setSenhaEnfermeiro(String senhaEnfermeiro) {
        this.senhaEnfermeiro = senhaEnfermeiro;
    }
}
