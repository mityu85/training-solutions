package introconstructors;

public class TaskMain {

    public static void main(String[] args) {

        Task task = new Task("Homework", "Do the Java project.");
        task.start();
        task.setDuration(2);
        System.out.println(task.getTitle() + "\n" + task.getDescription() + "\n" +
                task.getStartDateTime() + "\n" + task.getDuration());
    }
}
