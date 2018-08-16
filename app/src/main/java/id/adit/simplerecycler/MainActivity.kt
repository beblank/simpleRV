package id.adit.simplerecycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //recyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        recyclerView.layoutManager = GridLayoutManager(this, 3)
        val users = ArrayList<User>()
        users.add(User("adit", "30"))
        users.add(User("dodol", "28"))
        users.add(User("adi", "27"))
        users.add(User("wijaya", "30"))

        val adapter = DataAdapter(users)
        recyclerView.adapter = adapter
    }
}
