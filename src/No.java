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

public class ArvoreBinaria {

    No raiz;
    
}

public int contarNos() {
        if (raiz == null) return 0;

        int count = 0;
        Stack<No> pilha = new Stack<>();
        pilha.push(raiz);

        while (!pilha.isEmpty()) {
            No atual = pilha.pop();
            count++;

            if (atual.direita != null) pilha.push(atual.direita);
            if (atual.esquerda != null) pilha.push(atual.esquerda);
        }

        return count;
    }

public void buscaEmOrdem() {
        Stack<No> pilha = new Stack<>();
        No atual = raiz;

        while (atual != null || !pilha.isEmpty()) {
            while (atual != null) {
                pilha.push(atual);
                atual = atual.esquerda;
            }

            atual = pilha.pop();
            System.out.println(atual.valor + " ");
            atual = atual.direita;
        }
    }

public void buscaPosOrdem() {
        if (raiz == null) return;

        Stack<No> pilha1 = new Stack<>();
        Stack<No> pilha2 = new Stack<>();
        pilha1.push(raiz);

        while (!pilha1.isEmpty()) {
            No atual = pilha1.pop();
            pilha2.push(atual);

            if (atual.esquerda != null) pilha1.push(atual.esquerda);
            if (atual.direita != null) pilha1.push(atual.direita);
        }

        while (!pilha2.isEmpty()) {
            System.out.println(pilha2.pop().valor + " ");
        }
    }

public void buscaEmNivel() {
        if (raiz == null) return;

        Queue<No> fila = new LinkedList<>();
        fila.add(raiz);

        while (!fila.isEmpty()) {
            No atual = fila.poll();
            System.out.println(atual.valor + " ");

            if (atual.esquerda != null) fila.add(atual.esquerda);
            if (atual.direita != null) fila.add(atual.direita);
        }
    }
}








