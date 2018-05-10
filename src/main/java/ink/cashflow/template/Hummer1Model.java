package ink.cashflow.template;

public class Hummer1Model extends HummerModel {

    private boolean alarmFlag = true; // 是否要响喇叭

    @Override
    protected void start() {

    }

    @Override
    protected void stop() {

    }

    @Override
    protected void alarm() {

    }

    @Override
    protected void engineBoom() {

    }

    @Override
    protected boolean isAlarm() {
        return this.alarmFlag;
    }

    public void setAlarmFlag(boolean isAlarm) {
        this.alarmFlag = isAlarm;
    }

}
