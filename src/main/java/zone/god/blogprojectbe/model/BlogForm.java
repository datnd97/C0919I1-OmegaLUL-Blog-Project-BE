package zone.god.blogprojectbe.model;

import lombok.Data;

@Data
public class BlogForm {
    private long id;
    private String tittle;
    private String description;
    private String thumbnail;
    private Iterable<Long> tagList;
    private String content;

    public BlogForm() {
    }
}