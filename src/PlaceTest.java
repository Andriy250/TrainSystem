import org.junit.Test;

import static org.junit.Assert.*;

public class PlaceTest {

    @Test
    public void checkPlace() {
        Place place = new Place(1,1,1,1);
        boolean actual = place.checkPlace();
        assertTrue(actual);
    }
}