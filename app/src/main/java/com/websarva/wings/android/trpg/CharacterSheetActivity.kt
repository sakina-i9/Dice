package com.websarva.wings.android.trpg

import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class CharacterSheetActivity : AppCompatActivity(){

    private lateinit var str1diceImageView: ImageView
    private lateinit var str2diceImageView: ImageView
    private lateinit var str3diceImageView: ImageView
    private lateinit var con1diceImageView: ImageView
    private lateinit var con2diceImageView: ImageView
    private lateinit var con3diceImageView: ImageView
    private lateinit var pow1diceImageView: ImageView
    private lateinit var pow2diceImageView: ImageView
    private lateinit var pow3diceImageView: ImageView
    private lateinit var dex1diceImageView: ImageView
    private lateinit var dex2diceImageView: ImageView
    private lateinit var dex3diceImageView: ImageView
    private lateinit var app1diceImageView: ImageView
    private lateinit var app2diceImageView: ImageView
    private lateinit var app3diceImageView: ImageView
    private lateinit var siz1diceImageView: ImageView
    private lateinit var siz2diceImageView: ImageView
    private lateinit var int1diceImageView: ImageView
    private lateinit var int2diceImageView: ImageView
    private lateinit var edu1diceImageView: ImageView
    private lateinit var edu2diceImageView: ImageView
    private lateinit var edu3diceImageView: ImageView
    private lateinit var assets1diceImageView: ImageView
    private lateinit var assets2diceImageView: ImageView
    private lateinit var assets3diceImageView: ImageView

    private val dice = arrayOf(
        R.drawable.saikoro_illust1,
        R.drawable.saikoro_illust2,
        R.drawable.saikoro_illust3,
        R.drawable.saikoro_illust4,
        R.drawable.saikoro_illust5,
        R.drawable.saikoro_illust6
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.character_sheet)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.character_sheet)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        str1diceImageView = findViewById(R.id.str_dice1)
        str2diceImageView = findViewById(R.id.str_dice2)
        str3diceImageView = findViewById(R.id.str_dice3)
        con1diceImageView = findViewById(R.id.con_dice1)
        con2diceImageView = findViewById(R.id.con_dice2)
        con3diceImageView = findViewById(R.id.con_dice3)
        pow1diceImageView = findViewById(R.id.pow_dice1)
        pow2diceImageView = findViewById(R.id.pow_dice2)
        pow3diceImageView = findViewById(R.id.pow_dice3)
        dex1diceImageView = findViewById(R.id.dex_dice1)
        dex2diceImageView = findViewById(R.id.dex_dice2)
        dex3diceImageView = findViewById(R.id.dex_dice3)
        app1diceImageView = findViewById(R.id.app_dice1)
        app2diceImageView = findViewById(R.id.app_dice2)
        app3diceImageView = findViewById(R.id.app_dice3)
        siz1diceImageView = findViewById(R.id.siz_dice1)
        siz2diceImageView = findViewById(R.id.siz_dice2)
        int1diceImageView = findViewById(R.id.Int_dice1)
        int2diceImageView = findViewById(R.id.Int_dice2)
        edu1diceImageView = findViewById(R.id.edu_dice1)
        edu2diceImageView = findViewById(R.id.edu_dice2)
        edu3diceImageView = findViewById(R.id.edu_dice3)
        assets1diceImageView = findViewById(R.id.assets_dice1)
        assets2diceImageView = findViewById(R.id.assets_dice2)
        assets3diceImageView = findViewById(R.id.assets_dice3)

        val STRbutton = findViewById<Button>(R.id.str_btn)
        STRbutton.setOnClickListener{
            shakedice("str")
        }

        val CONbutton = findViewById<Button>(R.id.con_btn)
        CONbutton.setOnClickListener{
            shakedice("con")
        }

        val POWbutton = findViewById<Button>(R.id.pow_btn)
        POWbutton.setOnClickListener{
            shakedice("pow")
        }

        val DEXbutton = findViewById<Button>(R.id.dex_btn)
        DEXbutton.setOnClickListener{
            shakedice("dex")
        }

        val APPbutton = findViewById<Button>(R.id.app_btn)
        APPbutton.setOnClickListener{
            shakedice("app")
        }

        val SIZbutton = findViewById<Button>(R.id.siz_btn)
        SIZbutton.setOnClickListener{
            shakedice("siz")
        }

        val INTbutton = findViewById<Button>(R.id.Int_btn)
        INTbutton.setOnClickListener{
            shakedice("int")
        }

        val EDUbutton = findViewById<Button>(R.id.edu_btn)
        EDUbutton.setOnClickListener{
            shakedice("edu")
        }

        val ASSETSbutton = findViewById<Button>(R.id.assets_btn)
        ASSETSbutton.setOnClickListener{
            shakedice("assets")
        }
    }

    private fun shakedice(attribute:String){
        object : CountDownTimer(1000, 100) {
            override fun onTick(millisUntilFinished: Long) {
                val diceImageViews : List<ImageView> = if(attribute == "str"){
                    listOf(str1diceImageView, str2diceImageView, str3diceImageView)
                } else if(attribute == "con"){
                    listOf(con1diceImageView,con2diceImageView,con3diceImageView)
                } else if(attribute == "pow"){
                    listOf(pow1diceImageView,pow2diceImageView,pow3diceImageView)
                } else if(attribute == "dex"){
                    listOf(dex1diceImageView,dex2diceImageView,dex3diceImageView)
                } else if(attribute == "app"){
                    listOf(app1diceImageView,app2diceImageView,app3diceImageView)
                } else if(attribute == "siz"){
                    listOf(siz1diceImageView,siz2diceImageView)
                } else if(attribute == "int"){
                    listOf(int1diceImageView,int2diceImageView)
                } else if(attribute == "edu"){
                    listOf(edu1diceImageView,edu2diceImageView,edu3diceImageView)
                } else if(attribute == "assets"){
                    listOf(assets1diceImageView,assets2diceImageView,assets3diceImageView)
                } else {
                    emptyList()
                }
                diceImageViews.forEach { imageView ->
                    val randomIndex = dice.indices.random()
                    imageView.setImageResource(dice[randomIndex])
                }
            }

            override fun onFinish() {
                val diceImageViews : List<ImageView> = if(attribute == "str"){
                    listOf(str1diceImageView, str2diceImageView, str3diceImageView)
                } else if(attribute == "con"){
                    listOf(con1diceImageView,con2diceImageView,con3diceImageView)
                } else if(attribute == "pow"){
                    listOf(pow1diceImageView,pow2diceImageView,pow3diceImageView)
                } else if(attribute == "dex"){
                    listOf(dex1diceImageView,dex2diceImageView,dex3diceImageView)
                } else if(attribute == "app"){
                    listOf(app1diceImageView,app2diceImageView,app3diceImageView)
                } else if(attribute == "siz"){
                    listOf(siz1diceImageView,siz2diceImageView)
                } else if(attribute == "int"){
                    listOf(int1diceImageView,int2diceImageView)
                } else if(attribute == "edu"){
                    listOf(edu1diceImageView,edu2diceImageView,edu3diceImageView)
                } else if(attribute == "assets"){
                    listOf(assets1diceImageView,assets2diceImageView,assets3diceImageView)
                } else {
                    emptyList()
                }
                val diceresults = mutableListOf<Int>()
                val strsumtext : TextView = findViewById(R.id.str_sum)
                val consumtext : TextView = findViewById(R.id.con_sum)
                val powsumtext : TextView = findViewById(R.id.pow_sum)
                val dexsumtext : TextView = findViewById(R.id.dex_sum)
                val appsumtext : TextView = findViewById(R.id.app_sum)
                val sizsumtext : TextView = findViewById(R.id.siz_sum)
                val intsumtext : TextView = findViewById(R.id.Int_sum)
                val edusumtext : TextView = findViewById(R.id.edu_sum)
                val assetssumtext : TextView = findViewById(R.id.assets_sum)
                diceImageViews.forEach { imageView ->
                    val finalIndex = dice.indices.random()
                    imageView.setImageResource(dice[finalIndex])
                    diceresults.add(finalIndex+1)
                }
                val dicesum = diceresults.sum()
                if(attribute == "str"){
                    strsumtext.text="$dicesum"
                }else if(attribute == "con"){
                    consumtext.text="$dicesum"
                }else if(attribute == "pow"){
                    powsumtext.text="$dicesum"
                }else if(attribute == "dex"){
                    dexsumtext.text="$dicesum"
                }else if(attribute == "app"){
                    appsumtext.text="$dicesum"
                }else if(attribute == "siz"){
                    sizsumtext.text="$dicesum"
                }else if(attribute == "int"){
                    intsumtext.text="$dicesum"
                }else if(attribute == "edu"){
                    edusumtext.text="$dicesum"
                }else if(attribute == "assets"){
                    assetssumtext.text="$dicesum"
                }
            }
        }.start()
    }

}