package com.websarva.wings.android.trpg

import android.content.Context
import android.content.DialogInterface
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.MotionEvent
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView

class CustomButton @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : LinearLayout(context, attrs, defStyleAttr){
    init{
        LayoutInflater.from(context).inflate(R.layout.custombtn,this)
    }

    private var listener: OnClickListener? = null
    // setOnClickListenerメソッドのオーバーライド
    override fun setOnClickListener(l: OnClickListener?) {
        listener = l
    }

    // タッチイベントの処理
    override fun dispatchTouchEvent(ev: MotionEvent): Boolean {
        if (ev.action == MotionEvent.ACTION_UP) {
            listener?.let {
                post { it.onClick(this) } // UIスレッドでonClickを呼び出し
            }
        }
        return super.dispatchTouchEvent(ev)
    }

    fun setchoice(imageResId: Int, name: String) {
        findViewById<ImageView>(R.id.button_image).setImageResource(imageResId)
        findViewById<TextView>(R.id.button_text).text = name
    }

}