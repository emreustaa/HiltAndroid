package com.example.examplehiltprojects

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class Musician @Inject constructor(instrument: Instrument,band: Band)  {

    fun sing(){
        println("working..")
    }
}