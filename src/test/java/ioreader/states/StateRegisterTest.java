package ioreader.states;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StateRegisterTest {

    private StateRegister stateRegister = new StateRegister();


    @Test
    public void testGetStates(){
        assertEquals(0,stateRegister.getStates().size());
        stateRegister.getStates().add(new State("New York","Albany"));
        assertEquals(0,stateRegister.getStates().size());
    }


    @Test
    public void testReadFile(){
        assertEquals(0,stateRegister.getStates().size());

        stateRegister.readStatesFromFile("src/main/resources/stateregister.txt");

        assertEquals(50,stateRegister.getStates().size());
        assertEquals("Wyoming",stateRegister.getStates().get(49).getStateName());
    }



    @Test
    public void findCapitalByStateNameTest(){
        stateRegister.readStatesFromFile("src/main/resources/stateregister.txt");

        assertEquals("Albany",stateRegister.findCapitalByStateName("New York"));
        assertEquals("Juneau",stateRegister.findCapitalByStateName("Alaska"));

    }
}
