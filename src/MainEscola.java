
public class MainEscola {
    public static void main(String[] args) {
        Funcionario atendente = new Atendente("Ana", 25, "Atendente");
        Funcionario professor = new Professor("João", 35, "Professor");
        Aluno bolsista = new Bolsista(123456);

        atendente.baterOPonto();
        atendente.realizarTrabalho();
        professor.realizarTrabalho();
        bolsista.matriculado();

    }
}

