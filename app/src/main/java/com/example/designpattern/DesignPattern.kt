package com.example.designpattern

import com.example.designpattern.designpattern.MVIActivity
import com.example.designpattern.designpattern.MVVMActivity
import kotlin.reflect.KClass

data class DesignPattern(val name : String, val exampleClass: KClass<*>)
enum class DesignPatternEnum(val exampleClass : KClass<*>){
    MVVM(MVVMActivity::class),
    MVI(MVIActivity::class)
}

