import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Date;
public class Main {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        // System.out.println("Your name: ");
        // String name = input.nextLine();
        // System.out.println("Your age: ");
        // int age = input.nextInt();
        // System.out.println("Your height: ");
        // double height = input.nextDouble();
        // System.out.println("Your sex: ");
        // String sex = input.next();
        // System.out.println("Your degree: ");
        // String degree = input.next();
        // System.out.println("Your major: ");
        // String major = input.next();
        // System.out.println("Your school: ");
        // String school = input.next();
        // System.out.println("Your graduation year: ");
        // int gradYear = input.nextInt();
        // System.out.println("Your job title: ");
        // String jobTitle = input.next();
        // System.out.println("Your company: ");
        // String company = input.next();
        // System.out.println("Your start date: ");
        // String startDate = input.next();
        // System.out.println("Your end date: ");
        // String endDate = input.next();
        // Education edu1 = new Education(degree, major, school, gradYear);
        // JobExperience job1 = new JobExperience(jobTitle, company, startDate, endDate);

        String name = "Sasa";
        int age = 18;
        double height = 6.1;
        String sex = "male";
        Education edu1 = new Education("Bachelor of Science", "Computer Science", "University of XYZ", 2020);
        JobExperience job1 = new JobExperience("Software Engineer", "ABC Corporation", "2022-01-01", "2023-01-01");
        List<Education> educationList = new ArrayList<>();
        educationList.add(edu1);

        List<JobExperience> jobList = new ArrayList<>();
        jobList.add(job1);

        Person original = new Person(name, age, height, sex, educationList, jobList);
       
// FileRepository.savePeopleToFile(original,original.getName() + original.getAge() + ".txt");

        List<Person> people = FileRepository.loadPeopleFromFile(original.getName() + original.getAge() + ".txt");
       
            System.out.println(people);
    }
}
