package com.example.examplehiltprojects

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    // Field Injection
    @Inject
    lateinit var lars: Musician

    @Inject
    lateinit var myClass : ClassExample

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        val band = Band()
        val instrument = Instrument()
        val musician = Musician(instrument, band)

        musician.sing()*/
        lars.sing()

        println(myClass.myFunction())
        println(myClass.secondFunction())
    }
}

@AndroidEntryPoint
class FragmentExample() : Fragment() {
    @Inject
    lateinit var kirk: Musician
}