package pr01.learnkotlin.com.findmyage

import android.graphics.Color
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.view.*
import android.widget.LinearLayout
import android.widget.LinearLayout.LayoutParams
import android.widget.TextView
import android.view.View.SYSTEM_UI_FLAG_IMMERSIVE
import android.view.View.SYSTEM_UI_FLAG_FULLSCREEN
import android.view.View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
import android.view.View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
import android.view.View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
import android.view.View.SYSTEM_UI_FLAG_LAYOUT_STABLE
import android.view.View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
import android.view.View.SYSTEM_UI_FLAG_FULLSCREEN
import android.view.View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
import android.view.View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
import android.view.View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
import android.view.View.SYSTEM_UI_FLAG_LAYOUT_STABLE
import android.animation.ObjectAnimator
import android.content.Intent
import android.view.animation.AnimationUtils
import android.view.animation.AnimationUtils.loadAnimation
import android.widget.ImageView
import java.util.*


/**
 * Created by mac on 12/10/2017.
 * This activity will be use as Splash Screen
 *
 */
class MySplash : AppCompatActivity(){


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        // Make Activity Complete Full Screen
        window.decorView.systemUiVisibility = (View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_FULLSCREEN
                or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY)

        setContentView(R.layout.splash_activity)

       /* val linearLayout = LinearLayout(this)
        val textView = TextView(this)
        val imgview = ImageView(this)

        val layoutParams = LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.MATCH_PARENT,1f)

        imgview.setImageDrawable(resources.getDrawable(R.drawable.circle))
        textView.text = "FIND MY AGE!"
        textView.textSize = 32.0f
        textView.setTextColor(Color.WHITE)
        textView.gravity = Gravity.CENTER

        textView.layoutParams = layoutParams

        linearLayout.orientation = LinearLayout.VERTICAL
        linearLayout.setBackgroundColor(resources.getColor(R.color.colorPrimaryDark))

        linearLayout.addView(imgview)
        linearLayout.addView(textView)


        setContentView(linearLayout)*/

      //  textView.animate().translationY(400f).withLayer().duration = 300
        //textView.animate().translationY(-400f).withLayer().duration = 2300



        // load animations
     //  val animFadeIn = AnimationUtils.loadAnimation(getApplicationContext(),
       //         R.anim.bounce);
        // start fade out animation
        //textView.startAnimation(animFadeIn);


        val timer = Timer()
        timer.schedule(object :TimerTask(){
            override fun run() {

                val intent:Intent = Intent(applicationContext,MainActivity2::class.java)
                startActivity(intent)
                finish()
            }


        },2000)




    }


    override fun onStart() {
        window.decorView.systemUiVisibility = (View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_FULLSCREEN
                or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY)
        super.onStart()
    }

}


