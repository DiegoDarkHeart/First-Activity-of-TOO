
package projetohospital;


public class Medico extends Pessoa{
    //variables
    private String especialidades;
    private Integer crm;
    private String senhaMedico;
    private Double salario;
    
    //abstract method
    @Override
    public boolean logar(String senha) {
        boolean op;

        if (this.senhaMedico != "") {
            if (senha.equals(this.senhaMedico)) {
                op = true;
            } else {
                op = false;
            }

            return op;
        } else {
            op = false;
            return op;
        }
    }

    //methods get and set
    public String getEspecialidades() {
        return this.especialidades;
    }

    public void setEspecialidades(String especialidades) {
        this.especialidades = especialidades;
    }

    //in astah this method means "String" but its "Integer" method
    public Integer /*String*/ getCrm() {
        return this.crm;
    }

    public void setCrm(Integer crm) {
        this.crm = crm;
    }

    public String getSenhaMedico() {
        return senhaMedico;
    }

    public void setSenhaMedico(String senhaMedico) {
        this.senhaMedico = senhaMedico;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

}
