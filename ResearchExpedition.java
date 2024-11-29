public class ResearchExpedition {
    private ExpeditionMember expeditionLeader;
    private ExpeditionMember archivist;
    private ExpeditionMember fieldResearcher;

    public ResearchExpedition(ExpeditionMember expeditionLeader, ExpeditionMember archivist, ExpeditionMember fieldResearcher) {
        if (expeditionLeader == null) {
            throw new IllegalArgumentException("Expedition Leader cannot be empty");
        }
        if (archivist == null) {
            throw new IllegalArgumentException("Archivist cannot be empty");
        }
        if (fieldResearcher == null) {
            throw new IllegalArgumentException("Field Researcher cannot be empty");
        }

        this.expeditionLeader = expeditionLeader;
        this.archivist = archivist;
        this.fieldResearcher = fieldResearcher;
    }

    public String getExpeditionLeaderName() {
        return expeditionLeader.getMemberName();
    }

    public String getArchivistName() {
        return archivist.getMemberName();
    }

    public String getFieldResearcherName() {
        return fieldResearcher.getMemberName();
    }
}
