package pop.uz;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int pointsFighterA = 0;
    int pointsFighterB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Displays the given points for Fighter A.
     */
    public void displayForFighterA(int points) {
        TextView pointView = findViewById(R.id.fighter_a_points);
        pointView.setText(String.valueOf(points));
    }

    public void addFiveForFighterA(View view) {
        pointsFighterA = pointsFighterA + 5;
        displayForFighterA(pointsFighterA);
    }

    public void addFourForFighterA(View view) {
        pointsFighterA = pointsFighterA + 4;
        displayForFighterA(pointsFighterA);
    }

    public void addThreeForFighterA(View view) {
        pointsFighterA = pointsFighterA + 3;
        displayForFighterA(pointsFighterA);
    }

    public void addOneForFighterA(View view) {
        pointsFighterA = pointsFighterA + 1;
        displayForFighterA(pointsFighterA);
    }

    /**
     * Displays the given points for Fighter B.
     */
    public void displayForFighterB(int points) {
        TextView pointView = findViewById(R.id.fighter_b_points);
        pointView.setText(String.valueOf(points));
    }

    public void addFiveForFighterB(View view) {
        pointsFighterB = pointsFighterB + 5;
        displayForFighterB(pointsFighterB);
    }

    public void addFourForFighterB(View view) {
        pointsFighterB = pointsFighterB + 4;
        displayForFighterB(pointsFighterB);
    }

    public void addThreeForFighterB(View view) {
        pointsFighterB = pointsFighterB + 3;
        displayForFighterB(pointsFighterB);
    }

    public void addOneForFghterB(View view) {
        pointsFighterB = pointsFighterB + 1;
        displayForFighterB(pointsFighterB);
    }

    public void reset(View view) {
        displayForFighterA(0);
        displayForFighterB(0);
        pointsFighterA = 0;
        pointsFighterB = 0;
    }
}
