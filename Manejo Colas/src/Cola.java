
public class Cola {

     Object[] V;
    int tam, ne, inicio, fin;

    public Cola(int t) {
        tam = t;
        V = new Object[tam];
        ne = 0;
        inicio = 0;
        fin = 0;
    }

    public void Encolar(Object elem) {
        if (Llena() == false) {
            V[fin++] = elem;
            ne++;
        }
        if (fin == tam) {
            fin = 0;
        }
    }

    public Object Desencolar() {
        Object aux = null;

        if (!Vacia()) {
            aux = V[inicio];
            inicio++;
            ne--;
            if (inicio == tam) {
                inicio = 0;
            }
        }
        return aux;
    }

    public boolean Vacia() {

        if (ne == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean Llena() {

        if (ne == tam) {
            return true;
        } else {
            return false;
        }
    }

    public int NumElementos() {
        return ne;
    }

    public String Reporte() {
        String r = "";
        Producto p;

        int pos = inicio;
        int count = 0;
        while (count < ne) {
            if (V[pos] instanceof Producto) {
                p = (Producto) V[pos];
                r += "Codigo: " + p.getCodigo()
                        + "\nNombre: " + p.getNombre()
                        + "\nCantidad: " + p.getCantidad()
                        + "\nPrecio " + p.getPrecio()
                        + "\nMinimo: " + p.getMinimo() + "\n\n";
                count++;
            }
            pos ++;
        }
        return r;
    }

    public Object[] getV() {
        return V;
    }

    public void setV(Object[] V) {
        this.V = V;
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }

    public int getNe() {
        return ne;
    }

    public void setNe(int ne) {
        this.ne = ne;
    }

    public int getInicio() {
        return inicio;
    }

    public void setInicio(int inicio) {
        this.inicio = inicio;
    }

    public int getFin() {
        return fin;
    }

    public void setFin(int fin) {
        this.fin = fin;
    }
}
