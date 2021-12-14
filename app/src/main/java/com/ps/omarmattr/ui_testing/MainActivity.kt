package com.ps.omarmattr.ui_testing

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.ps.omarmattr.ui_testing.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), GenericAdapter.OnListItemViewClickListener<Item> {
    private val mBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    private val mAdapter by lazy {
        GenericAdapter(R.layout.item_recycle, BR.item, this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(mBinding.root)


        mAdapter.data = arrayListOf(
            Item("Omar", Color.BLUE),
            Item("Hadi", Color.RED),
            Item("Osama", Color.BLACK),
            Item("Osos", Color.YELLOW),
            Item("Omar", Color.GREEN),
            Item("Prince", Color.GRAY),
            Item("Osama", Color.MAGENTA),

            )
        mBinding.rcItems.apply {
            adapter = mAdapter
        }
    }

    override fun onClickItem(itemViewModel: Item, type: Int) {
        Toast.makeText(
            this,
            itemViewModel.name,
            Toast.LENGTH_SHORT
        ).show()
    }
}