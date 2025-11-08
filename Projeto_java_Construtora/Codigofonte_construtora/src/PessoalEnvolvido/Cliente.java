package PessoalEnvolvido;

public class Cliente extends Pessoa {
    private String email;
    private double rendaMensal;
    
public Cliente(String nome, String cpf,String telefone, String endereco, String email, double rendaMensal){
    super(nome,cpf,telefone,endereco);
    this.rendaMensal = rendaMensal;
    this.email = email;
}
public Cliente(String nome, String email, double rendaMensal){
    super(nome);
    this.rendaMensal = rendaMensal;
    this.email = email;
}
}
