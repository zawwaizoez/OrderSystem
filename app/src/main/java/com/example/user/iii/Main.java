package com.example.user.iii;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;
import android.app.Activity;
import android.widget.RelativeLayout;
import android.view.LayoutInflater;
import android.view.ViewGroup.LayoutParams;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class Main extends AppCompatActivity {


    private Dialog myDialog;
    private Button btnLogin,btnCreateAcc;
    private TextView tvForgotPassword;
    private String email,password;
    private EditText etEmail,etPassword;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        tvForgotPassword =(TextView)findViewById(R.id.tvForgotPass);
        etEmail =(EditText)findViewById(R.id.etEmail);
        etPassword =(EditText)findViewById(R.id.etPassword);
        btnLogin=(Button)findViewById(R.id.btnLogin);
        btnCreateAcc=(Button)findViewById(R.id.btnCreateAcc);
        myDialog = new Dialog(this);

        tvForgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView txtclose;
                Button btnFollow;
                myDialog.setContentView(R.layout.custompopup);
                txtclose =(TextView) myDialog.findViewById(R.id.txtclose);
                txtclose.setText("M");

                txtclose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });
                myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                myDialog.show();




            }
        });
btnLogin.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        email = etEmail.getText().toString();
        password =etPassword.getText().toString();
        Toast.makeText(getApplicationContext(),"Your Email is-"+email+"and Your Password is " +password ,Toast.LENGTH_LONG).show();

    }
});

    }
}
