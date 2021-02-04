package collectionsqueue.collectionsdeque;

import collectionsqueue.collectionspriorityqueue.Job;
import collectionsqueue.collectionspriorityqueue.NoJobException;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class JobQueue {

    public Deque<Job> addJobByUrgency(Job... jobs) {
        Deque<Job> jobDeque = new ArrayDeque<>(Arrays.asList(jobs));
        for (Job j: jobDeque) {
            if (j.isUrgent()) {
                jobDeque.addFirst(j);
            } else {
                jobDeque.addLast(j);
            }
        }
        return jobDeque;
    }

    public Job dispatchUrgentJob(Deque<Job> jobs) throws NoJobException {
        if (jobs.isEmpty()) {
            throw new NoJobException("No job available, get a rest!");
        }
        return jobs.getFirst();
    }

    public Job dispatchNotUrgentJob(Deque<Job> jobs) throws NoJobException {
        if (jobs.isEmpty()) {
            throw new NoJobException("No job available, get a rest!");
        }
        return jobs.getLast();
    }
}
