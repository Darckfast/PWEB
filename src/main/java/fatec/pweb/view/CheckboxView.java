package fatec.pweb.view;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.model.SelectItem;
import javax.faces.model.SelectItemGroup;
 
@ManagedBean
public class CheckboxView {
         
    private String[] selectedCities;
    private List<String> cities;

     
    @PostConstruct
    public void init() {
        cities = new ArrayList<String>();
        cities.add("AC");
        cities.add("AP");
        cities.add("AM");
        cities.add("BA");
        cities.add("CE");
        cities.add("DF");
        cities.add("ES");
        cities.add("GO");
        cities.add("MA");
        cities.add("MT");
        cities.add("MS");
        cities.add("MG");
        cities.add("PA");
        cities.add("PB");
        cities.add("PR");
        cities.add("PE");
        cities.add("PI");
        cities.add("RJ");
        cities.add("RN");
        cities.add("RS");
        cities.add("RO");
        cities.add("RR");
        cities.add("SC");
        cities.add("SO");
        cities.add("SE");
        cities.add("TO");
     
    }
 
    public String[] getSelectedCities() {
        return selectedCities;
    }
 
    public void setSelectedCities(String[] selectedCities) {
        this.selectedCities = selectedCities;
    }
     
    public List<String> getCities() {
        return cities;
    }
 
}
    
