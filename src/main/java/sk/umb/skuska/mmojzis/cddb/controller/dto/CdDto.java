package sk.umb.skuska.mmojzis.cddb.controller.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CdDto {

    private Long id;

    private String author;

    private String name;

    private String genreName;
}
