package br.com.findaplayer.service;

import br.com.findaplayer.client.FootballDataOrgClient;
import br.com.findaplayer.exception.TeamNotFoundException;
import br.com.findaplayer.model.Player;
import br.com.findaplayer.model.Team;
import br.com.findaplayer.model.dto.CompetitionResponse;
import br.com.findaplayer.model.dto.ShortTeamsResponse;
import br.com.findaplayer.model.dto.SingleCompetitionResponse;
import br.com.findaplayer.model.dto.TeamsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FootballService {

    @Autowired
    private FootballDataOrgClient footballDataOrgClient;

    public CompetitionResponse getAllCompetitions() {
        return footballDataOrgClient.getCompetitions();
    }

    public SingleCompetitionResponse getCompetition(String competitionCode) {
        return footballDataOrgClient.getCompetition(competitionCode);
    }

    public TeamsResponse getTeamsInCompetition(String competitionCode) {
        return footballDataOrgClient.getTeams(competitionCode);
    }

    public Team getSingleTeam(String competitionCode, Integer teamId) {
        var idTeamInLeague = getIdTeamInLeague(competitionCode, teamId);
        return footballDataOrgClient.getSingleTeam(idTeamInLeague);
    }

    public List<Player> getSquadInTeam(String competitionCode, Integer teamId) {
        var idTeamInLeague = getIdTeamInLeague(competitionCode, teamId);
        return footballDataOrgClient.getSingleTeam(idTeamInLeague).getSquad();
    }

    private int getIdTeamInLeague(String competitionCode, Integer teamId) {
        return footballDataOrgClient.getTeams(competitionCode).getTeams().stream()
                .mapToInt(ShortTeamsResponse::getId)
                .filter((x) -> x == teamId)
                .findFirst()
                .orElseThrow(() -> new TeamNotFoundException("Team not found."));
    }


}
