package versignassi.com.swoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import java.nio.file.attribute.AclFileAttributeView

class League_activity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league_activity)
    }

    fun leagueNextClicked(view: View)
    {
        val skillActivity = Intent(this, SkillActvity::class.java)
        startActivity(skillActivity)
    }

}
