package io.tissue.base_kotlin

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
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


        writeLogBtn.setOnClickListener {
            Log.d("로깅 버튼", "디버깅 로그")
            Log.e("로깅 버튼", "에러 로그")
        }


        toastBtn.setOnClickListener {
            // 사용자에게 "버튼 클릭" 안내 문구 제공

            Toast.makeText(this, "사용자가 버튼을 눌렀습니다.", Toast.LENGTH_SHORT).show()
        }


        alertBtn.setOnClickListener {
            val dialog = AlertDialog.Builder(this)
            dialog.setTitle("알림!")
            dialog.setMessage("버튼을 클릭하셨습니다.")
            dialog.show()
        }

        toastContentShowBtn.setOnClickListener {
            Toast.makeText(this, toastContent.text.toString(), Toast.LENGTH_SHORT).show()
        }

        textViewContentShowBtn.setOnClickListener {
            when {
                textViewContent.text.toString() == "안녕하세요." -> {
                    Toast.makeText(this, "인사.", Toast.LENGTH_SHORT).show()
                }
                textViewContent.text.toString() == "안녕히 가세요.." -> {
                    Toast.makeText(this, "직별인사", Toast.LENGTH_SHORT).show()
                }
                textViewContent.text.toString() == "맛있게 드세요." -> {
                    Toast.makeText(this, "식사인사", Toast.LENGTH_SHORT).show()
                }
                else -> {
                    Toast.makeText(this, "테스트", Toast.LENGTH_SHORT).show()
                }
            }
        }


        msgShowBtn.setOnClickListener {
            val hello = helloMsgText.text.toString()
            Log.d("추가 내용1", hello)
            Log.d("출력 내용2", "Toast에 출력될 내용은 $hello 입니다.")

            Toast.makeText(this, "$hello 코틀린~", Toast.LENGTH_SHORT).show()

        }

    }
}