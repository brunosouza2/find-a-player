package br.com.findaplayer.service;

import br.com.findaplayer.client.FootballDataOrgClient;
import br.com.findaplayer.model.Competition;
import br.com.findaplayer.model.Player;
import br.com.findaplayer.model.Team;
import br.com.findaplayer.model.dto.CompetitionResponse;
import br.com.findaplayer.model.dto.ShortTeamsResponse;
import br.com.findaplayer.model.dto.SingleCompetitionResponse;
import br.com.findaplayer.model.dto.TeamsResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class FootballServiceTest {

    @Mock
    private FootballDataOrgClient footballDataOrgClient;

    @InjectMocks
    private FootballService footBallService;

    private CompetitionResponse competitionResponse;
    private SingleCompetitionResponse singleCompetitionResponse;
    private TeamsResponse teamsResponse;
    private Team team;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);

        // Competitions SetUp
        competitionResponse = new CompetitionResponse();

        Competition comp1 = new Competition();
        comp1.setId(1);
        comp1.setName("Premier League");
        comp1.setCode("PL");

        Competition comp2 = new Competition();
        comp2.setId(2);
        comp2.setName("Serie A Tim");
        comp2.setCode("SA");

        competitionResponse.setCompetitions(List.of(comp1, comp2));

        singleCompetitionResponse = new SingleCompetitionResponse();
        singleCompetitionResponse.setId(1);
        singleCompetitionResponse.setName("Premier League");
        singleCompetitionResponse.setCode("PL");

        // Teams SetUp
        teamsResponse = new TeamsResponse();

        ShortTeamsResponse team1 = new ShortTeamsResponse();
        team1.setId(1);
        team1.setName("Arsenal");

        ShortTeamsResponse team2 = new ShortTeamsResponse();
        team2.setId(2);
        team1.setName("Man City");

        teamsResponse.setTeams(List.of(team1, team2));

        team = new Team();
        team.setId(1);
        team.setName("Arsenal");

        Player p1 = new Player();
        p1.setId(1);
        p1.setName("Julio");

        Player p2 = new Player();
        p1.setId(2);
        p1.setName("Carlos");

        team.setSquad(List.of(p1, p2));
    }

    @Test
    public void testGetAllCompetitions() {
        when(footballDataOrgClient.getCompetitions()).thenReturn(this.competitionResponse);

        Competition comp1 = new Competition();
        comp1.setId(1);
        comp1.setName("Premier League");
        comp1.setCode("PL");

        Competition comp2 = new Competition();
        comp2.setId(2);
        comp2.setName("Serie A Tim");
        comp2.setCode("SA");

        Competition[] expectedCompetitions = {comp1, comp2};

        CompetitionResponse competResponse = footBallService.getAllCompetitions();
        Competition[] actualCompetitions = competResponse.getCompetitions().toArray(new Competition[0]);

        assertArrayEquals(expectedCompetitions, actualCompetitions);
    }

    @Test
    public void testGetCompetition() {
        String competitionCode = "PL";

        when(footballDataOrgClient.getCompetition(competitionCode)).thenReturn(this.singleCompetitionResponse);

        SingleCompetitionResponse expectedCompetition = new SingleCompetitionResponse();
        expectedCompetition.setId(1);
        expectedCompetition.setCode("PL");
        expectedCompetition.setName("Premier League");

        SingleCompetitionResponse actualCompetition = footBallService.getCompetition(competitionCode);

        assertEquals(expectedCompetition, actualCompetition);
    }

    @Test
    void testGetTeamsInCompetition() {
        String competitionCode = "PL";

        when(footballDataOrgClient.getTeams(competitionCode)).thenReturn(this.teamsResponse);

        TeamsResponse expectedTeamsResponse = new TeamsResponse();
        TeamsResponse actualTeamsResponse = footBallService.getTeamsInCompetition(competitionCode);

        ShortTeamsResponse team1 = new ShortTeamsResponse();
        team1.setId(1);
        team1.setName("Arsenal");

        ShortTeamsResponse team2 = new ShortTeamsResponse();
        team2.setId(2);
        team1.setName("Man City");

        expectedTeamsResponse.setTeams(List.of(team1, team2));

        assertEquals(expectedTeamsResponse, actualTeamsResponse);
    }

    @Test
    void testGetSingleTeam() {
        String competitionCode = "PL";
        Integer teamId = 1;

        when(footballDataOrgClient.getSingleTeam(teamId)).thenReturn(this.team);
        when(footballDataOrgClient.getTeams(competitionCode)).thenReturn(this.teamsResponse);

        Team expectedTeam = new Team();
        expectedTeam.setId(1);
        expectedTeam.setName("Arsenal");

        Player p1 = new Player();
        p1.setId(1);
        p1.setName("Julio");

        Player p2 = new Player();
        p1.setId(2);
        p1.setName("Carlos");

        expectedTeam.setSquad(List.of(p1, p2));

        Team actualTeam = footBallService.getSingleTeam(competitionCode, teamId);

        assertEquals(expectedTeam, actualTeam);
    }

    @Test
    void testGetSquadInTeam() {
        String competitionCode = "PL";
        Integer teamId = 1;

        when(footballDataOrgClient.getSingleTeam(teamId)).thenReturn(this.team);
        when(footballDataOrgClient.getTeams(competitionCode)).thenReturn(this.teamsResponse);

        Player p1 = new Player();
        p1.setId(1);
        p1.setName("Julio");

        Player p2 = new Player();
        p1.setId(2);
        p1.setName("Carlos");

        Player[] expectedSquad = {p1, p2};
        Player[] actualSquad = footBallService
                .getSquadInTeam(competitionCode, teamId)
                .toArray(new Player[0]);

        assertArrayEquals(expectedSquad, actualSquad);
    }

}