package com.jaeyoung.multiradiogroupview

import android.content.Context
import android.util.AttributeSet
import android.widget.LinearLayout
import android.widget.RadioGroup

class MultiRadioGroupView : LinearLayout {
    var viewGroupList = mutableListOf<RadioGroup>()
    lateinit var multiRadioGroup : MultiRadioGroup
    constructor(context: Context) : super(context) {
        init()
    }

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        init()
    }

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ) {
        init()
    }

    override fun onLayout(changed: Boolean, l: Int, t: Int, r: Int, b: Int) {
        super.onLayout(changed, l, t, r, b)
        init()
    }

    private fun init(){
        this.orientation = VERTICAL
        viewGroupList.clear()
        for(i in 0 until this.childCount){
            if(this.getChildAt(i) is RadioGroup)
                viewGroupList.add(this.getChildAt(i) as RadioGroup)
        }
        multiRadioGroup = MultiRadioGroup(viewGroupList)
    }

    fun refreshView(){
        init()
    }

    fun getCheckedName() : String{
        return multiRadioGroup.getCheckedRadioName()
    }

    fun getCheckId() : Int{
        return multiRadioGroup.getCheckedId()
    }
}