package com.dwicandra.pesanbotol

import android.content.Context
import android.graphics.Typeface
import android.text.SpannableString
import android.text.Spanned
import android.text.style.ForegroundColorSpan
import android.text.style.StyleSpan
import android.text.style.UnderlineSpan
import android.widget.TextView
import androidx.core.content.ContextCompat

class Utils {
    companion object {
        fun getColoredSpanned(text: String, color: String): String? {
            return "<font color=$color>$text</font>"
        }

        fun setTextColor(
            context: Context,
            tv: TextView,
            startPosition: Int,
            endPosition: Int
        ) {
            val spannableStr = SpannableString(tv.text)

            val underlineSpan = UnderlineSpan()
            spannableStr.setSpan(
                underlineSpan,
                startPosition,
                endPosition,
                Spanned.SPAN_INCLUSIVE_EXCLUSIVE
            )

            val backgroundColorSpan = ForegroundColorSpan(
                ContextCompat.getColor(
                    context,
                    R.color.blue_200
                )
            )
            spannableStr.setSpan(
                backgroundColorSpan,
                startPosition,
                endPosition,
                Spanned.SPAN_INCLUSIVE_EXCLUSIVE
            )

            val styleSpanItalic = StyleSpan(Typeface.BOLD)
            spannableStr.setSpan(
                styleSpanItalic,
                startPosition,
                endPosition,
                Spanned.SPAN_INCLUSIVE_EXCLUSIVE
            )

            tv.text = spannableStr
        }
    }
}