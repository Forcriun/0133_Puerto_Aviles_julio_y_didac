/**
 * Clase que representa una embarcacion de vela con un numero determinado de
 * mastiles.
 * 
 * @author Julio Cachon y Didac Fernandez 
 * @version 2018/05/09 - 10:30
 */
public class Velero extends Barco
{    
    private int mastiles;

    /**
     * Constructor de objetos de la clase Velero.
     * 
     * @param   matricula         Una cadena con la matricula del barco.
     * @param   eslora            La longitud del barco.
     * @param   anoFabricacion    El ano de fabricacion del barco.
     * @param   dueno             Un objeto de la clase Persona que representa al dueno del barco.
     */
    public Velero(String matricula,double eslora,int anoFabricacion,Persona dueno, int mastiles)
    {        
        super(matricula,eslora,anoFabricacion,dueno);
        this.mastiles = mastiles;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public double getCoeficienteBernua(){   
        return mastiles;
    }

    /**
     * Devuelve un String con los datos del velero.
     *
     * @return     Cadena con los datos. 
     */
    @Override
    public String toString()
    {
        String aDevolver = super.toString();
        aDevolver += "      Mástiles: " + mastiles + ".\n";
        return aDevolver;
    }
}
