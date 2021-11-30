package ss23_behavioral_design_pattern.bai3;

public class OctObserver extends Observer{
    public OctObserver(Subject subject) {
        this.subject = subject;
        this.subject.add(this);
    }

    @Override
    public void update() {
        System.out.println(" " + Integer.toOctalString(subject.getState()));
    }
}
