package versignassi.com.swoosh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SkillActvity : AppCompatActivity() {
    var league = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill_actvity)
        league = intent.getStringExtra(EXTRA_LEAGUE)
        println(league)
    }
}
