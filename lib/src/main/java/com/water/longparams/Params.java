package com.water.longparams;

public class Params {

    private final String smtpHost;
    private final int smtpPort;
    private final String sender;
    private final String subject;
    private final String body;
    private final String recipient;

    public Params(String smtpHost, int smtpPort, String sender, String subject, String body, String recipient) {
        this.smtpHost = smtpHost;
        this.smtpPort = smtpPort;
        this.sender = sender;
        this.subject = subject;
        this.body = body;
        this.recipient = recipient;
    }

    public String getSmtpHost() {
        return smtpHost;
    }

    public int getSmtpPort() {
        return smtpPort;
    }

    public String getSender() {
        return sender;
    }

    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;
    }

    public String getRecipient() {
        return recipient;
    }
}
