package org.springframework.samples.petclinic.girl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.validation.BindingResult;
import javax.validation.Valid;
import java.util.Map;

/**
 * @author Yang Yumeng
 */
@Controller
class GirlController {
    private static final String VIEWS_GIRL_CREATE_OR_UPDATE_FORM = "girls/createOrUpdateGirlForm";
    private final GirlRepository girlRepository;

    @Autowired
    public GirlController(GirlRepository girlRepository){
        this.girlRepository = girlRepository;
    }

    @InitBinder
    public void setAllowedFields(WebDataBinder dataBinder) {
        dataBinder.setDisallowedFields("id");
    }

    @RequestMapping(value = "/girls/new", method = RequestMethod.GET)
    public String initCreationForm(Map<String, Object> model) {
        Girl girl = new Girl();
        model.put("girl", girl);
        return VIEWS_GIRL_CREATE_OR_UPDATE_FORM;
    }

    @RequestMapping(value="/girls/new", method=RequestMethod.POST)
    public String processCreationForm(@Valid Girl girl, BindingResult result){
       if(result.hasErrors()){
          return VIEWS_GIRL_CREATE_OR_UPDATE_FORM;

       } else {
           this.girlRepository.save(girl);
           return null;
       }

    }




}
