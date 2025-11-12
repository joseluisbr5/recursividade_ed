public class Main {
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();

        arvore.inserir(8);
        arvore.inserir(3);
        arvore.inserir(10);
        arvore.inserir(1);
        arvore.inserir(6);
        arvore.inserir(14);
        arvore.inserir(4);
        arvore.inserir(7);
        arvore.inserir(13);

        System.out.println("Busca pelo valor 6: " + arvore.buscar(6));
        System.out.println("Busca pelo valor 15: " + arvore.buscar(15));

        System.out.print("\nPré-ordem: ");
        arvore.preOrdem(arvore.raiz);

        System.out.print("\nEm ordem: ");
        arvore.emOrdem(arvore.raiz);

        System.out.print("\nPós-ordem: ");
        arvore.posOrdem(arvore.raiz);
    }
}
