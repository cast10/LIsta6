package src.universidade;

public abstract class Funcionarios {

    String nome;
    int cpf;
    int numerDeRegistro;
    String orgaoDeLotacao;
    double salario;

    double aumentoSal10 = 0.10;
    double salarioComAumento10;

    double aumentoSal5 =0.05;
    double salarioComAumento5;


    public Funcionarios(String nome, int cpf, int numerDeRegistro, String orgaoDeLotacao, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.numerDeRegistro = numerDeRegistro;
        this.orgaoDeLotacao = orgaoDeLotacao;
        this.salario = salario;


    }

    protected Funcionarios() {
    }

    public String getNome(){
        return nome;
    }

        public void setNome(String nome) {
        this.nome = nome;
    }

        public int getCpf() {
        return cpf;
    }
        public void setCpf(int cpf) {
        this.cpf = cpf;
    }
        public int getNumerDeRegistro() {
        return numerDeRegistro;
    }
        public void setNumerDeRegistro(int numerDeRegistro) {
        this.numerDeRegistro = numerDeRegistro;
    }
        public String getOrgaoDeLotacao() {
        return orgaoDeLotacao;
    }
        public void setOrgaoDeLotacao(String orgaoDeLotacao) {
        this.orgaoDeLotacao = orgaoDeLotacao;
    }
        public double getSalario() {
        return salario;
    }
        public void setSalario(double salario) {
        this.salario = salario;
    }
        public String funcao (){
        return funcao();

    }


}
