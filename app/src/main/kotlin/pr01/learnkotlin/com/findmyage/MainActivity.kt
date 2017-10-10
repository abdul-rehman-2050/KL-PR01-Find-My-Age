package pr01.learnkotlin.com.findmyage

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {



    //==================================================
    //Class Level Gobal Variable Area
    //==================================================


    /*------- Default On Create method ------*/
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //---------  Looking for controls ----------------
        tvOutputAge.setTextColor(Color.BLUE)
        /*hint will be provided to user so that He could enter Year of Birth*/
        editText.setHint("Enter Birth Year")
        editText.textSize = 35.3f       //just to make this more bigger

        //----------------- Button Click Listner ------------
        btnFindAge.setOnClickListener{

            val edtYearInText:String = editText.text.toString()
            val enteredYear = edtYearInText.toInt()
            val currentYear = Calendar.getInstance().get(Calendar.YEAR)


            /* Proper Year validation */

            if (enteredYear < 1900 || enteredYear>currentYear){

                /*
                *
                * First Check is made of year not less then 1900
                * The reason for this number is that, it is Expected that
                * No User will be more then 100 year old.
                * As current Year is 2017, At the time of writing this code
                *
                * Second Check is a must that The entered Year Should also not be
                * greater then Current year as No age is possible for the person who is not
                * born yet. :-)
                *
                *
                * Third check is not required explicitly as enteredYear = currentYear is acceptable
                *
                *
                * If all above are true It means User input an Invalid Data promt in approperiate way
                *
                * */

                tvOutputAge.text="InValid Birth Year!!!"
                tvOutputAge.setTextColor(Color.RED)




            }else{

                /*
                *
                * In Else condition if the Entered Year is a proper valid Year then
                * the calculation method of age is simple subtracting enteredYear from
                * currentYear.
                *
                * */

                val yourAge:Int = currentYear - enteredYear
                tvOutputAge.text="You Are $yourAge Years old !"
                tvOutputAge.setTextColor(Color.BLUE)

            }
            /* Finally Clear editText */
            editText.text.clear()

            //-----------------------------------------------------------
            // Toast is created for debuging Purposes
            //Toast.makeText(this,"Hurray ${tvOutputAge.text?.toString()}",Toast.LENGTH_SHORT).show();
            //----------------------------------------------------------------------------------------

        }




    }
}
