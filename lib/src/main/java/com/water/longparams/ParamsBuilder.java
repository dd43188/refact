package com.water.longparams;

public class ParamsBuilder {

    private String smtpHost;
    private int smtpPort;
    private String sender;
    private String subject;
    private String body;
    private String recipient;

    public ParamsBuilder setSmtpHost(String smtpHost) {
        this.smtpHost = smtpHost;
        return this;
    }

    public ParamsBuilder setSmtpPort(int smtpPort) {
        this.smtpPort = smtpPort;
        return this;
    }

    public ParamsBuilder setSender(String sender) {
        this.sender = sender;
        return this;
    }

    public ParamsBuilder setSubject(String subject) {
        this.subject = subject;
        return this;
    }

    public ParamsBuilder setBody(String body) {
        this.body = body;
        return this;
    }

    public ParamsBuilder setRecipient(String recipient) {
        this.recipient = recipient;
        return this;
    }

    public Params createParams() {
        return new Params(smtpHost, smtpPort, sender, subject, body, recipient);
    }
}