package deqo.afuz.mysimplestack;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class Item implements SimpleStack {


    private int size;
    private ArrayList<Integer> pile;

    public Item() {
        this.size = 0;
        this.pile = new ArrayList<Integer>(size);
    }



    public boolean isEmpty() {
        return this.getSize() == 0;
    }


    public int getSize() {
        return this.size;
    }



    public void push(int e) {
        this.size += 1;
        this.pile.add(e);
    }


    public int peek() throws EmptyStackException {
        return pile.get(this.size-1);
    }


    public int pop() throws EmptyStackException {
        if(this.size != 0) {
            int tete = pile.get(size - 1);
            this.pile.remove(size - 1);
            this.size -= 1;
            return tete;
        }
        else{
            return -1;
        }
    }
}
