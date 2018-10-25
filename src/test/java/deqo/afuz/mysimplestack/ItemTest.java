package deqo.afuz.mysimplestack;

import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;
public class ItemTest {

    @Test
    public void isEmpty() {
        Item i = new Item();
        assertEquals(i.getSize(),0);
        i.push(5);
        assertNotEquals(i.getSize(),0);
    }


    @Test
    public void getSize() {
        Item i = new Item();
        assertEquals(i.getSize(),0);
        Item i2 = new Item();
        i2.push(5);
        assertEquals(i2.getSize(),1);
    }

    @Test
    public void push() {
        Item i = new Item();
        i.push(3);
        assertEquals(i.peek(),3);
    }

    @Test
    public void peek() {
        Item i = new Item();
        i.push(3);
        i.push(5);
        i.push(8);
        i.push(6);
        assertEquals(i.peek(),6);
        Item i2 = new Item();
        i2.push(2);
        i2.peek();
        assertFalse(i2.isEmpty());
        assertEquals(i2.peek(),i2.pop());
    }

    @Test
    public void pop() {
        Item i = new Item();
        i.push(3);
        assertEquals(i.pop(),3);
        assertTrue(i.isEmpty());
        i.push(3);
        i.push(5);
        i.pop();
        assertFalse(i.isEmpty());
        i.pop();
        assertEquals(i.pop(),-1);
    }

// commentaire inutile
}