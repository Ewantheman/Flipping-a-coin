package Testing;

import Model.coin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class test {

    private coin testcoin;

    @Before
    public void setup() {
        testcoin = new coin("Heads");
    }


    @Test
    // check if coin initial state = Heads
    public void CheckInitialState() {
        assertEquals(testcoin.checkstate(), "Heads");
    }

    @Test
    // check if first flip works
    public void TestFirstFlip() {
        testcoin.flip();
        assertEquals(testcoin.checkstate(), "Tails");

    }

    @Test
    // check if second flip works
    public void TestSecondFlip() {
        testcoin.flip();
        assertEquals(testcoin.checkstate(), "Tails");
        testcoin.flip();
        assertEquals(testcoin.checkstate(), "Heads");
    }
}
