package rank_teams_by_votes;

import java.util.*;

public class RankTeams {
    public String rankTeams(String[] votes) {
        if(votes.length == 1){
            return votes[0];
        }

        Map<Character, int[]> votesMap = new HashMap<>();

        int numTeams = votes[0].length();
        for(String vote: votes){
            for(int i = 0; i < vote.length(); i++){
                char team = vote.charAt(i);
                if(!votesMap.containsKey(team)){
                    votesMap.put(team, new int[numTeams]);
                }
                votesMap.get(team)[i]++;
            }
        }

        List<Character> teams = new ArrayList<>(votesMap.keySet());

        Collections.sort(teams, new Comparator<Character>() {
            @Override
            public int compare(Character a, Character b) {
                int[] votesA = votesMap.get(a);
                int[] votesB = votesMap.get(b);

                for(int i = 0; i < numTeams; i++){
                    if(votesA[i] > votesB[i]){
                        return votesB[i] - votesA[i];
                    }
                }
                return a - b;
            }

        });

        StringBuilder result = new StringBuilder();
        for(char team : teams){
            result.append(team);
        }

        return result.toString();


    }
}
