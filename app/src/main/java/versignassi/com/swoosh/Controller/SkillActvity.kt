package versignassi.com.swoosh.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import versignassi.com.swoosh.Model.Player
import versignassi.com.swoosh.Utilities.EXTRA_LEAGUE
import versignassi.com.swoosh.R
import versignassi.com.swoosh.Utilities.EXTRA_PLAYER

class SkillActvity : AppCompatActivity() {
    var league = ""
    lateinit var player : Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill_actvity)
        player = intent.getParcelableExtra(EXTRA_PLAYER)
        println("Player: " + player.skill)
    }
}
