import java.util.List;

public class Route {
    private Train train;
    private List<TrainSchedule> trainSchedules;

    public Route(Train train, List<TrainSchedule> trainSchedules){
        this.train = train;
        this.trainSchedules = trainSchedules;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public List<TrainSchedule> getTrainSchedules() {
        return trainSchedules;
    }

    public void setTrainSchedules(List<TrainSchedule> trainSchedules) {
        this.trainSchedules = trainSchedules;
    }

    @Override
    public String toString() {
        StringBuilder info = new StringBuilder();
        for(TrainSchedule t : trainSchedules) {
            info.append(t.toString() + " ");
        }
        return info.toString();
    }
}
