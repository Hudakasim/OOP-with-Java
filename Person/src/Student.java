public class Student extends Person {
    private String studyLevel;
    private String specialization;
    private double GPA;

    public Student(){
        System.out.println("The the subclass constructor");
    }
    public Student(String name, int a, String ad, String nat  , String s, String sp, double gpa){
        super(name, a, ad, nat);
        studyLevel = s;
        specialization = sp;
        GPA = gpa;
    }

    public void setStudyLevel(String studyLevel) {
        this.studyLevel = studyLevel;
    }
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    public void setGPA(float GPA) {
        this.GPA = GPA;
    }

    public String getStudyLevel() {
        return studyLevel;
    }
    public String getSpecialization() {
        return specialization;
    }
    public double getGPA() {
        return GPA;
    }
}
