package versignassi.com.swoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league_activity.*
import java.nio.file.attribute.AclFileAttributeView

class League_activity : BaseActivity() {

    var selectedLeague = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league_activity)
    }


    fun onMensClicked(view: View)
    {
        womensLeagueBtn.isChecked = false
        coedClickBtn.isChecked = false
        selectedLeague = "mens"
    }

    fun onWomensClicked(view: View)
    {
        mensLeagueBtn.isChecked = false
        coedClickBtn.isChecked = false
        selectedLeague = "womens"
    }

    fun onCoedClicked(view: View)
    {
        womensLeagueBtn.isChecked = false
        mensLeagueBtn.isChecked = false
        selectedLeague = "co-ed"
    }


    fun leagueNextClicked(view: View)
    {
        if(selectedLeague != "")
        {
            val skillActivity = Intent(this, SkillActvity::class.java)
            skillActivity.putExtra(EXTRA_LEAGUE, selectedLeague)
            startActivity(skillActivity)
        } else {
            Toast.makeText( this, "Please selected a league", Toast.LENGTH_SHORT).show()

        }

    }
}
