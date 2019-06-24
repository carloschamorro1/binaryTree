public class NodoAB {
    private NodoAB hijoIz;
    private NodoAB hijoDe;
    int dato;




    public NodoAB(int dato){
        this.dato = dato;
    }

    public NodoAB getHijoIz() {
        return hijoIz;
    }

    public void setHijoIz(NodoAB hijoIz) {
        this.hijoIz = hijoIz;
    }

    public NodoAB getHijoDe() {
        return hijoDe;
    }

    public void setHijoDe(NodoAB hijoDe) {
        this.hijoDe = hijoDe;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }
}
