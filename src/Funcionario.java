public abstract class Funcionario extends Pessoa {
    private String cargo;

    public Funcionario(String nome, Integer idade, String cargo) {
        super(nome, idade);
        this.cargo = cargo;
    }
    public String getCargo() {
        return cargo;
    }
    public final void baterOPonto() {
        System.out.println("Batendo o ponto");
    }
    public abstract void realizarTrabalho();
}

