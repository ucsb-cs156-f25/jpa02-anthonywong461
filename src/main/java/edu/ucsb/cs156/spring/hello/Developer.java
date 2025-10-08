package edu.ucsb.cs156.spring.hello;

/**
 * A class with static methods to provide information about the developer.
 */

public class Developer {

    // This class is not meant to be instantiated
    // so we make the constructor private

    private Developer() {}
    
    /**
     * Get the name of the developer
     */

    public static String getName() {
        return "Anthony W.";
    }

    /**
     * Get the github id of the developer
     * @return github id of the developer
     */

    public static String getGithubId() {
        return "anthonywong461";
    }

    /**
     * Get the developers team
     * @return developers team as a Java object
     */
    
    public static Team getTeam() {
        // TODO: Change this to your team name
        Team team = new Team("f25-04");
        team.addMember("Ajay P.");
        team.addMember("Chiran A.");
        team.addMember("Anthony W.");
        team.addMember("Dave B.");
        team.addMember("Max C.");
        team.addMember("Ryan H.");
        return team;
    }
}
