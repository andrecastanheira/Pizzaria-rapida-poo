public class Player {
    private final String nome;
    private int posicao = 0;

    public Player(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getPosicao() {
        return posicao;
    }

    /** Avança um número de casas (resultado do dado). */
    public void move(int passos) {
        posicao += passos;
    }

    /** Vai diretamente para uma casa (usado pelos efeitos). */
    public void move(Cell destino) {
        posicao = destino.getNumero();
    }

    public void reiniciar() {
        posicao = 0;
    }
}
