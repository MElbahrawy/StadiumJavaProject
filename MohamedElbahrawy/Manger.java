package MohamedElbahrawy;

public class Manger extends Person {

    protected String FirstTeam;
    protected String SecondTeam;
    protected String Tournament;
    protected String MatchDate;
    protected String MatchAt;

    public Manger() {

    }

    public Manger(String firstTeam, String secondTeam, String tournament, String matchDate, String matchAt) {
        FirstTeam = firstTeam;
        SecondTeam = secondTeam;
        Tournament = tournament;
        MatchDate = matchDate;
        MatchAt = matchAt;
    }

    public String getFirstTeam() {
        return FirstTeam;
    }

    public void setFirstTeam(String firstTeam) {
        FirstTeam = firstTeam;
    }

    public String getSecondTeam() {
        return SecondTeam;
    }

    public void setSecondTeam(String secondTeam) {
        SecondTeam = secondTeam;
    }

    public String getTournament() {
        return Tournament;
    }

    public void setTournament(String tournament) {
        Tournament = tournament;
    }

    public String getMatchDate() {
        return MatchDate;
    }

    public void setMatchDate(String matchDate) {
        MatchDate = matchDate;
    }

    public String getMatchAt() {
        return MatchAt;
    }

    public void setMatchAt(String matchAt) {
        MatchAt = matchAt;
    }

    @Override
    public String toString() {
        return "\nNext Match\n" + FirstTeam + " VS " + SecondTeam + "\n" + Tournament + "\nDate : " + MatchDate
                + "\nAt " + MatchAt + "\n---------------";
    }
}
