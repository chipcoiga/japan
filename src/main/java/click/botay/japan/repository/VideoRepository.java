package click.botay.japan.repository;

import click.botay.japan.entity.VideoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Set;

public interface VideoRepository extends JpaRepository<VideoEntity, Long> {
    void deleteAllByIdIn(List<Long> ids);
    List<VideoEntity> findAllByIdIn(Set<Long> ids);
}
