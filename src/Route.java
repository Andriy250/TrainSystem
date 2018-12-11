import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Route {
    private Train train;
    private LinkedList<TrainSchedule> trainSchedules;

    public Route(Train train, LinkedList<TrainSchedule> trainSchedules){
        this.train = train;
        this.trainSchedules = trainSchedules;
    }



    public boolean checkRoute(String currentStation, String chosenStation, Date arrivalDate){
        boolean isCur=false,isChosen = false;
        TrainSchedule currentArrival = null; //trainSchedules.get(0);
        for (TrainSchedule trSh : trainSchedules){
            isCur = (trSh.getStation().getName().equals(currentStation)) ? true : isCur;
            isChosen = (trSh.getStation().getName().equals(chosenStation)) ? true : isChosen;
            if (isCur && isChosen) currentArrival = trSh;
        }
        if ((currentArrival != null) && (arrivalDate.after(currentArrival.getArrivalTime()))
                && (arrivalDate.before(currentArrival.getDepartureTime()))) {
            return true;
        }
        return false;
    }


    public String showPathToStation(String currentStation,String chosenStation){
        ListIterator iterator = trainSchedules.listIterator();
        StringBuilder stations = new StringBuilder();
        boolean pathStart = false;
        while((iterator.hasNext())){
            if((((TrainSchedule)iterator.next()).getStation().getName().equals(currentStation))){
                stations.append(currentStation + ((!pathStart)?"-":""));
                pathStart = !pathStart;
            } else if ((((TrainSchedule)iterator.next()).getStation().getName().equals(chosenStation))) {
                stations.append(chosenStation + ((!pathStart)?"-":""));
                pathStart = !pathStart;
            }
            if (pathStart) stations.append(((TrainSchedule) iterator.next()).getStation().getName() + "-");
            else break;
        }
        return stations.toString();
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

    public void setTrainSchedules(LinkedList<TrainSchedule> trainSchedules) {
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
