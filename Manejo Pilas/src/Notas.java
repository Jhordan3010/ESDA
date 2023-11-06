
public class Notas {

    private String cedula;
    private String codMateria;
    private double nota1;
    private double nota2;
    private double notaSup;

    public Notas(String cedula, String codMateria, double nota1, double nota2, double notaSup) {
        this.cedula = cedula;
        this.codMateria = codMateria;
        this.nota1 = nota1;
        this.nota2 = nota2;
        if ((nota1 + nota2) < 14 && (nota1 + nota2) >= 11) {
            this.notaSup = notaSup;
        } else {
            this.notaSup = 0;
        }
    }

    /**
     * @return the cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * @return the codMateria
     */
    public String getCodMateria() {
        return codMateria;
    }

    /**
     * @param codMateria the codMateria to set
     */
    public void setCodMateria(String codMateria) {
        this.codMateria = codMateria;
    }

    /**
     * @return the nota1
     */
    public double getNota1() {
        return nota1;
    }

    /**
     * @param nota1 the nota1 to set
     */
    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    /**
     * @return the nota2
     */
    public double getNota2() {
        return nota2;
    }

    /**
     * @param nota2 the nota2 to set
     */
    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNotaSup() {
        return notaSup;
    }

    public void setNotaSup(double notaSup) {
        this.notaSup = notaSup;
    }

    @Override
    public String toString() {
        return "[" + this.cedula 
                + "] [" + this.codMateria + "] ["
                +   this.nota1
                + "]  [ " + this.nota2 + "] ["+
                this.notaSup + "]\n";
    }

}
