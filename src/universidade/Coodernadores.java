package src.universidade;

public class Coodernadores extends Funcionarios {

    int quantProfessor;
    int  addProf;
    int  totalProf;
    double salaruioCood;
    double aumentoCood = 0.05;
    double comAumentoCood ;


    public Coodernadores(String nome, int cpf, int numerDeRegistro, String orgaoDeLotacao, double salario, int quantProfessore, int addProf) {
        super(nome, cpf, numerDeRegistro, orgaoDeLotacao, salario);
        this.quantProfessor = quantProfessore;
        this.addProf = addProf;
    }

    public Coodernadores() {

    }


    public int getQuantProfessore() {
        return quantProfessor;
    }
        public void setQuantProfessore(int quantProfessore) {
        this.quantProfessor = quantProfessore;
    }

    public void adicionarProfessor (int addProf, int quantProfessore){
        totalProf = quantProfessore + addProf;
        System.out.println( );

    }
        public void reajusteCood (double salaruioCood,double aumentoCood,double comAumentoCood){
        comAumentoCood =  ((salaruioCood * aumentoCood) + salaruioCood);
        System.out.println("Seu salário atual é de  "+comAumentoCood + "após do aumento de 5%");


    }



}



