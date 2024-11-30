import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Create and Initialise the array with six student names
        String[] allNames = {"Alice", "Bob", "Charlie", "Diana", "Eve", "Frank"};
        String[] allStudentIDs = {"S12345", "S67890", "S23456", "S34567", "S45678", "S56789"};

        // Create an array to store ExpeditionMember objects
        ExpeditionMember[] members;

        // Generate random 4 to 6 members
        Random rand = new Random();
        int numMembers = rand.nextInt(3) + 4;

        // initialise the member array with the random number of members
        members = new ExpeditionMember[numMembers];

        // To set the name and ID foe each member from the arrays
        for (int i = 0; i < numMembers; i++) {
            int randomIndex = rand.nextInt(allNames.length);
            String name = allNames[randomIndex];
            String studentID = allStudentIDs[randomIndex];

            // Assign the ExpeditionMember object to the array
            members[i] = new ExpeditionMember(name, studentID);
        }

        if (members.length >= 3) {
            ResearchExpedition pyramidExpedition = new ResearchExpedition(
                    members[0],
                    members[1],
                    members[2]
            );

            System.out.println("\nPyramid Expedition Members:");
            System.out.println("Leader: " + pyramidExpedition.getExpeditionLeaderName());
            System.out.println("Archivist: " + pyramidExpedition.getArchivistName());
            System.out.println("Field Researcher: " + pyramidExpedition.getFieldResearcherName());
        }

        if (members.length >= 3) {
            ResearchExpedition nileExpedition = new ResearchExpedition(
                    members[members.length - 3],
                    members[members.length - 2],
                    members[members.length - 1]
            );

            System.out.println("\nNile Expedition Members:");
            System.out.println("Leader: " + nileExpedition.getExpeditionLeaderName());
            System.out.println("Archivist: " + nileExpedition.getArchivistName());
            System.out.println("Field Researcher: " + nileExpedition.getFieldResearcherName());
        }

        if (ExpeditionMember.member_counter == members.length) {
            System.out.println("\nSUCCESS");
        }
    }
}
