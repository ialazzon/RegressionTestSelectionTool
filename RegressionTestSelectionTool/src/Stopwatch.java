
public class Stopwatch {
	private final long start;

    
    public Stopwatch() {
        start = System.currentTimeMillis();
    } 


    public double stop() {
        long now = System.currentTimeMillis();
        return (now - start);
    }
}
