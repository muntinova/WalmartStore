package com.example.walmartstore

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_register.*


class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        btn_signIn_reg.setOnClickListener {
            var firstName = firstname.text.toString()
            var lastName = lastname.text.toString()
            var email = edit_email_reg.text.toString()
            var password = edit_password_reg.text.toString()

            if(!firstName.toString().equals("") && !lastName.toString().equals("") && !email.toString().equals(
                    ""
                ) && !password.toString().equals("")){
                //Toast.makeText(this, "Success", Toast.LENGTH_SHORT).show()
                //val resultIntent = Intent(this, MainActivity::class.java)
                var resultIntent = Intent()
                resultIntent.putExtra("email", email)
                resultIntent.putExtra("password", password)
                resultIntent.putExtra("firstname", firstName)
                resultIntent.putExtra("lastname", lastName)
                setResult(RESULT_OK, resultIntent)
                //startActivity(resultIntent)
                finish()
            } else {
                Toast.makeText(this, "Please enter again", Toast.LENGTH_SHORT).show()
            }
        }
    }


}