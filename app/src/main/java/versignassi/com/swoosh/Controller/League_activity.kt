package versignassi.com.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league_activity.*
import versignassi.com.swoosh.Model.Player
import versignassi.com.swoosh.Utilities.EXTRA_LEAGUE
import versignassi.com.swoosh.R
import versignassi.com.swoosh.Utilities.EXTRA_PLAYER

class League_activity : BaseActivity() {

    var selectedLeague = ""
    var player = Player("","")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league_activity)
    }


    fun onMensClicked(view: View)
    {
        womensLeagueBtn.isChecked = false
        coedClickBtn.isChecked = false
        selectedLeague = "mens"
        player.league = selectedLeague
    }

    fun onWomensClicked(view: View)
    {
        mensLeagueBtn.isChecked = false
        coedClickBtn.isChecked = false
        selectedLeague = "womens"
        player.league = selectedLeague
    }

    fun onCoedClicked(view: View)
    {
        womensLeagueBtn.isChecked = false
        mensLeagueBtn.isChecked = false
        selectedLeague = "co-ed"
        player.league = selectedLeague
    }


    fun leagueNextClicked(view: View)
    {
        if(player.league != "")
        {
            val skillActivity = Intent(this, SkillActvity::class.java)
            skillActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(skillActivity)
        } else {
            Toast.makeText( this, "Please selected a league", Toast.LENGTH_SHORT).show()

        }

    }
}
