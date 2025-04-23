public class Mamifero extends AnimalBase {
    private String pelagem;

    public Mamifero(String nome, int idade, Habitat habitat, String pelagem) {
        super(nome, idade, habitat);
        this.pelagem = pelagem;
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " está latindo!");
    }

    @Override
    public void mover() {
        System.out.println(nome + " está andando.");
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Mamífero: " + nome + ", Idade: " + getIdade() +
                ", Habitat: " + habitat + ", Pelagem: " + pelagem);
    }
}