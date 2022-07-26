package ir.MrMohamadHosein.animation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.animation.*
import ir.MrMohamadHosein.animation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        // Alpha Animation =>
        binding.btnAnim.setOnClickListener {
            useAnimFromXML()
        }

    }

    private fun scaleAnimation() :ScaleAnimation {

        val anim1 = ScaleAnimation(
            1f, 2f, 1f, 2f
        )
        anim1.duration = 2000
        anim1.fillAfter = true

        // ------------------------------------

        val anim2 = ScaleAnimation(
            1f, 2f, 1f, 2f,
            Animation.RELATIVE_TO_SELF, 0.5f,
            Animation.RELATIVE_TO_SELF, 0.5f
        )
        anim2.duration = 3000
        anim2.fillAfter = true

        return anim2

    }

    private fun rotateAnimation() :RotateAnimation {

        val anim1 = RotateAnimation(0f, 360f)
        anim1.duration = 2000
        anim1.fillAfter = true
        anim1.repeatCount = 10

        // ----------------------------------

        val anim2 = RotateAnimation(
            0f, 360f,
            Animation.RELATIVE_TO_SELF, 0.5f,
            Animation.RELATIVE_TO_SELF, 0.5f
        )
        anim2.duration = 2000
        anim2.fillAfter = true
        anim2.repeatCount = 10

        return anim2
    }

    private fun useMultipleAnimations() {

        val animSet = AnimationSet(true)

        animSet.addAnimation( rotateAnimation() )
        animSet.addAnimation( scaleAnimation() )

        animSet.duration = 3000
        animSet.fillAfter = true
        animSet.repeatCount = 4

        binding.imgAnim.startAnimation( animSet )

    }

    private fun useAnimFromXML() {

        val anim = AnimationUtils.loadAnimation(this , R.anim.anim_alpha)
        anim.fillAfter = true

        binding.imgAnim.startAnimation(anim)

    }


}
