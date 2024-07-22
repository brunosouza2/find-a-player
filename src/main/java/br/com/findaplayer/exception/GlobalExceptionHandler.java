package br.com.findaplayer.exception;

import feign.FeignException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(FeignException.class)
    public ResponseEntity<String> handleNotFoundCompetitionException(FeignException.NotFound e) {
        return new ResponseEntity<>("Resource not found in external API.", HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(TeamNotFoundException.class)
    public ResponseEntity<String> handleTeamNotFoundException(TeamNotFoundException e) {
        return new ResponseEntity<>("Team not found in league.", HttpStatus.NOT_FOUND);
    }

}
