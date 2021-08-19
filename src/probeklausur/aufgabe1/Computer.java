package probeklausur.aufgabe1;

//TODO implement the method writeToStream() correctly

import java.io.OutputStream;

public class Computer extends AbstractTechnicalDevice implements CanWriteToStream {

    private long cpuClocking;

    public Computer(String name, double voltage, double electicity, int lifeSpanInYears, long cpuClocking) {
        super(name, voltage, electicity, lifeSpanInYears);
        this.cpuClocking = cpuClocking;
    }

    public long getCpuClocking() {
        return cpuClocking;
    }

    public void setCpuClocking(long cpuClocking) {
        this.cpuClocking = cpuClocking;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Computer{" +
                "cpuClocking=" + cpuClocking +
                '}';
    }

    @Override
    public double getValue() {
        return getCpuClocking() / 2.0;
    }

    @Override
    public void writeToStream(OutputStream outputStream) {

    }
}
