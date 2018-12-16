import java.util.Comparator;

public class TrainScheduleComparator implements Comparator<TrainSchedule> {
    @Override
    public int compare(TrainSchedule o1, TrainSchedule o2) {
        if (!o2.getArrivalTime().after(o1.getArrivalTime())) return 1;
        else if (!o2.getArrivalTime().before(o1.getArrivalTime())) return -1;
        return 0;
    }
}
