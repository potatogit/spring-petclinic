package org.springframework.samples.petclinic.vet;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

/**
 *
 */
public class TestRequestBody {
    int intClass;
    List<Integer> listExample;
    LittleBoy littleBoy;

    LocalDate productionDate;
    LocalDateTime time;

    public int getIntClass(){
        return intClass;
    }
    public void setIntClass(int i) {
       intClass = i;
    }

    public List<Integer> getListExample () {
       return listExample;
    }
    public void setListExample(List<Integer> l){
        listExample = l;
    }


    public LittleBoy getLittleBoy() {
       return littleBoy;
    }
    public void setLittleBoy(LittleBoy b){
        littleBoy = b;
    }

    public LocalDate getProductionDate() {
        return productionDate;
    }

    public void setProductionDate (LocalDate d) {
        productionDate = d;
    }

     public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

}
