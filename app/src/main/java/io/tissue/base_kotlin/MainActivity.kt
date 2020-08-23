package io.tissue.base_kotlin

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
		clickMeBtn.setOnClickListener {
			// Click Me 버튼이 클릭되면 실행될 코드 {}
			// tag 어떤 종류의 로그인지?
			// msg 로그 내용
			Log.d("메인화면", "클릭미 버튼이 클릭됨")
		}
	}
}