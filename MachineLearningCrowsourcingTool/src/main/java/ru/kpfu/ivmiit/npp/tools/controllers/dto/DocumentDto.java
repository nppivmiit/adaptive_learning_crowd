package ru.kpfu.ivmiit.npp.tools.controllers.dto;

import com.inspiresoftware.lib.dto.geda.annotations.Dto;
import com.inspiresoftware.lib.dto.geda.annotations.DtoField;

@Dto("ru.kpfu.ivmiit.npp.tools.services.models.Document")
public class DocumentDto {

    @DtoField(converter = "UriToString")
    private String uri;

    public DocumentDto(String uri) {
        this.uri = uri;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }
}
