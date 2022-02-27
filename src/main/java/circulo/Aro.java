package circulo;

/**
 * Probas de refactorización en NetBeans coa clase Aro
 * @author Rocío Fortes
 */
public class Aro {
    
    

    private int coordenadaX;
    private int coordenadaY;
    private double radio;

    /**
     * @return the coordenadaX
     */
    public int getCoordenadaX() {
        return coordenadaX;
    }

    /**
     * @param coordenadaX the coordenadaX to set
     */
    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    /**
     * @return the coordenadaY
     */
    public int getCoordenadaY() {
        return coordenadaY;
    }

    /**
     * @param coordenadaY the coordenadaY to set
     */
    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    /**
     * @return the radio
     */
    public double getRadio() {
        return radio;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(double radio) {
        if(radio <LIMITERADIO){
            this.radio = LIMITERADIO;
        }else{
            this.radio=radio;
        }
    }
    
    /**
     * LIMITERADIO é unha constante
     * define o límite inferior para o valor do radio
     * o seu valor fixo é de 0.0
     **/
    public static final double LIMITERADIO = 0.0;
    
    /**
     * Constructor por defecto
     **/

    public Aro() {
    }
    
    /**
     * Constructor parametrizado con tres parámetros
     * @param valorX valor da coordenada X do centro do Aro
     * @param valorY valor da coordenada Y do centro do Aro
     * @param valorRadio valor do radio do Aro
     **/
    

    public Aro(int valorX, int valorY, double valorRadio) {
        coordenadaX = valorX;
        coordenadaY = valorY;
        setRadio(valorRadio);
    }





    /**
     * Método que devolve o diámetro do Aro
     * @return o valor do diámetro (radio * 2)
     **/


    public double obterDiametro() {
        return getRadio() * 2;
    }
    
    
    /**
     * Método que calcula a circunferencia do Aro
     * @return perímetro do Aro
     **/

    public double obterCircunferencia() {
        return Math.PI * obterDiametro();
    }
    
    /**
     * Método que calcula a área que contén o Aro
     * @return superficie do interior do Aro
     **/

    public double obterSuperficie() {
        return Math.PI * getRadio() * getRadio();
    }

    /**
     * Método que devolve unha cadea de texto coas coordenadas do centro e o radio do Aro
     * @return unha cadea de texto
     */
    @Override
    public String toString() {
        return "Centro = [" + getCoordenadaX() + "," + getCoordenadaY() + "]; Radio = " + getRadio();
    }

    /**
     * Método para desprazar as coordenadas do centro do Aro
     * @param trasladarX
     * @param trasladarY
     */
    public void trasladarCentro(int trasladarX, int trasladarY){
        setCoordenadaX(getCoordenadaX() + trasladarX);
        setCoordenadaY(getCoordenadaY() + trasladarY);
    }
}