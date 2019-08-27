package primeur.back.controllers;


import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import primeur.back.mailConfiguration.EmailCfg;
import primeur.back.mailConfiguration.Feedback;

import javax.xml.bind.ValidationException;

@RestController
@RequestMapping("/feedback")
public class FeedbackController {
    private EmailCfg emailCfg ;
    public FeedbackController(EmailCfg emailCfg1) {
        this.emailCfg=emailCfg1 ;
    }

    @PostMapping("/")
    public void sendFeedBack(@RequestBody Feedback feedback, BindingResult bindingResult) throws ValidationException {
        if(bindingResult.hasErrors()) {
            throw new ValidationException("feedback is not valid!") ;

         }
        //create mail sender ! (JavaMailSender)
        JavaMailSenderImpl mailSender=new JavaMailSenderImpl() ;
        mailSender.setHost(emailCfg.getHost());
        mailSender.setPort(emailCfg.getPort()) ;
        mailSender.setUsername(emailCfg.getUsername());
        mailSender.setPassword(emailCfg.getPassword());
        //create an email instance ! (SimpleMailMessage)
        SimpleMailMessage mailMessage=new SimpleMailMessage() ;
        mailMessage.setFrom(feedback.getEmail());
        mailMessage.setTo("askribilel09@gmail.com");
        mailMessage.setSubject("first mail");
        mailMessage.setText(feedback.getFeedback());

        //send mail !
        mailSender.send(mailMessage);


    }

}
