package sk.umb.skuska.controller.dto;

import lombok.Builder;
import lombok.Data;

@Data
public class CdRequestDto {

    private String name;

    private String author;

    private Long genreId;
}
