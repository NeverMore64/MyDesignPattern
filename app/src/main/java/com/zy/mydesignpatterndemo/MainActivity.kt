package com.zy.mydesignpatterndemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zy.mydesignpatterndemo.factorymode.ConcreteFactory
import com.zy.mydesignpatterndemo.factorymode.ConcreteProductA
import com.zy.mydesignpatterndemo.factorymode.ConcreteProductB
import com.zy.mydesignpatterndemo.factorymode.Product
import com.zy.mydesignpatterndemo.singletonmode.MyEnumMode
import com.zy.mydesignpatterndemo.singletonmode.MyHungryMode
import com.zy.mydesignpatterndemo.singletonmode.MyLazyMode
import com.zy.mydesignpatterndemo.singletonmode.MyStaticInnerClassMode

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}
