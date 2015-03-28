package ru.kpfu.ivmiit.npp.tools.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.kpfu.ivmiit.npp.tools.controllers.dto.DocumentDto;
import ru.kpfu.ivmiit.npp.tools.controllers.dto.DtoConverter;
import ru.kpfu.ivmiit.npp.tools.services.DocumentService;

// Контроллер - модуль, выполняет отображение
// http-запросов в java-методы

// @RestController - метка (аннотация)
// показывающая, что ваш контроллер автоматически
// поддерживает Rest api
// принимает JSon и отправляет Json - автоматическая конвертая
@RestController
public class Controller {

    // Service - модуль, в котором заложена основая логика приложения
    DocumentService service;

    // DtoConverter - модуль, который выполняет конвертацию между
    // dto и models
    DtoConverter dtoConverter;

    public Controller(DocumentService service, DtoConverter dtoConverter) {
        this.service = service;
        this.dtoConverter = dtoConverter;
    }

    // "/documents/music/audio.mp3"
    @RequestMapping
            (value = "/documents/{document-type}/{document-id}",
            produces = "application/json", method = RequestMethod.GET)
    public DocumentDto getDocument(
            @PathVariable("document-type") final String documentType,
            @PathVariable("document-id") final String documentId) {
        return dtoConverter.convert(service.getDocument(documentType, documentId));
    }
}
