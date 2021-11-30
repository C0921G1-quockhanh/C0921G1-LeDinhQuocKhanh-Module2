package ss23_behavioral_design_pattern.bai3;

public class BinObserver extends Observer {
    public BinObserver(Subject subject) {
        this.subject = subject;
        this.subject.add(this);
    }

    @Override
    public void update() {
        System.out.println(" " + Integer.toBinaryString(subject.getState()));
    }
}
