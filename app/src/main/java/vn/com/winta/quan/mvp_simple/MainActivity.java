package vn.com.winta.quan.mvp_simple;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatEditText;
import android.widget.Button;
import android.widget.Toast;

import vn.com.winta.quan.mvp_simple.Login.PresenterLogin;
import vn.com.winta.quan.mvp_simple.Login.ILoginListener;

public class MainActivity extends AppCompatActivity implements ILoginListener {

    private PresenterLogin presenterLogin;

    private Button btnLogin;
    private AppCompatEditText edtUser, edtPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        setEvent();
    }

    private void setEvent() {
        btnLogin.setOnClickListener(v -> {
            presenterLogin.login(edtUser.getText().toString(),edtPass.getText().toString());
        });
    }

    void initData() {
        presenterLogin = new PresenterLogin(this);
        btnLogin= (Button) findViewById(R.id.btnLogin);
        edtPass= (AppCompatEditText) findViewById(R.id.edtPass);
        edtUser= (AppCompatEditText) findViewById(R.id.edtUser);
    }

    @Override
    public void success() {
        Toast.makeText(this, "Success", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void faile() {
        Toast.makeText(this, "Faile", Toast.LENGTH_SHORT).show();
    }
}
