package com.cabudev.horoscapp.ui.horoscope.adapter

import android.view.View
import android.view.animation.LinearInterpolator
import androidx.recyclerview.widget.RecyclerView
import com.cabudev.horoscapp.databinding.ItemHoroscopeBinding
import com.cabudev.horoscapp.domain.model.HoroscopeInfo

class HoroscopeViewHolder(view: View): RecyclerView.ViewHolder(view) {

    private val binding = ItemHoroscopeBinding.bind(view)

    fun render(horoscopeInfo: HoroscopeInfo, onItemSelected: (HoroscopeInfo) -> Unit, ){
        val context = binding.ivHoroscope.context
        binding.ivHoroscope.setImageResource(horoscopeInfo.img)
        binding.tvHoroscopeName.text = context.getString(horoscopeInfo.name)
        binding.itemParent.setOnClickListener{
            startScaleAnimation(binding.ivHoroscope, newLambda = {onItemSelected(horoscopeInfo)})
        //onItemSelected(horoscopeInfo)
        }
    }

    private fun startScaleAnimation(view: View, newLambda:()->Unit) {
        view.animate().apply {
            duration = 250
            interpolator = LinearInterpolator()
            scaleY(1.5f)
            scaleX(1.5f)

            withEndAction{endScaleAnimation(view, newLambda)}
            start()
        }
    }

    private fun endScaleAnimation(view:View, newLambda: () -> Unit) {
        view.animate().apply {
            duration = 250
            interpolator = LinearInterpolator()
            scaleY(1f)
            scaleX(1f)
            withEndAction{newLambda()}
            start()
        }

    }
}