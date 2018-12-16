import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class RouteTest {

    @org.junit.Test
    public void checkRoute() {

        //=============create Train============//
        Train train = new Train(1);
        Wagon wagon = new Wagon(train.getTrainId(), WagonType.PLATZKART, 1);

        //===========create trainSchedule===========//
        Date time = new Date();
        Station station = new Station("Lviv");
        Station station2 = new Station("Kyiv");

        TrainSchedule trainSchedule = new TrainSchedule(station,new Date(time.getTime()),new Date(time.getTime()));
        TrainSchedule trainSchedule2 = new TrainSchedule(station2,new Date(time.getTime()),new Date(time.getTime()));

        LinkedList<TrainSchedule> trainSchedules = new LinkedList<>();
        trainSchedules.add(trainSchedule);
        trainSchedules.add(trainSchedule2);
        //==================create customers================//
        Customer vova = new Customer("Vova");
        List<Customer> customers = new ArrayList<>();
        customers.add(vova);
        //===============create route===================//
        Route route = new Route(train, trainSchedules);

        boolean actual=route.checkRoute(station.getName(),station2.getName(), new Date(time.getTime()));
        boolean expected = true;
        assertEquals(expected,actual);

    }
}