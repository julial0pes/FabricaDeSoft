public abstract class AnimalBase implements Animal {
    protected String nome;
    protected Habitat habitat;
    private int idade;

    public AnimalBase(String nome, int idade, Habitat habitat) {
        this.nome = nome;
        this.idade = idade;
        this.habitat = habitat;
    }

    public int getIdade() {
        return idade;
    }

    public abstract void exibirDetalhes();
}