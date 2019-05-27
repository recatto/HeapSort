
public class Teste {
    public static void main(String[] args) {
        
        int [] lista = {3, 27, 88, 666, 247, 2, 8, 90, 6};
        
        Heapsort heap = new Heapsort();
    
        heap.ordenar(lista);

        for (int i : lista){
            System.out.println(i);
        }
    }
    
}
