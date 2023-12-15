public final class Bolsista extends Aluno {
    public Bolsista(Integer matricula) {
        super(matricula);
    }

    @Override
    public void matriculado() {
        System.out.println("Aluno com matrícula: " + getMatricula() + " no sistema de Bolsas");
    }
}
