import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;


public class LoggerImplement {


    public static Logger log = Logger.getLogger("Pruebas Cristian Mira");

    public static void main(String[] args) {

        printLogInfo("Hola Log4j");
        printLogError("Perror errro");
    }

    /**
     * Método que imprime en log un mensaje informativo
     * @param mensaje: contiene el mensaje que se imprime en el log
     */
    public static void printLogInfo(String mensaje){

        try {
            log.info(mensaje);

        } catch (Exception e) {
            log.error(e);
        }

    }

    /**
     * Método que imprime en el log un mensaje de error
     * @param mensaje: contiene el mensaje que se imprime en el log
     */
    public static void printLogError(String mensaje){

        try {
            log.error(mensaje);

        } catch (Exception e) {

            System.out.println("Se presentó un error: "+e);
            e.printStackTrace();
        }
    }


}
