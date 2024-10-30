package com.example.emaillayout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.emaillayout.ui.theme.EmailLayoutTheme
import android.widget.ListView

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val emailList = listOf(
            Email("Edurila.com", "$19 Only (First 10 spots) - Bestselling...", "Are you looking to Learn Web Designin...", "12:34 PM"),
            Email("Chris Abad", "Help make Campaign Monitor better", "Let us know your thoughts! No Images...", "11:22 AM"),
            Email("Tuto.com", "8h de formation gratuite et les nouvea...", "Photoshop, SEO, Blender, CSS, WordPre...", "11:04 AM"),
            Email("support", "Société Ovh : suivi de vos services - hp...", "SAS OVH - http://www.ovh.com 2 rue K...", "10:26 AM"),
            Email("Matt from Ionic", "The New Ionic Creator Is Here!", "Announcing the all-new Creator, build...", "9:58 AM")
        )

        val listView: ListView = findViewById(R.id.listView)
        val adapter = EmailAdapter(this, emailList)
        listView.adapter = adapter
    }
}
