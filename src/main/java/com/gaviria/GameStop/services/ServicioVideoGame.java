package com.gaviria.GameStop.services;

import com.gaviria.GameStop.entity.VideoGameEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.gaviria.GameStop.repositorios.VideoGameRepository;

import java.util.List;

@Service
public class ServicioVideoGame {

    private VideoGameRepository videoGameRepository;

    public ServicioVideoGame(VideoGameRepository videoGameRepository) {
        this.videoGameRepository = videoGameRepository;
    }

    public ResponseEntity<List<VideoGameEntity>> obtenerTodosLosJuegos(){
        List<VideoGameEntity> todosLosJuegos = this.videoGameRepository.findAll();
        return ResponseEntity.ok(todosLosJuegos);
    }

}
