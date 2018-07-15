package click.botay.japan.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "lessons")
public class LessonEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @OneToMany
    @JoinTable(
            name = "lessons_videos",
            joinColumns = @JoinColumn(name = "lesson_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "video_id", referencedColumnName = "id"))
    private Set<VideoEntity> videos;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<VideoEntity> getVideos() {
        return videos;
    }

    public void setVideos(Set<VideoEntity> videos) {
        this.videos = videos;
    }
}
