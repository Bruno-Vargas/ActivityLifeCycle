package versignassi.com.swoosh.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import versignassi.com.swoosh.EXTRA_LEAGUE
import versignassi.com.swoosh.R

class SkillActvity : AppCompatActivity() {
    var league = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill_actvity)
        league = intent.getStringExtra(EXTRA_LEAGUE)
        println(league)
    }
}
