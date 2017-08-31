package org.springframework.samples.petclinic.vet;

public class LittleBoy {
    int littleBoyAge;
    String littleBoyName;

    public void setLittleBoyAge (int i) {
        littleBoyAge = i;
    }

    public int getLittleBoyAge () {
        return littleBoyAge;
    }


    public void setLittleBoyName (String s) {
        littleBoyName = s;
    }

    public String getLittleBoyName () {
        return littleBoyName ;
    }
}
