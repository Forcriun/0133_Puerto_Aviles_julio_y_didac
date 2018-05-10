/**
 * Superclase con la estructura general de los barcos que pueden tomar forma
 * en la simulacion del puerto. Contiene las caracteristicas y operaciones
 * compartidas por todos los tipos de barcos.
 * 
 * @author Julio Cachon y Didac Fernandez 
 * @version 2018/05/09 - 10:30
 */
public abstract class Barco
{
    private String matricula;
    private double eslora;
    private int anoFabricacion;
    private Persona dueno;

    /**
     * Constructor de objetos de la clase Barco
     * 
     * @param   matricula         Una cadena con la matricula del barco.
     * @param   eslora            La longitud del barco.
     * @param   anoFabricacion    El ano de fabricacion del barco.
     * @param   dueno             Un objeto de la clase Persona que representa al dueno del barco.
     */
    public Barco(String matricula,double eslora,int anoFabricacion,Persona dueno)
    {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anoFabricacion = anoFabricacion;
        this.dueno = dueno;
    }

    /**
     * <pre>
     * El coeficiente de Bernua se calcula en función del tipo de barco:
     *      - Velero:               segun el numero de mástiles.
     *      - EmbarcacionAMotor:    segun la potencia en CV.
     *      - Yate:                 segun el numero de camarotes ademas de la potencia.
     * 
     * El metodo devuelve el atributo necesario para el calculo del precio de
     * alquiler del amarre dependiendo del tipo de barco.
     * </pre> 
     */
    public abstract double getCoeficienteBernua();

    /**
     * Devuelve un String con los datos del barco.
     *
     * @return     Cadena con los datos. 
     */
    public String toString()
    {
        String aDevolver = "";
        aDevolver += "      Matricula: " + matricula + ".\n";
        aDevolver += "      Eslora: " + eslora + "m.\n";
        aDevolver += "      Año De Fabricación: " + anoFabricacion + ".\n";
        aDevolver += dueno;
        return aDevolver;
    }

    /**
     * Getter de la longitud del barco.
     */
    public double getEslora(){
        return eslora;
    }
}
