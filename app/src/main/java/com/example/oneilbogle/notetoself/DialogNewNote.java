package com.example.oneilbogle.notetoself;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

/**
 * Created by oneilbogle on 8/31/17.
 */

public class DialogNewNote extends DialogFragment {


    @Override
    public Dialog onCreateDialog(Bundle saveInstanceState) {


        //declare an initialize an AlertDialog.Builder object
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        //Initialize a layoutInflator object which inflate our xml
        LayoutInflater inflater = getActivity().getLayoutInflater();

        // Inflater.inflate replaces setConentView for our Xml
        View dialogView = inflater.inflate(R.layout.dialog_new_note, null);


        final EditText editTitle = (EditText) dialogView.findViewById
                (R.id.editTitle);

        final EditText editDescription = (EditText) dialogView.findViewById
                (R.id.editDescription);


        final CheckBox checkBoxIdea = (CheckBox) dialogView.findViewById
                (R.id.checkBoxIdea);

        final CheckBox checkBoxTodo = (CheckBox) dialogView.findViewById
                (R.id.checkBoxTodo);

        final CheckBox checkBoxImportant = (CheckBox) dialogView.findViewById
                (R.id.checkBoxImportant);


        Button btnCancel = (Button) dialogView.findViewById(R.id.btnCancel);

        Button btnOK = (Button) dialogView.findViewById(R.id.btnOK);


        builder.setView(dialogView).setMessage("Add a new note");

        // Handle the cancel button
        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });



        // Handle the OK button
        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                // Create a new note
                Note newNote = new Note();

                // Set its variables to match the users entries on the form
                newNote.setTitle(editTitle.getText().toString());
                newNote.setDescription(editDescription.getText().toString());
                newNote.setIdea(checkBoxIdea.isChecked());
                newNote.setTodo(checkBoxTodo.isChecked());
                newNote.setImportant(checkBoxImportant.isChecked());

                MainActivity callingActivity = (MainActivity) getActivity();

                // Pass newNote back to MainActivity
                //callingActivity.createNewNote(newNote);

                // Quit the dialog
                dismiss();
            }
        });


        return builder.create();


    }



}
