package homework.ContragentList;
import java.util.ArrayList;
import java.util.List;

import homework.contragent.ContrAgent;

public class ListContrAgent extends AbsListAgent<ContrAgent>{
    private List<ContrAgent> listContrAgent = new ArrayList<>();

    public List<ContrAgent> getListContrAgent() {return listContrAgent;}

    public void addContrAgentInList(ContrAgent contrAgent){
        listContrAgent.add(contrAgent);        
    }

    public void deleteContrAgent(ContrAgent contrAgent){
        listContrAgent.remove(contrAgent);
    }

    public void printListContrAgent(){
        for (ContrAgent contrAgent : listContrAgent) {
            System.out.println(contrAgent);
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "ListContrAgent [\n" + listContrAgent + "]";
    }
    
}