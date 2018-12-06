public class Route {
    private Train train;
    private TrainSchedule[] trainSchedules;

    public Route(Train _train, TrainSchedule[] _trainSchedules){
        train = _train;
        trainSchedules = _trainSchedules;
    }

    @Override
    public String toString() {
        StringBuilder info = new StringBuilder();
        info.append(train.toString() + " ");
        for(TrainSchedule t : trainSchedules) {
            info.append(t.toString() + " ");
        }
        return info.toString();
    }
}
