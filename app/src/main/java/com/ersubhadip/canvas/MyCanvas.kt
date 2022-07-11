package com.ersubhadip.canvas

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class MyCanvas(context: Context?, attrs: AttributeSet?) : View(context, attrs) {
    private var paint = Paint()

    init {
        paint.apply {
            color = Color.RED
            style = Paint.Style.FILL
        }
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        canvas?.drawColor(Color.BLACK)
        canvas?.drawCircle(
            this.width / 2F,
            this.height / 2F,
            100F,
            paint
        )

        canvas?.drawArc(
            this.width / 2F,
            0F,
            this.width / 1F,
            this.height / 2F,
            60F,
            1800F,
            false,
            paint
        )
        canvas?.drawArc(
            0F,
            0F,
            this.width / 2F,
            this.height / 2F,
            0F,
            360F,
            false,
            paint
        )
        canvas?.drawArc(
            0F,
            this.height / 2F,
            this.width / 2F,
            this.height / 1F,
            0F,
            360F,
            false,
            paint
        )
        canvas?.drawArc(
            this.width / 2F,
            this.height / 2F,
            this.width / 1F,
            this.height / 1F,
            0F,
            360F,
            false,
            paint
        )
    }
}

