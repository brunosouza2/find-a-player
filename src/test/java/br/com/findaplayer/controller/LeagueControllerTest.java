package br.com.findaplayer.controller;

import br.com.findaplayer.model.Competition;
import br.com.findaplayer.model.dto.CompetitionResponse;
import br.com.findaplayer.model.dto.SingleCompetitionResponse;
import br.com.findaplayer.service.FootballService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@WebMvcTest
class LeagueControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private FootballService footballService;
    private CompetitionResponse competitionResponse;
    private SingleCompetitionResponse singleCompetitionResponse;

    @BeforeEach
    public void setUp() {
        // Competition SetUp
        this.competitionResponse = new CompetitionResponse();

        Competition comp1 = new Competition();
        comp1.setId(1);
        comp1.setName("Premier League");

        this.competitionResponse.setCompetitions(List.of(comp1));

        // Single Competition SetUP
         this.singleCompetitionResponse = new SingleCompetitionResponse();
         this.singleCompetitionResponse.setId(1);
         this.singleCompetitionResponse.setName("Premier League");

    }

    @Test
    void testGetAllCompetitions() throws Exception {
        when(footballService.getAllCompetitions()).thenReturn(this.competitionResponse);

       mockMvc.perform(MockMvcRequestBuilders.get("/api/leagues")
               .contentType(MediaType.APPLICATION_JSON))
               .andExpect(MockMvcResultMatchers.status().isOk())
               .andExpect(MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON))
               .andExpect(MockMvcResultMatchers.jsonPath("$.competitions[0].id").value(1));

    }

    @Test
    void testGetCompetitionSucess() throws Exception {
        String competitionCode = "PL";

        when(footballService.getCompetition(competitionCode)).thenReturn(this.singleCompetitionResponse);

        mockMvc.perform(MockMvcRequestBuilders.get("/api/leagues/" + competitionCode)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.jsonPath("$.id").value(1));
    }

    @Test
    @Disabled
    void testGetCompetitionNotFound() throws Exception {
//        String competitionCode = "XX";
//
//       when(footballService.getCompetition(competitionCode)).thenReturn("");
//
//        mockMvc.perform(MockMvcRequestBuilders.get("/api/leagues/" + competitionCode)
//                        .contentType(MediaType.APPLICATION_JSON))
//                        .andExpect(MockMvcResultMatchers.status().isNotFound());

        // TODO
    }

    @Test
    @Disabled
    void testGetTeamsInCompetition() {
        // TODO
    }

    @Test
    @Disabled
    void testGetTeamInCompetition() {
        // TODO
    }

    @Test
    @Disabled
    void testGetSquad() {
        // TODO
    }
}