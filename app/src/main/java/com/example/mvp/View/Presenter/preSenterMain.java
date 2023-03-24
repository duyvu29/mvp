package com.example.mvp.View.Presenter;

import com.example.mvp.View.InterfaceUnits.InterfacaMain;
import com.example.mvp.View.model.User;

public class preSenterMain {

   public  InterfacaMain interfacaMain;

    public preSenterMain(InterfacaMain interfacaMain) {
        this.interfacaMain = interfacaMain;
    }

    public void login (User user){
        if (user.getName().length() > 4  && user.getPassord().length() > 4){
             interfacaMain.loginSucceccs();
        }
        else {
            interfacaMain.loginErrol();
        }
    }
}
