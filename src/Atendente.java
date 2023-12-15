public class Atendente extends Funcionario {
    public Atendente(String nome, Integer idade, String cargo) {
        super(nome, idade, cargo);
    }

    @Override
    public void realizarTrabalho() {
        System.out.println(getNome() + " " + getCargo() + " realizando trabalho.");
    }
}
