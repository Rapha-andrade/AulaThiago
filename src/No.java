public class No {
    String valor;
    No esquerda, direita;

    public No(String valor) {
        this.valor = valor;
        esquerda = direita = null;
    }

    public int contarNos(No node) {
        if(node == null) return 0;
        return 1 + contarNos(node.esquerda) + contarNos(node.direita);
    }

    public void buscaPreOrdem(No node){
        if(node != null) {
            System.out.println(node.valor + " ");
            buscaPreOrdem(node.esquerda);
            buscaPreOrdem(node.direita);
        }
    }
}

public class buscaEmOrdem(No node) {
    if (node != null) {
        buscaEmOrdem(node.esquerda);
        System.out.println(node.valor + valor " ");
        buscaEmOrdem(node.direita);
    }

}

public void buscaPosOrdem(No node) {
    if (node != null) {
      buscaPosOrdem(node.esquerda);
      buscaPosOrdem(node.direita);
      System.out.println(node.valor + " ");
    }
}

public void bucaEmNivel(No node) {
    if (raiz == null) return; 
    
    Queue<No> fila = new LinkedList<>();
    No atual = fila.poll();
    System.out.println(atual.valor + " ");
    
    if (atual.esquerda !=null) fila.add(atual.esquerda);
    if(atual.direita !-null) fila.add(atual.direita);
}




