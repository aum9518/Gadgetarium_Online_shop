package gadgetarium.services;


import gadgetarium.dto.request.mailing.MailingRequest;
import gadgetarium.dto.simple.SimpleResponse;

public interface MailingService {
  
    SimpleResponse sendHtmlEmail(MailingRequest mailingRequest);

    SimpleResponse followUser (String email);
}
