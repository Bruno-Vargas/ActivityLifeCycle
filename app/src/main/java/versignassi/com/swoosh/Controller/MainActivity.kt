package versignassi.com.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import versignassi.com.swoosh.R

class MainActivity : BaseActivity() {

    //viewDidLoad
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getStartedButton.setOnClickListener {
            val leagueIntent = Intent(this, League_activity::class.java)
            startActivity(leagueIntent)
        }

    }


}
