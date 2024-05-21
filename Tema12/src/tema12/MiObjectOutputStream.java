
package tema12;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 *
 * @author d3stroya
 */
public class MiObjectOutputStream extends ObjectOutputStream {
    
    // CONSTRUCTORES
    public MiObjectOutputStream() throws IOException, SecurityException {
        super();
    }

    public MiObjectOutputStream(OutputStream out) throws IOException {
        super(out);
    }

    // SOBREESCRIBIR MÉTODO CABECERA
    @Override
    protected void writeStreamHeader() throws IOException {
        //No hace nada
    }
    
}
