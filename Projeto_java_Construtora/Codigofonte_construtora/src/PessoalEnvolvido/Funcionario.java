package PessoalEnvolvido;

import javax.swing.JOptionPane;

public class Funcionario extends Pessoa {
    private String matricula;
    private double salario;

    public Funcionario(String nome, String cpf , String telefone , String endereco,String matricula, double salario){
        this.matricula = matricula;
        this.salario = salario;
        super(nome,cpf,telefone,endereco);
    }
    public Funcionario(String nome, String matricula,double salario){
        this.matricula = matricula;
        this.salario = salario;
        super(nome);
    }
    @Override
    public void mostrarDados(){
        if(nome != null & cpf != null & telefone != null & endereco != null & matricula != null & salario != 0){
            JOptionPane.showMessageDialog(null, "Nome: " + getNome() + "\n" + "CPF: " + getCpf() + "\n" + "Telefone: " + getTelefone() + "\n" + "Endereço: " + getEndereco() + "\n" + "Matrícula: " + getMatricula() + "\n" + "Salário: " + getSalario(),"Dados",JOptionPane.INFORMATION_MESSAGE);
        }
        else if(nome != null & matricula != null & salario != 0){
            JOptionPane.showMessageDialog(null, "Nome: " + getNome() + "\n" + "Matrícula: " + getMatricula() + "\n" + "Salário: " + getSalario(),"A informação sobre o Nome, Matrícula e salário do funcionário: ",JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null,"Dados inserido incorretamente. Tente novamente.","Erro",JOptionPane.ERROR_MESSAGE);
        }
    }
    public void setMatricula(String matricula){
        if(matricula == null){
            JOptionPane.showMessageDialog(null, "Digite uma matrícula válida","Erro",JOptionPane.ERROR_MESSAGE);
        }
        else{
            this.matricula = matricula;
        }
    }
    public String getMatricula(){
        return this.matricula;
    }
    public void setSalario(double salario){
        if(salario == 0){
            JOptionPane.showMessageDialog(null, "Digite um salário válido ou maior que zero","Erro",JOptionPane.ERROR_MESSAGE);
        }
        else{
            this.salario = salario;
        }
    }
    public double getSalario(){
        return this.salario;
    }
        

}
