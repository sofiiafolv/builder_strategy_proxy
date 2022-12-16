package org.example.strategy;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MailInfo {
    private Client client;
    private MailCode mailCode;
    public String generate(){
        return mailCode.generate(client);
    }
}
