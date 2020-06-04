package com.alapshin.materialissue1183

import android.content.Context
import android.util.AttributeSet
import androidx.annotation.AttrRes
import androidx.annotation.StyleRes
import com.google.android.material.button.MaterialButton
import com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap

class AccentButton @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    @AttrRes defStyleAttr: Int = R.attr.materialButtonStyle,
    @StyleRes defStyleRes: Int = R.style.AccentButtonStyle
) : MaterialButton(wrap(context, attrs, defStyleAttr, defStyleRes), attrs, defStyleAttr) {
}