package br.com.findaplayer.client;

import br.com.findaplayer.configuration.FeignConfiguration;
import br.com.findaplayer.model.Team;
import br.com.findaplayer.model.dto.CompetitionResponse;
import br.com.findaplayer.model.dto.SingleCompetitionResponse;
import br.com.findaplayer.model.dto.TeamsResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(
        name = "footballDataOrgApi",
        url = "http://api.football-data.org",
        configuration = {
                FeignConfiguration.class,
        })
public interface FootballDataOrgClient {

    @GetMapping("/v4/competitions")
    CompetitionResponse getCompetitions();

    @GetMapping("/v4/competitions/{competitionCode}")
    SingleCompetitionResponse getCompetition(@PathVariable String competitionCode);

    @GetMapping("/v4/competitions/{competitionCode}/teams")
    TeamsResponse getTeams(@PathVariable String competitionCode);

    @GetMapping("/v4/teams/{teamId}")
    Team getSingleTeam(@PathVariable Integer teamId);

}
