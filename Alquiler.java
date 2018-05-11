/**
 * Clase que representa los alquileres de amarres en el Puerto. Los alquileres
 * constaran del numero de dias que se ocupa el amarre en cuestion, el barco 
 * que lo ocupa y la posicion del amarre en el puerto.
 * 
 * @author Julio Cachon y Didac Fernandez 
 * @version 2018/05/09 - 10:30
 */
public class Alquiler
{
    //  Constantes utilizadas para calcular el precio de alquiler
    private static final int PRECIO_BASE = 300; //  Cuota a multiplicar por el coeficiente de Bernua
    private static final int MULTIPLICADOR_ESLORA = 10; //  Cuota asociada a la embergadura de los barcos

    private int numDias;
    private Barco barco;
    private int posicionAmarre;

    /**
     * Constructor de objetos de la clase Alquiler.
     * 
     * @param numDias   Numero de dias que se va a ocupar el amarre.
     * @param barco     El barco que ocupara el amarre.
     * @param barco     La posicion en el puerto del amarre ocupado.
     */
    public Alquiler(int numDias,Barco barco,int posicionAmarre)
    {
        this.numDias = numDias;
        this.barco = barco;
        this.posicionAmarre = posicionAmarre;
    }

    /**
     * Metodo que devuelve el precio del alquiler en funcion del tiempo de ocupacion
     * del amarre y del tipo de embarcacion.
     * 
     * @return     El precio del alquiler.
     */
    public double getPrecio()
    {
        double precio = 0.0;

        precio = (numDias*(MULTIPLICADOR_ESLORA*barco.getEslora()))+PRECIO_BASE*barco.getCoeficienteBernua();

        return precio;
    }

    /**
     * Devuelve una cadena con los datos del alquiler.
     *
     * @return     Cadena con los datos del alquiler. 
     */
    public String toString()
    {
        String aDevolver = "";
        aDevolver += "Posicion de amarre: " + posicionAmarre + ".\n";
        aDevolver += "Dias ocupación: " + numDias + ".\n";
        aDevolver += barco;
        return aDevolver;
    }
}
