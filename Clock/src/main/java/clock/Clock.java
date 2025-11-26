package clock;

public class Clock {

	//atributos
	private String currentTime;
	private boolean alarmState;
	
	//constructor
	public Clock(String currentTime, boolean alarmState) {
		super();
		this.currentTime = currentTime;
		this.alarmState = alarmState;
	}
	
	//metodos
	
	public String getTime () {
		return currentTime;
	}
	
	public void setTime(String currentTime) {
		this.currentTime=currentTime;
	}
	
	public void setAlarm(boolean state) {
		this.alarmState=state;
		if (state) {
			System.out.println("Alarma activada");
		}else {
			System.out.println("Alarma desactivada");
		}	
	}
	 public void turnAlarmOff() {
		 this.alarmState=false;
		 System.out.println("Alarma apagada");
	 }
}
