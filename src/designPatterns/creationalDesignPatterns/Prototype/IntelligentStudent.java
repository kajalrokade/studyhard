package src.designPatterns.creationalDesignPatterns.Prototype;

public class IntelligentStudent extends Student {

    private int iq;
    private double intelligenceScore;

    public double getIntelligenceScore() {
        return intelligenceScore;
    }

    public void setIntelligenceScore(double intelligenceScore) {
        this.intelligenceScore = intelligenceScore;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    IntelligentStudent() {

    }
    IntelligentStudent(IntelligentStudent student) {
        super(student);
        this.iq = student.iq;
        this.intelligenceScore = student.intelligenceScore;
    }

    @Override
    public IntelligentStudent clone() {
      return new IntelligentStudent(this);
    }
}
