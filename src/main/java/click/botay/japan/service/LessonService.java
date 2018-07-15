package click.botay.japan.service;

import click.botay.japan.domain.LessonResponse;
import click.botay.japan.domain.LessonUpsertRequest;
import click.botay.japan.entity.LessonEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LessonService {
    List<LessonResponse> getLessons();

    void createLesson(LessonUpsertRequest request);
}
