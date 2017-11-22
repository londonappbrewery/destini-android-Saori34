package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView mT1_story;
    private Button mT1_ans1;
    private Button mT1_ans2;
    private int mStoryIndex = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mT1_story = (TextView) findViewById(R.id.storyTextView);
        mT1_ans1 = (Button) findViewById(R.id.buttonTop);
        mT1_ans2 = (Button) findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mT1_ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (mStoryIndex == 1) {
                    mT1_story.setText(R.string.T3_Story);
                    mT1_ans1.setText(R.string.T3_Ans1);
                    mT1_ans2.setText(R.string.T3_Ans2);
                    mStoryIndex = 3;
                }else if (mStoryIndex == 3){
                    mT1_story.setText(R.string.T6_End);
                    mT1_ans1.setVisibility(View.GONE);
                    mT1_ans2.setVisibility(View.GONE);
                }else if (mStoryIndex ==2){
                    mT1_story.setText(R.string.T3_Story);
                    mT1_ans1.setText(R.string.T3_Ans1);
                    mT1_ans2.setText(R.string.T3_Ans2);
                    mStoryIndex = 3;
                }
            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mT1_ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (mStoryIndex == 1){
                    mT1_story.setText(R.string.T2_Story);
                    mT1_ans1.setText(R.string.T2_Ans1);
                    mT1_ans2.setText(R.string.T2_Ans2);
                    mStoryIndex = 2;
                }else if(mStoryIndex == 3){
                    mT1_story.setText(R.string.T5_End);
                    mT1_ans1.setVisibility(View.GONE);
                    mT1_ans2.setVisibility(View.GONE);
                }else if(mStoryIndex == 2){
                    mT1_story.setText(R.string.T4_End);
                    mT1_ans1.setVisibility(View.GONE);
                    mT1_ans2.setVisibility(View.GONE);
                }
            }
        });

    }
}
