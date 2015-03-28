package ru.kpfu.ivmiit.npp.tools.services.models;

import java.net.URI;

public class Document {
    private URI uri;

    public Document(URI uri) {
        this.uri = uri;
    }

    public URI getUri() {
        return uri;
    }

    public void setUri(URI uri) {
        this.uri = uri;
    }
}
