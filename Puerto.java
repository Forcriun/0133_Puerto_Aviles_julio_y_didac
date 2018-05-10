/**
 * Clase que representa un puerto con un numero predeterminado de amarres.
 * 
 * Los amarres pueden ser alquilados por clientes para ocuparlos con barcos de su
 * propiedad.
 * 
 * @author Julio Cachon y Didac Fernandez 
 * @version 2018/05/09 - 10:30
 */
public class Puerto
{
    private static final int NUMERO_AMARRES = 4;
    private Alquiler[] amarres;

    /**
     * Constructor for objects of class Puerto
     */
    public Puerto()
    {
        amarres = new Alquiler[NUMERO_AMARRES];
    }

    /**
     * Metodo que muestra los datos de alquiler de los amarres ocupados. 
     */
    public void verEstadoAmarres()
    {
        for(int i = 0; i < amarres.length;i++){
            if(amarres[i] != null){
                System.out.println(amarres[i] + "\n");
            }
            else{
                System.out.println("El amarre " + i + " está libre.\n");                
            }
        }
    }

    /**
     * Metodo que simula el alquiler de un amarre del puerto. Primero comprueba
     * que haya amarres libres. De haberlos, alquila el primer amarre libre y 
     * devuelve el coste de alquiler. En caso de no haber amarres libres devuelve -1.
     * 
     * @param   dias    El numero de dias por el que se alquila el amarre.
     * @param   barco   El barco para el que se alquila el amarre.
     * @return  -1 si no hay amarres libres. El precio de alquiler en caso contrario.
     */
    public double alquilarAmarre(int dias,Barco barco)
    {
        double aDevolver = -1;
        int amarreActual = 0;
        boolean buscando = true;

        while(amarreActual < amarres.length && buscando){
            if(amarres[amarreActual] == null){
                amarres[amarreActual] = new Alquiler(dias,barco,amarreActual);
                aDevolver = amarres[amarreActual].getPrecio();
                buscando = false;
            }
            amarreActual++;
        }

        return aDevolver;
    }

    /**
     * Metodo que simula la liquidacion del alquiler de un amarre del puerto.
     * Comprueba el amarre indicado por parametro este alquilado y lo deja libre,
     * devolviendo el coste del alquiler. En caso contrario devuelve -1.
     * 
     * @param   numAmarre    El numero del amarre del puerto a liquidar.
     * @return  -1 si no se puede completar la transaccion. El precio de alquiler en caso contrario.
     */
    public double liquidarAlquilerAmarre(int numAmarre)
    {
        double aDevolver = -1;

        if(numAmarre <= amarres.length){
            if(amarres[numAmarre] != null){
                aDevolver = amarres[numAmarre].getPrecio();
                amarres[numAmarre] = null;
            }
        }
        else{
            System.out.println("El amarre indicado no existe. Introduzca un número entre 1 y 4.\n");
        }

        return aDevolver;
    }

    /**
     * Devuelve un String con los datos del puerto.
     *
     * @return     Cadena con los datos. 
     */
    public String toString()
    {
        String aDevolder = "";
        return aDevolder;
    }
}
