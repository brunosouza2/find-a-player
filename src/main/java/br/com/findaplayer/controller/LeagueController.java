package br.com.findaplayer.controller;

import br.com.findaplayer.model.Player;
import br.com.findaplayer.model.Team;
import br.com.findaplayer.model.dto.CompetitionResponse;
import br.com.findaplayer.model.dto.SingleCompetitionResponse;
import br.com.findaplayer.model.dto.TeamsResponse;
import br.com.findaplayer.service.FootballService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/leagues")
public class LeagueController {

    @Autowired
    private FootballService footBallService;

    @GetMapping
    public ResponseEntity<CompetitionResponse> getAllCompetitions() {
        return ResponseEntity.ok(footBallService.getAllCompetitions());
    }

    @GetMapping("/{competitionCode}")
    public ResponseEntity<SingleCompetitionResponse> getCompetition(@PathVariable String competitionCode) {
        return ResponseEntity.ok(footBallService.getCompetition(competitionCode));
    }

    @GetMapping("/{competitionCode}/teams")
    public ResponseEntity<TeamsResponse> getTeamsInCompetition(@PathVariable String competitionCode) {
        return ResponseEntity.ok(footBallService.getTeamsInCompetition(competitionCode));
    }

    @GetMapping("/{competitionCode}/teams/{teamId}")
    public ResponseEntity<Team> getTeamInCompetition(@PathVariable String competitionCode,
                                                      @PathVariable Integer teamId) {
        return ResponseEntity.ok(footBallService.getSingleTeam(competitionCode, teamId));
    }

    @GetMapping("/{competitionCode}/teams/{teamId}/squad")
    public ResponseEntity<List<Player>> getSquad(@PathVariable String competitionCode,
                                                 @PathVariable Integer teamId) {
        return ResponseEntity.ok(footBallService.getSquadInTeam(competitionCode, teamId));
    }


}
