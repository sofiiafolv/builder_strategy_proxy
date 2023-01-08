package org.example.strategy;

import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;

import java.util.ArrayList;
import java.util.List;

public class MailBox {
    private List<MailInfo> infos = new ArrayList();
    public void addMailInfo(MailInfo mailInfo){
        infos.add(mailInfo);
    }
    public void sendAll() throws MailjetSocketTimeoutException, MailjetException {
        for (int i = 0; i < infos.size(); i++) {
            MailSender.sendMail(infos.get(i));
        }
    }
}
