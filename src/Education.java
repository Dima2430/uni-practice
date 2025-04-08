public class Education {
    private String degree;
    private String major;
    private String school;
    private int gradYear;

    public Education(String degree, String major, String school, int gradYear) {
        this.degree = degree;
        this.major = major;
        this.school = school;
        this.gradYear = gradYear;
    }

    public Education(Education copy) {
        this.degree = copy.degree;
        this.major = copy.major;
        this.school = copy.school;
        this.gradYear = copy.gradYear;
    }

    public Education(String line) {
        String[] parts = line.split("-");
        this.school = parts[0];
        this.degree = parts[1];
        this.major = parts[2];
        this.gradYear = Integer.parseInt(parts[3]);
    }
    @Override
    public String toString() {
        return "Degree: " + degree + "\nMajor: " + major + "\nSchool: " + school + "\nGraduation Year: " + gradYear;
    }

    public String getSchool() {
        return school;
    }
}
