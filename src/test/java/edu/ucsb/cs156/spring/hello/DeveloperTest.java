package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import org.junit.jupiter.api.Test;

public class DeveloperTest {

    @Test
    public void testPrivateConstructor() throws Exception {
        // this hack is from https://www.timomeinen.de/2013/10/test-for-private-constructor-to-get-full-code-coverage/
        Constructor<Developer> constructor = Developer.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()),"Constructor is not private");

        constructor.setAccessible(true);
        constructor.newInstance();
    }

    @Test
    public void getName_returns_correct_name() {
        assertEquals("Anthony W.", Developer.getName());
    }

    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)

    @Test
    public void getGithubId_returns_correct_githubId() {
        assertEquals("anthonywong461", Developer.getGithubId());
    }
    @Test
    public void getTeam_returns_team_with_correct_name() {
        Team  t = Developer.getTeam();
        assertEquals("f25-04", t.getName());
    }

    @Test
    public void getTeam_returns_team_with_correct_members() {
        Team  t = Developer.getTeam();
        assertTrue(t.getMembers().contains("AJAY"),"Team should contain Ajay P.");
        assertTrue(t.getMembers().contains("CHIRAN"),"Team should contain Chiran A.");
        assertTrue(t.getMembers().contains("ANTHONY HERBERT"),"Team should contain Anthony W.");
        assertTrue(t.getMembers().contains("DAVE S"),"Team should contain Dave B.");
        assertTrue(t.getMembers().contains("MAX LEE"),"Team should contain Max C.");
        assertTrue(t.getMembers().contains("RYAN LEE"),"Team should contain Ryan H.");
        // ... etc
    }


}
