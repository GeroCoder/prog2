package probeklausur.aufgabe1;

import java.io.IOException;
import java.io.OutputStream;

public interface CanWriteToStream {

    public void writeToStream(OutputStream outputStream)throws IOException;
}
