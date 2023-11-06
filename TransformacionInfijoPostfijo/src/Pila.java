
public class Pila {

    private int tamanio;
    public int numElementos;
    private Object A[];

    public Pila(int tamanio) {
        this.tamanio = tamanio;
        this.numElementos = 0;
        this.A = new Object[tamanio];
    }

    public void Apilar(Object elem) {

        A[numElementos] = elem;
        numElementos++;
    }

    public Object Desapilar() {
        Object aux;

        aux = A[numElementos - 1];
        numElementos--;
        return aux;
    }

    public boolean Vacia() {

        if (numElementos == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean Llena() {

        if (numElementos == tamanio) {
            return true;
        } else {
            return false;
        }
    }

    public Object Cima() {
        return A[numElementos - 1];
    }

   

    public int getNumElementos() {
        return numElementos;
    }

    public void setNumElementos(int numElementos) {
        this.numElementos = numElementos;
    }

    public Object[] getA() {
        return A;
    }

    public void setA(Object[] A) {
        this.A = A;
    }

    public int getTamanio() {
        return this.tamanio;
    }
}
