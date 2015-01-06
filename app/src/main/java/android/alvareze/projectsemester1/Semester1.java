import android.alvareze.projectsemester1.Question;
import android.alvareze.projectsemester1.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class Semester1 extends Activity {

    public TextView;
    public Button falseButton;
    public Button trueButton;

    public ArrayList<Question> questions = new ArrayList<Question>();
    public int questionCount;
    }


    @Override
    public void onCreateOptionsMenu(Menu menu) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester1);

        questions.add(new Question("this is false", "false"));
        question.add(new Question("george washington has wooden teeth?", "true"));

        questionCount = questions.size();

        questionText = (TextView) findViewById(R.id.questionText);
        falseButton = (Button)findViewById(R.id.falseButton);
        trueButton = (Button)findViewById(R.id.trueButton);

        questionText.setText(questions.get(index).question);

                falseButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                public void onClick(View v){
                        if(questions.get(index).answer.equals("true")){
                            Toast toast = Toast.makeText(GetApplicationContext(), "Correct", Toast.LENGTH_SHORT);
                            toast.show();
                        }
                        else{
                            Toast toast = Toast.makeText()
                        }
                    }
                }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
