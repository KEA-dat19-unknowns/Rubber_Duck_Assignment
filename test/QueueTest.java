import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {
    ArrayList<Duck> duckListA = new ArrayList<>();
    ArrayList<Duck> duckListB = new ArrayList<>();
    ArrayList<Duck> duckListC = new ArrayList<>();
    ArrayList<Duck> duckListD = new ArrayList<>();


    @BeforeEach
    void loadInQueues(){
        for(int i = 1; i<=10; i++){
            Duck tempA = new Duck(i, "A" + i);
            duckListA.add(tempA);

            Duck tempB = new Duck(i, "B" + i);
            duckListB.add(tempB);

            Duck tempC = new Duck(i, "C" + i);
            duckListC.add(tempC);

            Duck tempD = new Duck(i, "D" + i);
            duckListD.add(tempD);
        }

        assertEquals(duckListA.size(), 10);
        assertEquals(duckListB.size(), 10);
        assertEquals(duckListC.size(), 10);
        assertEquals(duckListD.size(), 10);

    }


    @Test
    void Queue(){
        assertEquals(duckListA.get(0).getName(),"A1");
        assertEquals(duckListA.size(), 10);

        Duck tempA11 = new Duck(11, "A11");
        duckListA.add(tempA11);
        assertEquals(duckListA.get(10).getName(), "A11");
        duckListA.remove(0);
        assertEquals(duckListA.get(0).getName(), "A2");
        assertEquals(duckListA.size(), 10);

    }


}