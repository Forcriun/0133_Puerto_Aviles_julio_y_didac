/**
 * Clase que representa una embarcacion deportiva a motor con una potencia 
 * determinada.
 * 
 * @author Julio Cachon y Didac Fernandez 
 * @version 2018/05/09 - 10:30
 */
public class EmbarcacionAMotor extends Barco
{
    private int potencia;

    /**
     * Constructor de objetos de la clase EmbarcacionAMotor.
     * 
     * @param   matricula         Una cadena con la matricula del barco.
     * @param   eslora            La longitud del barco.
     * @param   anoFabricacion    El ano de fabricacion del barco.
     * @param   dueno             Un objeto de la clase Persona que representa al dueno del barco.
     * @param   potencia          La potencia en caballos del barco.
     */
    public EmbarcacionAMotor(String matricula,double eslora,int anoFabricacion,Persona dueno, int potencia)
    {        
        super(matricula,eslora,anoFabricacion,dueno);
        this.potencia = potencia;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public double getCoeficienteBernua(){
        return potencia;
    }

    /**
     * Devuelve un String con los datos de la embarcacion a motor.
     *
     * @return     Cadena con los datos. 
     */
    @Override
    public String toString()
    {
        String aDevolver = super.toString();
        aDevolver += "      Potencia: " + potencia + "(CV).\n";
        return aDevolver;
    }
}
