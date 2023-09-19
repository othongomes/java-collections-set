package conjunto_palavras_unicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<Palavras> palavrasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        palavrasSet.add(new Palavras(palavra));
    }

    public void removerPalavra(String palavra){
        Palavras palavraParaRemover = null;
        for (Palavras p: palavrasSet) {
            if (p.getPalavra() == palavra){
                palavraParaRemover = p;
                break;
            } else {
                throw new RuntimeException("A palavra não existe!");
            }
        }
        palavrasSet.remove(palavraParaRemover);
    }

    public int contarPalavras(){
        return palavrasSet.size();
    }

    public void exibirPalavras(){
        System.out.println(palavrasSet);
    }


    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();
        System.out.println("Existem " + conjuntoPalavrasUnicas.contarPalavras() + " palavras na lista");

        conjuntoPalavrasUnicas.adicionarPalavra("Othon");
        conjuntoPalavrasUnicas.adicionarPalavra("Laranja");
        conjuntoPalavrasUnicas.adicionarPalavra("Jack");
        conjuntoPalavrasUnicas.adicionarPalavra("Peppa");
        conjuntoPalavrasUnicas.exibirPalavras();

        System.out.println("Existem " + conjuntoPalavrasUnicas.contarPalavras() + " palavras na lista");

        conjuntoPalavrasUnicas.removerPalavra("Laranja");
        System.out.println("Existem " + conjuntoPalavrasUnicas.contarPalavras() + " palavras na lista");

        conjuntoPalavrasUnicas.exibirPalavras();
    }
}
