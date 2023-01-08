package org.example.strategy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class MailInfo {
    private Client client;
    private MailCode mailCode;
    public String generate(){
        return mailCode.generate(client);
    }
}
