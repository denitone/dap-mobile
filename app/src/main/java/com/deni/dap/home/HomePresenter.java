package com.deni.dap.home;

public class HomePresenter implements HomePresenterContract {

    HomeViewContract viewContract;

    public HomePresenter(HomeViewContract homeViewContract) {
        this.viewContract = homeViewContract;
    }


    @Override
    public void doBackToLogin() {
        viewContract.successBackToLogin();
    }
}
