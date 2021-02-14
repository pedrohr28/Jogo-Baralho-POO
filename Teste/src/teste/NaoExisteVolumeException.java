
package teste;
/**
 *
 * @author Casa
 */
public class NaoExisteVolumeException extends Exception
{
    //trata erro quando não é possível calcular volume inexistente
    @Override
    public String getMessage()
    {
        return "Não existe volume para esta forma";
    }
    
}           