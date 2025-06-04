package vcmsa.ci.gametesterlogapp

import android.media.Image
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var textView: TextView
    lateinit var editText: EditText
    lateinit var image: ImageView
    lateinit var exitButton: Button
    lateinit var startButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView)
        editText = findViewById(R.id.editTextText)
        image = findViewById(R.id.imageView)
        exitButton = findViewById(R.id.exitBtn)
        startButton = findViewById(R.id.startBtn)



        startButton.setOnClickListener {
            var intent (this,GameTesterLogApp::class.java)
            startActivity(intent)
        }

        exitButton.setOnClickListener {
            finish()
        }



















    }
}