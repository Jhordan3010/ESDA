
public class TransfInfPost {

    Pila p;
    String ExpInf;
    char[] AInf;
    char[] APost;
    int ncar;

    public TransfInfPost(String ExpInf) {
        this.ExpInf = ExpInf;
        ncar = ExpInf.length();
        this.p = new Pila(ncar);
        this.AInf = new char[ncar];
        this.APost = new char[ncar];
    }

    public void ConvertirArregloInfijo() {
        for (int i = 0; i < ncar; i++) {
            AInf[i] = ExpInf.charAt(i);
        }
    }

    public int prioridad(char car) {
        int prior = -1;
        switch (car) {
            case '(':
                prior = 0;
                break;
            case '+':
            case '-':
                prior = 1;
                break;
            case '*':
            case '/':
                prior = 2;
                break;
            case '^':
                prior = 3;
                break;
        }
        return prior;
    }

    public void TransformarPostfijo() {
        int j = 0;
        for (int i = 0; i < this.ncar; i++) {
            if (AInf[i] == '(') {
                p.Apilar(AInf[i]);
            } else if (AInf[i] == ')') {
                while (!p.Cima().equals('(')) {
                    APost[j] = (char) p.Desapilar();
                    
                    j++;
                }
                p.Desapilar();
            } else {
                if (prioridad(AInf[i]) == -1) {
                    this.APost[j] = AInf[i];
                    j++;
                } else {
                    if (p.Vacia() || prioridad(AInf[i]) > prioridad((char) p.Cima())) {
                        p.Apilar(AInf[i]);
                    } else {
                        while (!p.Vacia() && (prioridad(AInf[i]) <= prioridad((char) p.Cima()))) {
                            APost[j] = (char) p.Desapilar();
                            j++;
                        }
                        p.Apilar(AInf[i]);
                    }
                }
            }
        }
        while (!p.Vacia()) {
            APost[j] = (char) p.Desapilar();
            j++;
        }

    }
    //2+5*3^2-7
    public int TransformarExpresionPosfija() {
        Pila pilResultado = new Pila(ncar);
        for (int i = 0; i < ncar; i++) {
            if (APost[i] != ' ') {
                char elemen = APost[i];
                if (elemen >= '0' && elemen <= '9') {//Num del 1-9
                    int numero = Character.getNumericValue(elemen);
                    pilResultado.Apilar(numero);
                } else {//Es operador
                    int n1 = (int) pilResultado.Desapilar();
                    int n2 = (int) pilResultado.Desapilar();
                    int r = RealizarOperacion(elemen, n1, n2);
                    pilResultado.Apilar(r);
                }
            }
        }
        int resultadoFinal = (int) pilResultado.Desapilar();
        return resultadoFinal;
    }
    
    public String RetornarExpPostfija() {
        String r = "";
        for (int i = 0; i < ncar; i++) {
            r += APost[i];
        }
        return r;
    }

    // Operaciones con a y b
    public int RealizarOperacion(char operador, int a, int b) {
        int r = 0;
        switch (operador) {
            case '+':
                r = b + a;
                break;
            case '-':
                r =  b - a;
                break;
            case '*':
                r = b * a;
                break;
            case '/':
                r = b / a;
                break;
            case '^':
                r = (int) Math.pow(b, a);
                break;
        }
        return r;
    }
}