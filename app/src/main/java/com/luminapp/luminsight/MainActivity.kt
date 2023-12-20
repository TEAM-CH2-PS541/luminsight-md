package com.luminapp.luminsight

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.WindowManager
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.auth.api.Auth
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.firebase.auth.FirebaseAuth
import com.luminapp.luminsight.databinding.ActivityMainBinding
import com.luminapp.luminsight.databinding.PopupExitBinding
import com.luminapp.luminsight.ui.about.AboutActivity
import com.luminapp.luminsight.ui.artikel.ArtikelActivity
import com.luminapp.luminsight.ui.login.LoginActivity
import com.luminapp.luminsight.ui.metode.MetodeActivity


class MainActivity : AppCompatActivity() {

    lateinit var binding:ActivityMainBinding
    //lateinit var mAuth: FirebaseAuth
    lateinit var mGoogleSignInClient: GoogleSignInClient
    private val auth by lazy {
        FirebaseAuth.getInstance()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        main()
    }

    private fun main(){
        //mAuth = FirebaseAuth.getInstance()
        binding.tvNama.text = ""
        createRequest()

        binding.imgBack.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }

        binding.imgLogout.setOnClickListener {
            dialogExit()
        }

        binding.tvAbout.setOnClickListener {
            startActivity(Intent(this,AboutActivity::class.java))
        }
        binding.tvPredict.setOnClickListener {
            startActivity(Intent(this,MetodeActivity::class.java))
        }
        binding.tvArtikel.setOnClickListener {
            startActivity(Intent(this,ArtikelActivity::class.java))
        }
    }

    private fun createRequest() {
        val gso = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
            .requestIdToken(getString(R.string.webid))
            .requestEmail()
            .build()
        mGoogleSignInClient= GoogleSignIn.getClient(this,gso)
    }

    private fun dialogExit() {
        val dialog = AlertDialog.Builder(this)
        val layoutInflater = getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val view = PopupExitBinding.inflate(layoutInflater)
        dialog.setView(view.root)

        val alertDialog = dialog.create()
        alertDialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        val lebar = resources.displayMetrics.widthPixels * 0.80
        val tinggi = WindowManager.LayoutParams.WRAP_CONTENT

        view.btnBatal.setOnClickListener {
            alertDialog.dismiss()
        }
        view.btnOk.setOnClickListener {
            alertDialog.dismiss()
            exit()
        }

        if (!isFinishing) {
            //show dialog
            alertDialog.show()
            alertDialog.window?.setLayout(lebar.toInt(),tinggi)
        }
    }

    private fun exit(){
        mGoogleSignInClient.signOut().addOnCompleteListener {
//            if (it.hasConnectedApi(Auth.GOOGLE_SIGN_IN_API)) {
//                mGoogleSignInClient.clearDefaultAccountAndReconnect();
//                mGoogleSignInClient.stopAutoManage(context);
//                mGoogleSignInClient.disconnect();
//            }
            mGoogleSignInClient.revokeAccess().addOnCompleteListener {
                auth.signOut()
                startActivity(Intent(this, LoginActivity::class.java)
                    .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK))
                finish()
            }
        }
    }

    override fun onStart() {
        super.onStart()
        val user = auth.currentUser
        if (user != null) {
            val a = FirebaseAuth.getInstance().currentUser
            binding.tvNama.text = a?.displayName
        }
    }
}