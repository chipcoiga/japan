CREATE TABLE lessons (
  id          BIGSERIAL     PRIMARY KEY NOT NULL,
  title       VARCHAR       NOT NULL,
  description VARCHAR
);

CREATE TABLE lessons_videos (
  video_id    BIGINT    NOT NULL,
  lesson_id   BIGINT    NOT NULL
);