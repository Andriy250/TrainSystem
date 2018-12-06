import java.util.List;

public class Route {
    private Train train;
    private List<TrainSchedule> trainSchedules;

    public Route(Train train, List<TrainSchedule> trainSchedules){
        this.train = train;
        this.trainSchedules = trainSchedules;
    }

    @Override
    public String toString() {
        StringBuilder info = new StringBuilder();
       // info.append(train.toString() + " ");
        for(TrainSchedule t : trainSchedules) {
            info.append(t.toString() + " ");
        }
        return info.toString();
    }
}
