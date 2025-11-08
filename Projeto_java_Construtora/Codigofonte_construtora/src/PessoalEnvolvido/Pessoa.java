package PessoalEnvolvido;
import javax.swing.*;
public class Pessoa {
    protected String nome;
    protected String cpf;
    protected String telefone;
    protected String endereco;
    //Primeiro construtor
    public Pessoa(String nome,String cpf,String telefone,String endereco){
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;
    }
    // segundo construtor (vazio)
    public Pessoa(){
    // terceiro construtor
    }
    public Pessoa(String nome){
        this.nome = nome;
    }
    // Método de mostrar dados
    public void mostrarDados(){
        if(nome != null & cpf != null & telefone != null & endereco != null){
            JOptionPane.showMessageDialog(null, "Nome: " + getNome() + "\n" + "CPF: " + getCpf() + "\n" + "Telefone: " + getTelefone() + "\n" + "Endereço: " + getEndereco(),"Dados:",JOptionPane.INFORMATION_MESSAGE);
        }
        else if(nome != null){
            JOptionPane.showMessageDialog(null, "Nome: " + getNome(),"Nome do usuário:",JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null,"Tente novamente","Erro",JOptionPane.ERROR_MESSAGE);
        }
    }

    public void setNome(String nome){
        if(nome == null){
            JOptionPane.showMessageDialog(null,"Digite um nome válido!","Erro",JOptionPane.ERROR_MESSAGE);
        }
        else{
           this.nome = nome;
        }
    }
    public String getNome(){
        return this.nome;
    }

    public void setCpf(String cpf){
        if(cpf == null){
            JOptionPane.showMessageDialog(null,"Digite um CPF válido!","Erro",JOptionPane.ERROR_MESSAGE);
        }
        else{
           this.cpf = cpf;
        }
    }
    public String getCpf(){
        return this.cpf;
    }
    public void setTelefone(String telefone){
        if(telefone == null){
            JOptionPane.showMessageDialog(null,"Digite um Telefone válido!","Erro",JOptionPane.ERROR_MESSAGE);
        }
        else{
           this.telefone = telefone;
        }
    }
    public String getTelefone(){
        return this.telefone;
    }
    public void setEndereco(String endereco){
        if(endereco == null){
            JOptionPane.showMessageDialog(null,"Digite um Endereço válido!","Erro",JOptionPane.ERROR_MESSAGE);
        }
        else{
           this.endereco = endereco;
        }
    }
    public String getEndereco(){
        return this.endereco;
    }
}
