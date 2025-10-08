package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

   
    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)
    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }

    //true
    @Test
    public void equals_returnsTrueForSameNameAndMembers() {
        Team t1 = new Team();
        t1.setName("foo");
        t1.addMember("bar");
        t1.addMember("bar2");

        Team t2 = new Team();
        t2.setName("foo");
        t2.addMember("bar");
        t2.addMember("bar2");
        assertEquals(true, t1.equals(t2));
        assertEquals(t1.hashCode(), t2.hashCode()); // hashCode consistent
    }

    @Test
    public void equals_Test() {
        Team t1 = new Team();
        t1.setName("foo");
        t1.addMember("bar");
        assertEquals(t1.equals(t1), true);
    }

    @Test
    public void equals_Test3() {
        Team t1 = new Team();
        t1.setName("foo");
        t1.addMember("foo");
        Team t2 = new Team();
        t2.setName("foo");
        t2.addMember("bar");
        assertEquals(t1.equals(t2), false);
    }

    @Test
    public void equals_Test2() {
        Team t1 = new Team("foo");
        t1.addMember("bar");

        Team t2 = new Team("bar");
        t2.addMember("foo");


        assertEquals(t1.equals(t2),false);
    }

@Test
public void equals_returnsFalseForNull() {
    Team t1 = new Team("foo");
    assertEquals(t1.equals(null),false);  // null is not a Team
}

    @Test
    public void hashCode_returnsExpectedValue() {
        Team t = new Team();
        t.setName("foo");
        t.addMember("bar");
        int expected = t.name.hashCode() | t.getMembers().hashCode();
        assertEquals(expected, t.hashCode());
    }


}
