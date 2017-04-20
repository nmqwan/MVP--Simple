package vn.com.winta.quan.mvp_simple.Login;

/**
 * Created by QWAN on 20/04/2017.
 */

public class PresenterLogin implements IPresenterLogin{
    ILoginListener listener;

    public PresenterLogin(ILoginListener listener) {
        this.listener = listener;
    }

    @Override
    public void login(String username, String pass) {
        if (username.equals("quan")&&pass.equals("123")){
            listener.success();
        }else{
            listener.faile();
        }
    }
}
