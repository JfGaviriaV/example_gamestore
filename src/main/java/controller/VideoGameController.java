package controller;

import entity.VideoGameEntity;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import services.ServicioVideoGame;

import java.util.List;

@RestController
@RequestMapping(path = "/VideoGame/v1")
public class VideoGameController {

    private ServicioVideoGame servicioVideoGame;

    public VideoGameController(ServicioVideoGame servicioVideoGame) {
        this.servicioVideoGame = servicioVideoGame;
    }

    @GetMapping
    public ResponseEntity<List<VideoGameEntity>> retornarTodosLosJuegos() {
        return this.servicioVideoGame.obtenerTodosLosJuegos();
    }
    
}
