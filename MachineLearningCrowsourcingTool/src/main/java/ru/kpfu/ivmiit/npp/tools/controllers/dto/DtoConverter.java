package ru.kpfu.ivmiit.npp.tools.controllers.dto;

import ru.kpfu.ivmiit.npp.tools.services.models.Document;

/**
 * Created by Irinoise on 28.03.2015.
 */
public interface DtoConverter {
    DocumentDto convert(Document model);
}
