package com.cabudev.horoscapp.data.provider

import com.cabudev.horoscapp.domain.model.HoroscopeInfo
import com.cabudev.horoscapp.domain.model.HoroscopeInfo.*
import javax.inject.Inject

class HoroscopeProvider @Inject constructor(){
    fun getHoroscope():List<HoroscopeInfo>{
        return listOf(
            Aries, Tauro, Geminis,
            Cancer, Leo, Virgo,
            Libra, Scorpio, Sagitario,
            Capricornio, Acuario, Pisis
        )
    }
}