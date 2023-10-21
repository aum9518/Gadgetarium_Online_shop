package gadgetarium.services;

import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public interface PdfFileService {

    void generatePdf(Long subProductId, HttpServletResponse response) throws IOException;

}
