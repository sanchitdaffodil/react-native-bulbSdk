package datamanager.response

import android.content.Context
import android.graphics.Color
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import org.json.JSONObject
import java.io.Serializable
import java.lang.Exception

class CommentStyle : Serializable {
    var backgroundColor: Int
    var fontColor: Int
    var textAlign: String
    @SerializedName("bg_color")
    @Expose
    var bg_color : RGBColor? = null

    @SerializedName("font_color")
    @Expose
    var font_color : RGBColor? = null

    @SerializedName("text_align")
    @Expose
    var text_align: String? = null

    companion object {
        const val KEY_BGCOLOR = "bg_color"
        const val KEY_FONTCOLOR = "font_color"
        const val KEY_TEXTALIGN = "text_align"
        const val KEY_RCOLOR = "R"
        const val KEY_GCOLOR = "G"
        const val KEY_BCOLOR = "B"
        const val KEY_ACOLOR = "A"
        fun parseFromJSON(`object`: JSONObject): CommentStyle {
            val style = CommentStyle()
            try {
                // background color
                val bgColorJSONObject = `object`.getJSONObject(KEY_BGCOLOR)
                var A_ch = 255
                var R_ch = 0
                var G_ch = 0
                var B_ch = 0
                if (bgColorJSONObject.has(KEY_ACOLOR)) {
                    A_ch = bgColorJSONObject.getInt(KEY_ACOLOR)
                }
                if (bgColorJSONObject.has(KEY_RCOLOR)) {
                    R_ch = bgColorJSONObject.getInt(KEY_RCOLOR)
                }
                if (bgColorJSONObject.has(KEY_GCOLOR)) {
                    G_ch = bgColorJSONObject.getInt(KEY_GCOLOR)
                }
                if (bgColorJSONObject.has(KEY_BCOLOR)) {
                    B_ch = bgColorJSONObject.getInt(KEY_BCOLOR)
                }
                style.backgroundColor = Color.argb(255, R_ch, G_ch, B_ch)
                // font color
                val fontColorJSONObject = `object`.getJSONObject(KEY_FONTCOLOR)
                A_ch = 255
                R_ch = 255
                G_ch = 255
                B_ch = 255
                if (fontColorJSONObject.has(KEY_ACOLOR)) {
                    A_ch = fontColorJSONObject.getInt(KEY_ACOLOR)
                }
                if (fontColorJSONObject.has(KEY_RCOLOR)) {
                    R_ch = fontColorJSONObject.getInt(KEY_RCOLOR)
                }
                if (fontColorJSONObject.has(KEY_GCOLOR)) {
                    G_ch = fontColorJSONObject.getInt(KEY_GCOLOR)
                }
                if (fontColorJSONObject.has(KEY_BCOLOR)) {
                    B_ch = fontColorJSONObject.getInt(KEY_BCOLOR)
                }
                style.fontColor = Color.argb(255, R_ch, G_ch, B_ch)
                // text align
                if (`object`.has(KEY_TEXTALIGN)) {
                    style.textAlign = `object`.getString(KEY_TEXTALIGN)
                }
            } catch (e: Exception) {
                style.textAlign = "left"
                style.backgroundColor = Color.argb(255, 255, 255, 255)
                style.fontColor = Color.argb(255, 0, 0, 0)
            }
            return style
        }

        fun parseFromJSON(ctx: Context?, `object`: JSONObject): CommentStyle {
            // for backward compatibility
            return parseFromJSON(`object`)
        }
    }

    init {
        backgroundColor = Color.argb(0, 0, 0, 0)
        fontColor = Color.argb(0, 0, 0, 0)
        textAlign = "left"
    }
}