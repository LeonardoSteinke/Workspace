package Po;

public class Radar {
    private int velocidadeMaxima;
    private SensorVelocidade sensor;
    public void velocidadeMaxima(double s, int v){
    		if (s > v) {
				System.out.print("Multa");
				if (s> v*1.5) {
					System.out.print(" gravíssima x3");
				} else if (s > v*1.2) {
					System.out.println(" grave");
				} else if (s> v){
					System.out.println(" média");
				}
			} else{ 
				System.out.println("Pode passar");
			}
    }
    public SensorVelocidade getSensor(){
    		return sensor;
    }
    public void setSensor(SensorVelocidade s){
        this.sensor = s;
    }
    
}

