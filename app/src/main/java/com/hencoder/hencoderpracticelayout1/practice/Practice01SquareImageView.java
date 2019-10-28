package com.hencoder.hencoderpracticelayout1.practice;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ImageView;

/**
 * 需要把它写成正方形的 ImageView
 */
public class Practice01SquareImageView extends ImageView {
    private static final String TAG = "111";

    public Practice01SquareImageView(Context context) {
        super(context);
    }

    public Practice01SquareImageView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice01SquareImageView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    /**
     * 重写 onMeasure()，调整尺寸，让 ImageView 总是正方形
     */
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

        Log.e(TAG, "onMeasure: "+getMeasuredHeight()+"  "+getMeasuredWidth() );

        int pWidth = getMeasuredWidth();
        int pHeight = getMeasuredHeight();

        int width;
        int height;
        if (pWidth > pHeight) {
            width = pHeight;
            height = pHeight;
        } else {
            width=pWidth;
            height = pWidth;
        }
        setMeasuredDimension(width,height);

        // 先用 getMeasuredWidth() 和 getMeasuredHeight() 取到 super.onMeasure() 的计算结果

        // 然后通过计算，让宽度和高度一致

        // 再用 setMeasuredDimension(width, height) 来保存最终的宽度和高度
    }
}
