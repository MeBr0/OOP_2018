package fourth;

public class Runner implements Runnable {
    private double speed;

    public Runner(double speed){
        this.speed = speed;
    }

    public void setSpeed(double speed) { this.speed = speed; }
    public double getSpeed() { return speed; }

    @Override
    public boolean isMoving() {
        return speed  < 5;
    }

    @Override
    public boolean isRunning() {
        return speed > 5;
    }

    @Override
    public double getVelocity() {
        if (speed > 5) return speed / RUN_COEF;

        else return speed / MOV_COEF;
    }
}
