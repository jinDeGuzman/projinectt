import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DragonTest
{
    @Test
    void typeDragRegexPass()
    {
        Dragon jin = new Dragon();
        jin.setDragType("Blue_1");
        assertTrue(jin.getDragType().matches("Blue_1"));
    }

    @Test
    void typeDragRegexFailNoFirstCap()
    {
        Dragon jin = new Dragon();
        jin.setDragType("blue_1");
        assertTrue(jin.getDragType().matches("Are you dumb"));
    }

    @Test
    void typeDragRegexFailCapsAfterFirst()
    {
        Dragon jin = new Dragon();
        jin.setDragType("BlUe_1");
        assertTrue(jin.getDragType().matches("Are you dumb"));
    }

    @Test
    void typeDragRegexFailNoUnderScore()
    {
        Dragon jin = new Dragon();
        jin.setDragType("Blue1");
        assertTrue(jin.getDragType().matches("Are you dumb"));
    }

    @Test
    void typeDragRegexFailLetterAtEnd()
    {
        Dragon jin = new Dragon();
        jin.setDragType("Blue_C");
        assertTrue(jin.getDragType().matches("Are you dumb"));
    }

    @Test
    void typeDragRegexFailSpecialLetterAtEnd()
    {
        Dragon jin = new Dragon();
        jin.setDragType("Blue_$");
        assertTrue(jin.getDragType().matches("Are you dumb"));
    }

    @Test
    void typeDragRegexFailNumberOutOfBounds()
    {
        Dragon jin = new Dragon();
        jin.setDragType("Blue_11");
        assertTrue(jin.getDragType().matches("Are you dumb"));
    }

    @Test
    void typeDragRegexFailSpaceInName()
    {
        Dragon jin = new Dragon();
        jin.setDragType("Red Green_1");
        assertTrue(jin.getDragType().matches("Are you dumb"));
    }

    @Test
    void dragPowerPass()
    {
        Dragon jin = new Dragon();
        jin.setDragPower(8);
        assertTrue(jin.getDragPower()==8);
    }

    @Test
    void dragPowerFailGreaterThan10()
    {
        Dragon jin = new Dragon();
        jin.setDragPower(11);
        assertTrue(jin.getDragPower()==-10);
    }
    @Test
    void dragPowerFailLessThan0()
    {
        Dragon jin = new Dragon();
        jin.setDragPower(-1);
        assertTrue(jin.getDragPower()==-10);
    }
    @Test
    void namePass()
    {
        Dragon jin = new Dragon();
        jin.setName("Jin");
        assertTrue(jin.getName().matches("Jin"));
    }
    @Test
    void nameRegexWorks()
    {
        Dragon jin = new Dragon();
        jin.setName("Jin");
        assertTrue(jin.getName().matches("Jin"));
    }
    @Test
    void nameRegexFailsNoCaps()
    {
        Dragon jin = new Dragon();
        jin.setName("jin");
        assertTrue(jin.getName().matches("Are you dumb"));
    }
    @Test
    void nameRegexFailsCapsAfterFirst()
    {
        Dragon jin = new Dragon();
        jin.setName("JIN");
        assertTrue(jin.getName().matches("Are you dumb"));
    }

    @Test
    void nameRegexFailsNonAlphabet()
    {
        Dragon jin = new Dragon();
        jin.setName("J2n");
        assertTrue(jin.getName().matches("Are you dumb"));
    }
}