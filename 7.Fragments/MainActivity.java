package example.javatpoint.com.fragmentexample;

import android.support.v7.app.AppCompatActivity; 
import android.os.Bundle;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState); 
    setContentView(R.layout.activity_main);
  }
}

File: Fragment1.java
package example.javatpoint.com.fragmentexample; 
import android.os.Bundle;
import android.support.v4.app.Fragment; 
import android.view.LayoutInflater; 
import android.view.View;
import android.view.ViewGroup;
public class Fragment1 extends Fragment { @Override
public void onCreate(Bundle savedInstanceState) { 
  super.onCreate(savedInstanceState);
}
@Override
public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
// Inflate the layout for this fragment
return inflater.inflate(R.layout.fragment_fragment1, container, false);
}
}

File: Fragment2.java
package example.javatpoint.com.fragmentexample;
import android.os.Bundle;
import android.support.v4.app.Fragment; import android.view.LayoutInflater; import android.view.View;
 
import android.view.ViewGroup;
public class Fragment2 extends Fragment { @Override
public void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState);
}
@Override
public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
// Inflate the layout for this fragment
return inflater.inflate(R.layout.fragment_fragment2, container, false);
}
}
