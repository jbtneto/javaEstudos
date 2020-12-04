package exercicios;

import java.util.Scanner;

// 5 turmas, 20 alunos.
// Media de cada aluno de cada uma das turmas.
public class Exercicio03_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int turma, aluno = 0, fdp = 0;
        double mediaAluno = 0, mediaTurma /*mediaGeral*/;
        //mediaGeral = 0;
        for (turma = 1; turma <= 5; turma++) {
            System.out.println("Insercao de dados da turma " + turma);
            mediaTurma = 0;
            for (aluno = 1; aluno <= 5; aluno++) {
                System.out.println("Digite a Media do aluno " + aluno);
                mediaAluno = in.nextInt();
                mediaTurma = mediaTurma + mediaAluno;
                fdp++;

            }
            System.out.println(mediaTurma);
            System.out.println(fdp);
            mediaTurma = mediaTurma / fdp;
            //System.out.println(mediaTurma);
            //mediaGeral = mediaGeral + mediaTurma;
            System.out.println("Media da turma" + turma + "=" + mediaTurma);
            in.close();
        }

        
    }
}
