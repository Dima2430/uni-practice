public class JobExperience {
    private String jobTitle;
    private String company;
    private String startDate;
    private String endDate;

    public JobExperience(String jobTitle, String company, String startDate, String endDate) {
        this.jobTitle = jobTitle;
        this.company = company;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public JobExperience(JobExperience copy) {
        this.jobTitle = copy.jobTitle;
        this.company = copy.company;
        this.startDate = copy.startDate;
        this.endDate = copy.endDate;
    }
    public JobExperience(String line) {
        String[] parts = line.split("-");
        this.company = parts[0];
        this.jobTitle = parts[1];
        this.startDate = parts[2];
        this.endDate = parts[3];
    }
    @Override
    public String toString() {
        return "Job Title: " + jobTitle + "\nCompany: " + company + "\nStart Date: " + startDate + "\nEnd Date: "
                + endDate;
    }
    public String getEndDate() {
        return endDate;
    }
}
