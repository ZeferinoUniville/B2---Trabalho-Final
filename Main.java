import java.util.*;

public class Main {

    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Materia materia = new Materia();
        aluno.setName();

        ArrayList<Integer> peso = aluno.generatePesos();
        double notaPeso = 0;
        double notaFinal = 0;
        System.out.println("A quantidade de Notas da Materia de "+materia.getNomeMateria()+" no semestre e de : "+ materia.getQtdNotas()+" Notas.\n");

        for (int j = 0; j <= 2; j++) {
            ArrayList<Integer> nota = aluno.generateNotas();
            ArrayList<String> alunos = aluno.setName();
            notaFinal = 0.0;
            System.out.println("===========================================\n");
            for (int i = 0; i <= 4; i++) {
                int fakeI = i + 1;
                System.out.println("----------------------------------------------\n");
                System.out.println("Nota " + fakeI + " : " + nota.get(i));
                System.out.println("---");
                System.out.println("Peso da nota " + fakeI + " : " + peso.get(i));
                System.out.println("---");
                notaPeso = nota.get(i) * peso.get(i) / 10.0;
                notaFinal = notaFinal + notaPeso;
                System.out.println("Nota pelo peso " + fakeI + " : " + notaPeso);

            }
            System.out.println("A nota final do "+alunos.get(j)+" foi: " + notaFinal);
        }
    }
}