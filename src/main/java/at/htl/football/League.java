public class League {

    private List<Team> teams = new ArrayList<>();
    Team team = new Team();

    public void addMatchResults(Match match) {
        Team homeTeam = findOrCreateTeam(match.getHomeName());
        homeTeam.addMatch(match);
        Team guestTeam = findOrCreateTeam(match.getGuestName());
        guestTeam.addMatch(match);
    }

    private Team findOrCreateTeam(String team) {
        for (int i = 0; i < teams.size(); i++) {
            if (teams.get(i).equals(team)) {
                return teams.get(i);
            }
        }
        Team team1 = new Team(team);
        teams.add(team1);
        return teams.get(teams.size() - 1);
    }

    public List<Team> getTable(){
        for(int i = 0; i < teams.size(); i++){
            System.out.printf(teams.get(i).getName() + " \t\t\t   " + teams.get(i).getPoints() + "\t" + teams.get(i).getDraws()+ "\t" + teams.get(i).getDefeats() + "\t" + teams.get(i).getGoalsShot()+ "\t" + teams.get(i).getGoalsReceived()  + "%n");        }
    }
}
