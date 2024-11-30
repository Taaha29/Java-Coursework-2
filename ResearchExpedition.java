public class ResearchExpedition {
    // Private fields for member roles
    private ExpeditionMember expeditionLeader;
    private ExpeditionMember archivist;
    private ExpeditionMember fieldResearcher;

    // Constructor to initialise member roles
    public ResearchExpedition(ExpeditionMember expeditionLeader, ExpeditionMember archivist, ExpeditionMember fieldResearcher) {

        // Assign roles
        this.expeditionLeader = expeditionLeader;
        this.archivist = archivist;
        this.fieldResearcher = fieldResearcher;
    }

    // Getter for ExpeditionLeader
    public String getExpeditionLeaderName() {
        return expeditionLeader.getMemberName();
    }

    // Getter for Archivist
    public String getArchivistName() {
        return archivist.getMemberName();
    }

    // Getter for fieldResearcher
    public String getFieldResearcherName() {
        return fieldResearcher.getMemberName();
    }
}
