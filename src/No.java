public class No {
    String valor;
    No esquerda, direita;

    public No(String valor) {
        this.valor = valor;
        esquerda = direita = null;
    }
    public int contarNos() {
        int total = 1;

        if (esquerda != null) {
            total += esquerda.contarNos();
        }

        if (direita != null) {
            total += direita.contarNos();
        }

        return total;
    }
}
