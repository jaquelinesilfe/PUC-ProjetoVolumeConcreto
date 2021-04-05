
package projetovolumeconcreto;

public class CalculoVolumeConcreto {
    private double base;
    private double altura;
    private double comprimento;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }
    
     //Metodo responsavel por calcular o volume do concreto
    public int calcularVolumeConcreto(){
        return (int) (getBase() * getAltura() * getComprimento());
    }

}
