public class Professor extends Funcionario {
    public Professor(String nome, Integer idade, String cargo) {
        super(nome, idade, cargo);
    }

    @Override
    public void realizarTrabalho() {
        System.out.println(getCargo() + " " + getNome() + "  realizando aula.");
    }
}
