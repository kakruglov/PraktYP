package com.example.a777;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Patterns;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class screen5 extends AppCompatActivity {
    private EditText editTextFullName, editTextPhoneNumber, editTextEmailAddress, editTextPassword, editTextConfirmPassword;
    private CheckBox checkBox;
    private Button buttonSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen5);

        editTextFullName = findViewById(R.id.editTextText);
        editTextPhoneNumber = findViewById(R.id.editTextPhone);
        editTextEmailAddress = findViewById(R.id.editTextTextEmailAddress);
        editTextPassword = findViewById(R.id.pass1);
        editTextConfirmPassword = findViewById(R.id.pass);
        checkBox = findViewById(R.id.checkBox);
        buttonSignUp = findViewById(R.id.button);

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                buttonSignUp.setEnabled(isChecked);
                if (isChecked) {
                    buttonSignUp.setBackgroundColor(getResources().getColor(R.color.blue));
                } else {
                    buttonSignUp.setBackgroundColor(getResources().getColor(R.color.blue));
                }
            }
        });

        editTextFullName.addTextChangedListener(watcher);
        editTextPhoneNumber.addTextChangedListener(watcher);
        editTextEmailAddress.addTextChangedListener(watcher);
        editTextPassword.addTextChangedListener(watcher);
        editTextConfirmPassword.addTextChangedListener(watcher);

        buttonSignUp.setEnabled(false);
        buttonSignUp.setBackgroundColor(getResources().getColor(android.R.color.darker_gray));

        buttonSignUp.setOnClickListener(v -> Signup());
    }

    private final TextWatcher watcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            checkSignUpConditions();
        }

        @Override
        public void afterTextChanged(Editable s) {
        }
    };

    private void checkSignUpConditions() {
        String fullName = editTextFullName.getText().toString();
        String phoneNumber = editTextPhoneNumber.getText().toString();
        String emailAddress = editTextEmailAddress.getText().toString();
        String password = editTextPassword.getText().toString();
        String confirmPassword = editTextConfirmPassword.getText().toString();

        boolean isFullNameValid = fullName.matches("[A-Za-z]+\\s[A-Za-z]+");
        boolean isPhoneNumberValid = Patterns.PHONE.matcher(phoneNumber).matches();
        boolean isEmailAddressValid = Patterns.EMAIL_ADDRESS.matcher(emailAddress).matches();
        boolean isPasswordValid = !password.isEmpty() && password.equals(confirmPassword);
        boolean isAgreedToTerms = checkBox.isChecked();

        if (isFullNameValid && isPhoneNumberValid && isEmailAddressValid && isPasswordValid && isAgreedToTerms) {
            buttonSignUp.setEnabled(true);
            buttonSignUp.setBackgroundColor(getResources().getColor(R.color.blue));
        } else {
            buttonSignUp.setEnabled(false);
            buttonSignUp.setBackgroundColor(getResources().getColor(android.R.color.darker_gray));
        }
    }

    private void Signup() {
        String fullName = editTextFullName.getText().toString();
        String phoneNumber = editTextPhoneNumber.getText().toString();
        String emailAddress = editTextEmailAddress.getText().toString();
        String password = editTextPassword.getText().toString();
        String confirmPassword = editTextConfirmPassword.getText().toString();
        if (!fullName.isEmpty() && !phoneNumber.isEmpty() && !emailAddress.isEmpty() &&
                !password.isEmpty() && !confirmPassword.isEmpty()) {
            if (!password.equals(confirmPassword)) {
                Toast.makeText(this, "Passwords do not match", Toast.LENGTH_SHORT).show();
                return;
            }

            Toast.makeText(this, "Registration Successful", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(screen5.this, screen6.class);
            startActivity(intent);
        } else {
            Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
        }
    }
    public void SignIn(View v) {
        Intent intent = new Intent(this, screen6.class);
        startActivity(intent);
    }
}