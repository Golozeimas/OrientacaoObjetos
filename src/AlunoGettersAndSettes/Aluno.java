package AlunoGettersAndSettes;

public class Aluno {
    private double nota;

        public Aluno(double nota){
            this.nota = nota;
        }

    public double getNota(){
            return nota;
    }

    public void setNota (double n){
            if ( n > 0 && n <= 10){
                this.nota = n;
                System.out.println(this.nota);
            }
            else{
                System.out.println("erro, essa nota não existe!");
            }
    }
}
