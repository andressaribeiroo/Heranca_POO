public abstract class Aluno {
    private Integer matricula;

    public Aluno(Integer matricula) {
        this.matricula = matricula;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public abstract void matriculado();

}
