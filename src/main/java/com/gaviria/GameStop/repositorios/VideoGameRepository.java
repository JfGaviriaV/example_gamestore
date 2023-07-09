package com.gaviria.GameStop.repositorios;

import com.gaviria.GameStop.entity.VideoGameEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoGameRepository extends JpaRepository<VideoGameEntity, Long> {

}
