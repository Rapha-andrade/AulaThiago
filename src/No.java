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

public class Main {
    public static void main(String[] args) {
        ArvoreAVL arvore = new ArvoreAVL();
        int[] valores = {30, 20, 40, 10, 25, 35, 50, 5};

        for (int valor : valores) {
            arvore.inserir(valor);
        }

        System.out.print("Em ordem: ");
        arvore.emOrdem();
    }
}

public class ArvoreAVL {
    private NoAVL raiz;

    public void inserir(int valor) {
        raiz = inserir(raiz, valor);
    }

    private NoAVL inserir(NoAVL no, int valor) {
        if (no == null) return new NoAVL(valor);

        if (valor < no.valor) {
            no.esquerda = inserir(no.esquerda, valor);
        } else if (valor > no.valor) {
            no.direita = inserir(no.direita, valor);
        } else {
            return no;
        }

        atualizarAltura(no);
        return balancear(no);
    }

    private void atualizarAltura(NoAVL no) {
        int alturaEsq = altura(no.esquerda);
        int alturaDir = altura(no.direita);
        no.altura = 1 + Math.max(alturaEsq, alturaDir);
    }

    private int altura(NoAVL no) {
        return (no == null) ? 0 : no.altura;
    }

    private int fatorBalanceamento(NoAVL no) {
        return (no == null) ? 0 : altura(no.esquerda) - altura(no.direita);
    }

    private NoAVL balancear(NoAVL no) {
        int fb = fatorBalanceamento(no);

        if (fb > 1 && fatorBalanceamento(no.esquerda) >= 0)
            return rotacaoDireita(no);

        if (fb > 1 && fatorBalanceamento(no.esquerda) < 0) {
            no.esquerda = rotacaoEsquerda(no.esquerda);
            return rotacaoDireita(no);
        }

        if (fb < -1 && fatorBalanceamento(no.direita) <= 0)
            return rotacaoEsquerda(no);

        if (fb < -1 && fatorBalanceamento(no.direita) > 0) {
            no.direita = rotacaoDireita(no.direita);
            return rotacaoEsquerda(no);
        }

        return no;
    }

    private NoAVL rotacaoDireita(NoAVL y) {
        NoAVL x = y.esquerda;
        NoAVL T2 = x.direita;

        x.direita = y;
        y.esquerda = T2;

        atualizarAltura(y);
        atualizarAltura(x);

        return x;
    }

    private NoAVL rotacaoEsquerda(NoAVL x) {
        NoAVL y = x.direita;
        NoAVL T2 = y.esquerda;

        y.esquerda = x;
        x.direita = T2;

        atualizarAltura(x);
        atualizarAltura(y);

        return y;
    }

    public void emOrdem() {
        emOrdem(raiz);
        System.out.println();
    }

    private void emOrdem(NoAVL no) {
        if (no != null) {
            emOrdem(no.esquerda);
            System.out.print(no.valor + " ");
            emOrdem(no.direita);
        }
    }
}

public class NoAVL {
    int valor;
    int altura;
    NoAVL esquerda;
    NoAVL direita;

    public NoAVL(int valor) {
        this.valor = valor;
        this.altura = 1;
    }
}








