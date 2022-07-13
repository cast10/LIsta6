package src.universidade ;

public class Professores extends Funcionarios {

    String nivelDeGraduacao;
    String disciplinaMinistrada;
    int quantAlunos;
    int quantTurma=10;

    double salaraioProf;
    double aumento10= 0.10;
    int addTurma;
    int totalDeTurma;




    public Professores() {
        this.nivelDeGraduacao = nivelDeGraduacao;
        this.disciplinaMinistrada = disciplinaMinistrada;
        this.quantAlunos = quantAlunos;
        this.quantTurma = quantTurma;
    }
        public String getNivelDeGraduacao() {
        return nivelDeGraduacao;
    }
        public void setNivelDeGraduacao(String nivelDeGraduacao) {
        this.nivelDeGraduacao = nivelDeGraduacao;
    }
        public String getDisciplinaMinistrada() {
        return disciplinaMinistrada;
    }
        public void setDisciplinaMinistrada(String disciplinaMinistrada) {
        this.disciplinaMinistrada = disciplinaMinistrada;
    }
        public int getQuantAlunos() {
        return quantAlunos;

    }
        public void setQuantAlunos(int quantAlunos) {
        this.quantAlunos = quantAlunos;
    }
        public int getQuantTurma() {
        return quantTurma;
    }
        public void setQuantTurma(int quantTurma) {
        this.quantTurma = quantTurma;
    }
        public void adicionarTurma(int quantTurma, int addTurma){


        totalDeTurma = (quantTurma + addTurma);
        System.out.println("Quantidade de turma é de   " + totalDeTurma);

    }
        public void reajusteProf(double salaraioProf , double aumento10, double comAumentProf){
        comAumentProf = ((salaraioProf * aumento10)+salaraioProf);
        System.out.println("Seu salário atual é de  "+comAumentProf + "após do aumento de 10%");

    }

}
