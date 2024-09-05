public class Main {
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();

        int[] valores = {14, 15, 4, 9, 7, 18, 3, 5, 16, 20, 17, 9, 5};

        for (int valor : valores) {
            arvore.inserir(valor);
        }

        System.out.println("In-ordem:");
        arvore.inOrdem();
        System.out.println("Pré-ordem:");
        arvore.preOrdem();
        System.out.println("Pós-ordem:");
        arvore.posOrdem();
        System.out.println("Jogadinha do Paquetá");
        arvore.removerMaior();
        arvore.removerMenor();
        arvore.remover(9);
    }
}
