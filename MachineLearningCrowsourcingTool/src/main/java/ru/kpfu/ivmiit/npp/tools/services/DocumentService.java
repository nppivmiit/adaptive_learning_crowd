package ru.kpfu.ivmiit.npp.tools.services;


import ru.kpfu.ivmiit.npp.tools.services.models.Document;

public interface DocumentService {
    public Document getDocument(String docType, String docId);
}
