package Stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    Stack nedStack;

    @BeforeEach
    public void setUp(){
        nedStack = new Stack();
    }

    @Test
    public void newStack_isEmptyTest(){;
          assertTrue(nedStack.isEmpty());
    }
    @Test
    public void pushX_isNotEmptyTest(){
        nedStack.push(50);
        assertFalse(nedStack.isEmpty());

    }
    @Test
    public void pushX_pushY_popY_stackIsNotEmpty(){
        nedStack.push(40);
        nedStack.push(30);
        nedStack.pop();
        assertFalse(nedStack.isEmpty());
    }
    @Test
    public void pushX_popX(){
        nedStack.push(50);
        assertEquals(50, nedStack.pop());
    }
    @Test
    public void pushX_pushY_popX_popY(){
        nedStack.push(33);
        nedStack.push(21);
        assertEquals(21, nedStack.pop());
        assertEquals(33, nedStack.pop());
    }
    @Test
    public void popX() {
        assertThrows(IllegalArgumentException.class, () -> nedStack.pop());
    }
}