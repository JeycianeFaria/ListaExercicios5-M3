package br.com.zup;

public class Funcionarios {

    //atributos
    private String nome;
    private String cpf;
    private String numRegistro;
    private String orgaoLotacao;
    private double salario;


    //construtor
    public Funcionarios() {
    }

    public Funcionarios(String nome, String cpf, String numRegistro, String orgaoLotacao, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.numRegistro = numRegistro;
        this.orgaoLotacao = orgaoLotacao;
        this.salario = salario;
    }


    //getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNumRegistro() {
        return numRegistro;
    }

    public void setNumRegistro(String numRegistro) {
        this.numRegistro = numRegistro;
    }

    public String getOrgaoLotacao() {
        return orgaoLotacao;
    }

    public void setOrgaoLotacao(String orgaoLotacao) {
        this.orgaoLotacao = orgaoLotacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


    //métodos
    //Para aumentar o sálario de todos os funcionários
    public void aumentoSalario(){
        double porcentagemAumento = 0.1;
        double aumento = salario * porcentagemAumento;
        double salarioAtualizado = salario + aumento;
        salario = salarioAtualizado;
    }

}
