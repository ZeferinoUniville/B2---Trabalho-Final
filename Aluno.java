import java.util.*;

public class Aluno {

    private ArrayList<Integer> boletimNotas = new ArrayList<>();
    private ArrayList<Integer> boletimPesos = new ArrayList<>();
    private ArrayList<String> nomeAluno = new ArrayList<>();
    Random aleatorio = new Random();
    Scanner leitor  = new Scanner (System.in);

    public ArrayList<String> setName() {
        nomeAluno.add("Aluno1");
        nomeAluno.add("Aluno2");
        nomeAluno.add("Aluno3");
        return nomeAluno;
    }

    public ArrayList<Integer> generateNotas() {
        boletimNotas.clear();
        for (int i = 1; i <= 5; i++) {
            int valor = aleatorio.nextInt(10) + 1;
            boletimNotas.add(valor);
        }
        return boletimNotas;

    }

    public ArrayList<Integer> generatePesos() {
        Integer peso = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Peso da nota "+i+" : ");
            peso = leitor.nextInt();
            boletimPesos.add(peso);
        }
        return boletimPesos;

    }
}
