package ir.MrMohamadHosein.animation

import android.animation.Animator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ir.MrMohamadHosein.animation.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.lottieMain.playAnimation()

        binding.btnAnim.setOnClickListener {

        }

        binding.lottieMain.addAnimatorListener( object :Animator.AnimatorListener {
            override fun onAnimationStart(animation: Animator?) {
                
            }

            override fun onAnimationEnd(animation: Animator?) {

            }

            override fun onAnimationCancel(animation: Animator?) {

            }

            override fun onAnimationRepeat(animation: Animator?) {

            }
        } )

    }
}