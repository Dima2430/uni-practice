import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileRepository {
    public static List<Person> loadPeopleFromFile(String filename) {
    List<Person> people = new ArrayList<>();

    try (Scanner scanner = new Scanner(new File(filename))) {
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] tokens = line.split(";", -1);

            String name = tokens[0];
            int age = Integer.parseInt(tokens[1]);
            double height = Double.parseDouble(tokens[2]);
            String sex = tokens[3];

            List<Education> educationList = new ArrayList<>();
            if (!tokens[4].isEmpty()) {
                String[] eduTokens = tokens[4].split(",");
                for (String edu : eduTokens) {
                    educationList.add(new Education(edu));
                }
            }

            List<JobExperience> jobList = new ArrayList<>();
            if (!tokens[5].isEmpty()) {
                String[] jobTokens = tokens[5].split(",");
                for (String job : jobTokens) {
                    jobList.add(new JobExperience(job));
                }
            }

            people.add(new Person(name, age, height, sex, educationList, jobList));
        }
    } catch (Exception e) {
        System.err.println("Failed to load people: " + e.getMessage());
        e.printStackTrace();
    }

    return people;
}
public static void savePeopleToFile(Person person, String filename) {
    try (java.io.PrintWriter writer = new java.io.PrintWriter(new File(filename))) {
       
            writer.println(person.toFileString());
        
    } catch (Exception e) {
        System.err.println("Failed to save people: " + e.getMessage());
        e.printStackTrace();
    }
}
}
