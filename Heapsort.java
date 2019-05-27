public class Heapsort {
    
    public void ordenar(int[] lista){
        montarArvoreHeap(lista);
        int n = lista.length;
        
        for(int i = lista.length -1; i > 0; i--){
            int aux = lista[i];
            lista[i] = lista[0];
            lista[0] = aux;
            ordenarArvore(lista, 0, --n);
        }
    }
    
    public void montarArvoreHeap(int[] lista){
        for(int posicao = (lista.length -1)/2; posicao >= 0; posicao--){
            ordenarArvore(lista, posicao, lista.length);
        }
    }
    
    public void ordenarArvore (int[] lista, int posicao, int tamanhoVetor){
        int indiceFilhoUm = 2 * posicao + 1;
        int indiceFilhoDois = indiceFilhoUm + 1;
        
        if (indiceFilhoUm < tamanhoVetor){
            if (indiceFilhoDois < tamanhoVetor){
                if (lista[indiceFilhoUm] < lista[indiceFilhoDois]){
                    indiceFilhoUm = indiceFilhoDois;
                }
            }
            if(lista [indiceFilhoUm] > lista[posicao]){
                int aux = lista[indiceFilhoUm];
                lista [indiceFilhoUm] = lista[posicao];
                lista[posicao] = aux;
                
                ordenarArvore(lista, indiceFilhoUm, tamanhoVetor);
            }
        }

    }
    
}
