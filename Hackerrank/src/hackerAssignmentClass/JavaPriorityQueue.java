package hackerAssignmentClass;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

class Students {
    private final int id;
    private final String name;
    private final double cgpa;

    public Students(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCGPA() {
        return cgpa;
    }
}

class Priorities {
    
    private final PriorityQueue<Students> queue = new PriorityQueue<>(
            Comparator.comparing(Students::getCGPA).reversed()
                    .thenComparing(Students::getName)
                    .thenComparing(Students::getID));

    public List<Students> getStudents(List<String> events) {
        events.forEach((event) -> {
            if (event.equals("SERVED")) {
                queue.poll();
            } else {
                String[] details = event.split(" ");

                queue.add(new Students(Integer.parseInt(details[3]), details[1], Double.parseDouble(details[2])));
            }
        });

        List<Students> students = new ArrayList<>();
        while (!queue.isEmpty()) {
            students.add(queue.poll());
        }

        return students;
    }
}
public class JavaPriorityQueue {
    private final static Scanner scan = new Scanner(System.in);
    private final static  Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Students> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Students st : students) {
                System.out.println(st.getName());
            }
        }
    }
}



