package projetohospital;

import javax.swing.JOptionPane;

public class ProjetoHospital {

    public static void main(String[] args) {
        //
        Paciente fernando = new Paciente();
        Enfermeiro rogerio = new Enfermeiro();
        Medico palomares = new Medico();

        fernando.setCodPaciente(01);
        fernando.setCpf("117031006553");
        fernando.setNome("Fernando");
        fernando.setRG("11231424000");
        fernando.setSenhaPaciente("1234");
        fernando.setSobreNome("Costas");

        rogerio.setCorem(02);
        rogerio.setCpf("1231441245000");
        rogerio.setNome("Rogerio");
        rogerio.setRG("112231312300");
        rogerio.setSalario(4000.00);
        rogerio.setSenhaEnfermeiro("12345");

        palomares.setCpf("123582849000");
        palomares.setCrm(03);
        palomares.setEspecialidades("Odontologia");
        palomares.setNome("Palomares");
        palomares.setRG("12555256335");
        palomares.setSalario(2500.50);
        palomares.setSenhaMedico("123456");
        palomares.setSobreNome("Ribeira");

        int oP = Integer.parseInt(JOptionPane.showInputDialog("insira a opção de login.:\n1.login Paciente\n2.login Enfermeiro\n3.login Médico"));

        switch (oP) {
            case 1:
                if (fernando.logar(JOptionPane.showInputDialog("insira a senha do paciente"))) {
                    System.out.println("entrada autorizada!\nCodigo paciente.: " + fernando.getCodPaciente() + "\n" + fernando.getNome() + " " + fernando.getSobreNome() + "\n" + fernando.getRg() + "\n" + fernando.getCpf());
                } else {
                    System.out.println("Erro Senha invalida!");
                }
                break;
            case 2: 
                if (rogerio.logar(JOptionPane.showInputDialog("insira sua senha Enfermeiro.:"))){
                    System.out.println("entrada autorizada!");
                }else{
                    System.out.println("Erro Senha invalida!");
                }
                break;
            case 3:
                if (palomares.logar(JOptionPane.showInputDialog("inserir senha Medica"))){
                    
                }
        }

    }
}
