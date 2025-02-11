package academy.javapro;

public class Tesla extends Vehicle implements Electric, Autonomous {
    private boolean autopilotEnabled;
    private boolean charging;

    public Tesla(String model, int year) {
        super("Tesla", model, year);
        this.autopilotEnabled = false;
        this.charging = false;
    }
    
    public void startEngine() {
        this.isRunning = true;
        System.out.println(this.make + " " + this.model + " " + "Engine started");
    }

    public void stopEngine() {
        this.isRunning = false;
        System.out.println(this.make + " " + this.model + " " + "Engine stopped");
    }

    public void accelerate() {
        System.out.println(this.make + " " + this.model + " " + "is Accelerating");
    }

    public void brake() {
        System.out.println(this.make + " " + this.model + " " + "is Braking");
    }

    public void enableAutopilot() {
        this.autopilotEnabled = true;
        System.out.println("Autopilot enabled");
    }

    public void disableAutopilot() {
        this.autopilotEnabled = false;
        System.out.println("Autopilot disabled");
    }

    public boolean isAutopilotEnabled() {
           
        return this.autopilotEnabled;
    }

    public void charge() {
        this.charging = true;
        System.out.println(this.make + " " + this.model + " " + "is charging");
    }

    public boolean isCharging() {
        return this.charging;
    }


}
