package Presenter;

import Model.Human.Gender;
import Model.Human.Human;
import Model.Service.Service;
import Model.Writable.Writable;
import View.View;

import java.time.LocalDate;

public class Presenter {
    private View view;
    private Service service;
    private Writable writable;

    public Presenter(View view) {
        this.view = view;
        service = new Service();
        this.writable = Writable;
    }

    public void getHumanListInfo(){
        String info = service.getHumanListInfo();
        view.printAnswer(info);
    }
    public void addHuman(int Id, String name, Gender gender, Human parent1, Human parent2, LocalDate birthDate, LocalDate deathDate){
        service.addHuman(Id++,name,gender,parent1,parent2,birthDate, null);
        getHumanListInfo();
    }
    public void addWedding(){
        service.addWedding();
        getHumanListInfo();
    }

    public void sortByAge(){
        service.sortByAge();
        getHumanListInfo();
    }
    public void sortByName(){
        service.sortByName();
        getHumanListInfo();
    }
    public void save(){
        service.save();

    }
    public void read(){
        service.read();
    }

}
