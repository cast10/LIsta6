package src.universidade;

public abstract class Administrativo extends Funcionarios {

    String funcaoADM;
    String serioridade;

    double aumentoDe10 =0.10;
    double salarioAdm;
    double comAumentAdm;


    public Administrativo(String funcaoADM, String serioridade) {
        this.funcaoADM = funcaoADM;
        this.serioridade = serioridade;
    }

    public Administrativo() {

    }

    public String getFuncaoADM() {
        return funcaoADM;
    }
    public void setFuncaoADM(String funcaoADM) {
        this.funcaoADM = funcaoADM;
    }
    public String getSerioridade() {
        return serioridade;
    }
    public void setSerioridade(String serioridade) {
        this.serioridade = serioridade;
    }

    public void reajusteProf(double totalSalarioAdm , double aumentoDe10, double comAumentAdm ){
        comAumentAdm = ((salarioAdm * aumentoDe10)+salarioAdm);
        System.out.println("Seu salário atual é de  "+comAumentAdm + "após do aumento de 10%");
    }


}
