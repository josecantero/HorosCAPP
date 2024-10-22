package com.cabudev.horoscapp.domain.model

import com.cabudev.horoscapp.R

sealed class HoroscopeInfo(val img: Int, val name:Int){
    object Aries:HoroscopeInfo(R.drawable.aries, R.string.aries)
    object Tauro:HoroscopeInfo(R.drawable.tauro, R.string.tauro)
    object Geminis:HoroscopeInfo(R.drawable.geminis, R.string.geminis)
    object Cancer:HoroscopeInfo(R.drawable.cancer, R.string.cancer)
    object Leo:HoroscopeInfo(R.drawable.leo, R.string.leo)
    object Virgo:HoroscopeInfo(R.drawable.virgo, R.string.virgo)
    object Libra:HoroscopeInfo(R.drawable.libra, R.string.libra)
    object Scorpio:HoroscopeInfo(R.drawable.scorpio, R.string.scorpio)
    object Sagitario:HoroscopeInfo(R.drawable.sagitario, R.string.sagitario)
    object Capricornio:HoroscopeInfo(R.drawable.capricornio, R.string.capricornio)
    object Acuario:HoroscopeInfo(R.drawable.acuario, R.string.acuario)
    object Pisis:HoroscopeInfo(R.drawable.pisis, R.string.pisis)
}