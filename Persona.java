/**
 * Clase que representa un cliente. Los clientes se representan por medio de su
 * nombre y DNI.
 * 
 * @author Julio Cachon y Didac Fernandez 
 * @version 2018/05/09 - 10:30
 */
public class Persona
{
    private String nombre;
    private String dni;

    /**
     * Constructor for objects of class Persona
     */
    public Persona(String nombre, String dni)
    {
        this.nombre = nombre;
        this.dni = dni;
    }

    /**
     * Devuelve un String con los datos de la Persona.
     *
     * @return     Cadena con los datos. 
     */
    public String toString()
    {
        String aDevolver = "";
        aDevolver += "  Dueño: " + nombre + ".\n";
        aDevolver += "  DNI: " + dni + ".\n";
        return aDevolver;
    }
}
