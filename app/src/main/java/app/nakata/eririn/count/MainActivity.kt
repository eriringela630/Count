package app.nakata.eririn.count

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var number: Int = 0
        textView.text = "0"

        button.setOnClickListener{
            number = number +  1
            textView.text = number.toString()
        }


    }

}
