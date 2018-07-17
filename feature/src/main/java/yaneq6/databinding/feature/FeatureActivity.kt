package yaneq6.databinding.feature

import android.app.Activity
import android.databinding.DataBindingUtil
import android.os.Bundle
import yaneq6.databinding.feature.databinding.ActivityFeatureBinding

class FeatureActivity: Activity() {

    private val binding by lazy { DataBindingUtil.setContentView<ActivityFeatureBinding>(this, R.layout.activity_feature) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.model = FeatureViewModel()
    }

    override fun onDestroy() {
        binding.unbind()
        super.onDestroy()
    }

}
