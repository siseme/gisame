package me.gisa.api.service.news;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;

public interface BatchService {
    void sync() throws IOException, JAXBException;
}
