/**
 * Clase que representa una embarcacion deportiva a motor de lujo (yate) con 
 * un numero determinado de camarotes.
 * 
 * @author Julio Cachon y Didac Fernandez 
 * @version 2018/05/09 - 10:30
 */
public class Yate extends EmbarcacionAMotor
{
    private int numCamarotes;

    /**
     * Constructor de objetos de la clase Yate.
     * 
     * @param   matricula         Una cadena con la matricula del barco.
     * @param   eslora            La longitud del barco.
     * @param   anoFabricacion    El ano de fabricacion del barco.
     * @param   dueno             Un objeto de la clase Persona que representa al dueno del barco.
     * @param   potencia          La potencia en caballos del barco.
     * @param   numCamarotes      El numero de camarotes que tiene el barco.
     */
    public Yate(String matricula,double eslora,int anoFabricacion,Persona dueno, int potencia, int numCamarotes)
    {        
        super(matricula,eslora,anoFabricacion,dueno,potencia);
        this.numCamarotes = numCamarotes;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public double getCoeficienteBernua(){
        return super.getCoeficienteBernua() +  numCamarotes;
    }

    /**
     * Devuelve un String con los datos del yate.
     *
     * @return     Cadena con los datos. 
     */
    @Override
    public String toString()
    {
        String aDevolver = super.toString();
        aDevolver += "      Camarotes: " + numCamarotes + ".\n";
        return aDevolver;
    }
}
