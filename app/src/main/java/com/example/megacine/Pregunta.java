package com.example.megacine;

import android.media.Image;
import android.widget.ImageView;

import java.util.ArrayList;

public class Pregunta {

    int imv;
    String preg;
    String respCorr;
    ArrayList<String> resp = new ArrayList<>();
    public Pregunta(int imv, String preg, String respCorr, ArrayList<String> resp) {

        this.imv = imv;
        this.preg = preg;
        this.respCorr = respCorr;
        this.resp = resp;
    }

    public int getImv() {
        return imv;
    }

    public void setImv(int imv) {
        this.imv = imv;
    }

    public String getPreg() {
        return preg;
    }

    public void setPreg(String preg) {
        this.preg = preg;
    }

    public String getRespCorr() {
        return respCorr;
    }

    public void setRespCorr(String respCorr) {
        this.respCorr = respCorr;
    }

    public ArrayList<String> getResp() {
        return resp;
    }

    public void setResp(ArrayList<String> resp) {
        this.resp = resp;
    }
}
