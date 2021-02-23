package dto;

import java.io.Serializable;
import java.time.Instant;

public class Mesaj implements Serializable {

    private String continut;

    private String expeditor;

    private Instant time;

    public String getContinut() {
        return continut;
    }

    public void setContinut(String continut) {
        this.continut = continut;
    }

    public String getExpeditor() {
        return expeditor;
    }

    public void setExpeditor(String expeditor) {
        this.expeditor = expeditor;
    }

    public Instant getTime() {
        return time;
    }

    public void setTime(Instant time) {
        this.time = time;
    }
}
