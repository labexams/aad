package com.javatpoint.optionmenu;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
public class MainActivity extends Activity
{
  @Override
  protected void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState); 
    setContentView(R.layout.activity_main);
  }
  @Override
  public boolean onCreateOptionsMenu(Menu menu){}
  @Override
  public boolean onOptionsItemSelected(MenuItem item)
  {
  switch (item.getItemId()){
  case R.id.item1:
  Toast.makeText(getApplicationContext(),"Item 1 Selected",Toast.LENGTH_LONG).show(); 
  return true;
  case R.id.item2:
  Toast.makeText(getApplicationContext(),"Item 2 Selected",Toast.LENGTH_LONG).show();
  return true; 
  case R.id.item3:
  Toast.makeText(getApplicationContext(),"Item 3 Selected",Toast.LENGTH_LONG).show(); 
  return true;
  default:
  return super.onOptionsItemSelected(item);
  }
  }
}
