package com.example.drawingapp

import android.content.Context
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import android.util.AttributeSet
import android.view.View

class DrawingView(context:Context,attribute:AttributeSet): View(context,attribute)
{

    private var mDrawPath: CustomPath? = null
    private var mCanvasBitmap : Bitmap? = null
    private var mCanvasPaint : Paint? = null
    private var mDrawPaint : Paint? = null
    private var mBrushSize : Float = 0.toFloat()
    private var color = Color.BLACK
    private var canvas:Canvas? = null

    init{

        setUpDrawing()

    }

    private fun setUpDrawing(){



    }

    internal inner class CustomPath(var color: Int,var brushThickness: Float): Path(){



    }


}