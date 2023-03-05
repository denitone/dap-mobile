package com.deni.dap.login;

public class LoginPresenter implements LoginPresenterContract {

    LoginViewContract loginViewContract;

    public LoginPresenter(LoginViewContract loginViewContract) {
        this.loginViewContract = loginViewContract;
    }

    @Override
    public void doLogin(String usernme, String password) {
        if (usernme == null || password == null) {
            loginViewContract.showLoginFailed("Username and password can't be null!");
        } else if (usernme.isEmpty() || password.isEmpty()) {
            loginViewContract.showLoginFailed("Username and password can't be empty!");
        } else if (usernme.equalsIgnoreCase("a") && password.equalsIgnoreCase("a")) {
            loginViewContract.showLoginSuccess("login Success");
        }
        else{
            loginViewContract.showLoginFailed("Username and password are wrong!");
        }
    }
}
