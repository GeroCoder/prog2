package probeklausur.aufgabe1;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class Computer extends AbstractTechnicalDevice implements CanWriteToStream{

    private long cpuClocking;


    public Computer(String name, double voltage, double electricity, int lifeSpan, long cpuClocking) {
        super(name, voltage, electricity, lifeSpan);
        this.cpuClocking = cpuClocking;
    }

    public long getCpuClocking() {
        return cpuClocking;
    }

    public void setCpuClocking(long cpuClocking) {
        this.cpuClocking = cpuClocking;
    }

    @Override
    public double getValue() {
        return getCpuClocking() / 2;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Computer{" +
                "cpuClocking=" + cpuClocking +
                '}';
    }

    @Override
    public void writeToStream(OutputStream outputStream) throws IOException {
        byte[] byteObject = this.toString().getBytes(StandardCharsets.UTF_8);
        outputStream.write(byteObject);
        outputStream.write(10);
    }
}
