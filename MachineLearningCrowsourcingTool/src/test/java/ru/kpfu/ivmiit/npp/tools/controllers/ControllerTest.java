package ru.kpfu.ivmiit.npp.tools.controllers;


import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import ru.kpfu.ivmiit.npp.tools.controllers.dto.DocumentDto;
import ru.kpfu.ivmiit.npp.tools.controllers.dto.DtoConverter;
import ru.kpfu.ivmiit.npp.tools.services.DocumentService;
import ru.kpfu.ivmiit.npp.tools.services.models.Document;

import java.net.URI;

import static org.mockito.Mockito.when;


public class ControllerTest {

    // мок-объект для всего модуля MVC
    private MockMvc mockMvc;

    Document document;
    DocumentDto documentDto;

    @Mock
    DocumentService documentService;

    @Mock
    DtoConverter documentConverter;

    public void stubbingMockObject() throws Exception {
        document = new Document(new URI("audio.mp3"));
        documentDto = new DocumentDto("audio.mp3");
        when(documentService.
                getDocument("music", "audio.mp3")).thenReturn(document);
        when(documentConverter.
                convert(document)).thenReturn(documentDto);
    }

    @Before
    public void setUp() throws Exception {
        mockMvc =
                MockMvcBuilders.
                        standaloneSetup(new Controller(documentService, documentConverter)).build();
    }

    @Test
    public void testGetDocument() throws Exception {

    }
}