import java.util.List;
import java.util.ArrayList;
public class Person {
    private String name;
    private int age;
    private double height;
    private String sex;
    private List<Education> education;
    private List<JobExperience> jobExperience;


    public Person(String name, int age, double height, String sex, List<Education> education, List<JobExperience> jobExperiences) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.sex = sex;
        this.education = new ArrayList<>(education);
        this.jobExperience = new ArrayList<>(jobExperiences);
    }

    public Person(Person copy) {
        this.name = copy.name;
        this.age = copy.age;
        this.height = copy.height;
        this.sex = copy.sex;
        this.education = new ArrayList<>();
        for (Education e : copy.education) {
            this.education.add(new Education(e));
        }
        this.jobExperience = new ArrayList<>();
        for (JobExperience j : copy.jobExperience) {
            this.jobExperience.add(new JobExperience(j));
        }

    }

    @Override
    public String toString() {
        return "Name: " + name + "\nAge: " + age + "\nHeight: " + height + "\nSex: " + sex + "\nEducation: " + education.toString()
                + "\nJob Experience: " + jobExperience.toString();
    }

    public void addJobExperience(JobExperience jobExperience) {
        this.jobExperience.add(jobExperience);
    }

    public void addEducation(Education education) {
        this.education.add(education);
    }
    public boolean hasJob() {
        for (JobExperience job : jobExperience) {
            if (job.getEndDate().equals("Present")) {
                return true;
            }
        }
        return false;
    }

    public boolean attendedSameSchool(Object person) {

        if (person instanceof Person) {
            Person p = (Person) person;
            for (Education myEdu : this.education) {
                for (Education otherEdu : p.education) {
                    if (myEdu.getSchool().equals(otherEdu.getSchool())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public String getName() {
        return name;
    }
public int getAge() {
    return age;
}
    public String toFileString() {
        String eduString = "";
        for (Education e : education) {
            eduString += e.toFileString() + ",";
        }

        String jobString = "";
        for (JobExperience j : jobExperience) {
            jobString += j.toFileString() + ",";
        }
        
        return name + ";" + age + ";" + height + ";" + sex + ";" + eduString + ";" + jobString;
    }
}
