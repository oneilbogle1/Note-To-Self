package com.example.oneilbogle.notetoself;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

/**
 * Created by oneilbogle on 2/15/18.
 */

public class Learn extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        //Declaring and allocating in one step
//        int[] ourArray = new int[20];
//
//        //Let's initialize ourArray using a for loop
//        //Because more than a few variables is allot of typing!
//
//        for(int i = 0; i < 20; i++){
//            //Put the value of ourValue into our array
//            //At the position determined by i.
//            ourArray[i] = i*5;
//
//            //Output what is going on
//            Log.i("info", "i = " + i);
//            Log.i("info", "ourArray[i] = " + ourArray[i]);
//        }




//        // Random object for generating question numbers
//        Random randInt = new Random();
//        // a variable to hold the random value generated
//                int questionNumber;
//
//        // declare and allocate in separate stages for clarity
//        // but we don't have to
//                String[][] countriesAndCities;
//        // Now we have a 2 dimensional array
//                countriesAndCities = new String[5][2];
//        // 5 arrays with 2 elements each
//        // Perfect for 5 "What's the capital city" questions
//        // Now we load the questions and answers into our arrays
//        // You could do this with less questions to save typing
//        // But don't do more or you will get an exception
//        countriesAndCities [0][0] = "United Kingdom";
//        countriesAndCities [0][1] = "London";
//        countriesAndCities [1][0] = "USA";
//        countriesAndCities [1][1] = "Washington";
//        countriesAndCities [2][0] = "India";
//        countriesAndCities [2][1] = "New Delhi";
//        countriesAndCities [3][0] = "Brazil";
//        countriesAndCities [3][1] = "Brasilia";
//        countriesAndCities [4][0] = "Kenya";
//        countriesAndCities [4][1] = "Nairobi";
//
//
//
//
//        /*
//        Now we know that the country is stored at element 0
//        The matching capital at element 1
//        Here are two variables that reflect this
//        */
//        int country = 0;
//        int capital = 1;
//        // A quick for loop to ask 3 questions
//        for(int i = 0; i < 3; i++){
//            // get a random question number between 0 and 4
//            questionNumber = randInt.nextInt(5);
//            // and ask the question and in this case just
//            // give the answer for the sake of brevity
//            Log.i("info", "The capital of "
//                    +countriesAndCities[questionNumber][country]);
//            Log.i("info", "is "
//                    +countriesAndCities[questionNumber][capital]);
//        } // end of for loop



//        // Random object for generating question numbers
//        Random randInt = new Random();
//
//        // a variable to hold the random value generated
//                int questionNumber;
//
//        // declare and allocate in separate stages for clarity
//        // but we don't have to
//                String[][] countriesAndCities;
//
//        // Now we have a 2 dimensional array
//                countriesAndCities = new String[5][2];
//
//        // 5 arrays with 2 elements each
//        // Perfect for 5 "What's the capital city" questions
//        // Now we load the questions and answers into our arrays
//        // You could do this with less questions to save typing
//        // But don't do more or you will get an exception
//        countriesAndCities [0][0] = "United Kingdom";
//        countriesAndCities [0][1] = "London";
//        countriesAndCities [1][0] = "USA";
//        countriesAndCities [1][1] = "Washington";
//        countriesAndCities [2][0] = "India";
//        countriesAndCities [2][1] = "New Delhi";
//        countriesAndCities [3][0] = "Brazil";
//        countriesAndCities [3][1] = "Brasilia";
//        countriesAndCities [4][0] = "Kenya";
//        countriesAndCities [4][1] = "Nairobi";
//
//        /*
//        Now we know that the country is stored at element 0
//        The matching capital at element 1
//        Here are two variables that reflect this
//        */
//                int country = 0;
//                int capital = 1;
//        // A quick for loop to ask 3 questions
//                for(int i = 0; i < 3; i++){
//        // get a random question number between 0 and 4
//                    questionNumber = randInt.nextInt(5);
//        // and ask the question and in this case just
//        // give the answer for the sake of brevity
//            Log.i("info", "The capital of "
//                    +countriesAndCities[questionNumber][country]);
//            Log.i("info", "is "
//                    +countriesAndCities[questionNumber][capital]);
//        } // end of for loop


//        // Declare a new ArrayList called myList to hold int variables
//        ArrayList<int> myList;
//        // Initialize the myList ready for use
//        myList = new ArrayList<int>();




        // declare and initialize a new ArrayList
        ArrayList<String> myList = new ArrayList<String>();

        // Add a new String to myList in the next available location
        myList.add("Donald Knuth");


        // And another
        myList.add("Rasmus Lerdorf");

        // And another
        myList.add("Richard Stallman");

        // We can also choose 'where' to add an entry
        myList.add(1, "James Gosling");

        // Is there anything in our ArrayList?
        if(myList.isEmpty()){
        // Nothing to see here
        }else{

            // Do something with the data
        }

        // How many items in our ArrayList?
        int numItems = myList.size();

        // Now where did I put James Gosling?
        int position = myList.indexOf("James Gosling");


        for (String s : myList){
            Log.i("Programmer: ","" + s);
        }








    }





}
