package com.example.accentureandroidtask.mainActivityMVP;

//This is the blueprint of View-Model-Presenter.


import java.util.ArrayList;

public interface MainActivityContract {
    interface View{

        void showError(String call, String statusMessage);
        void showProgress();
        void getLatLong();
        void hideProgress();
        void showComplete();
        void updateRecycleView(ArrayList<String> users);
    }

    interface Presenter{
        void loadFeedsData();
        String getUsers();

    }
}
