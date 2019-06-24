public class ArbolBin {
    NodoAB raiz;

    public void run() {
        raiz = new NodoAB(4);
        System.out.println("Construyendo con valor de raiz  " + raiz.getDato());
        System.out.println("=================================");
        add(2);
        add(9);
        add(1);
        add(5);
        add(3);
        add(11);
    }


    void add(int dato){
        raiz = addRecursive(raiz,dato);
    }
    NodoAB addRecursive(NodoAB nodo, int dato){
        if(dato <nodo.getDato()){
            if(nodo.getHijoIz() != null){
                addRecursive(nodo.getHijoIz(),dato);
            }
            else{
                System.out.println("Insertado el valor "+ dato + " A la izquierda del nodo " + nodo.getDato());
                nodo.setHijoIz(new NodoAB(dato));
            }

        }
        else if(dato > nodo.getDato()){
            if(nodo.getHijoDe() != null){
                addRecursive(nodo.getHijoDe(),dato);
            }
            else{
                System.out.println("Insertado el valor "+ dato + " A la derecha del nodo " + nodo.getDato());
                nodo.setHijoDe(new NodoAB(dato));
            }
        }
        return nodo;
    }


    boolean search(int dato){
        return searchRecursive(raiz,dato);
    }
    boolean searchRecursive (NodoAB nodo,int dato){
        if(nodo == null)
            return false;
        if(dato == nodo.dato)
            return true;
        return dato < nodo.dato ? searchRecursive(nodo.getHijoDe(),dato) :
                searchRecursive(nodo.getHijoIz(), dato);
    }
}
